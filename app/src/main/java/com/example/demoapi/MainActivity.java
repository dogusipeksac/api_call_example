package com.example.demoapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.dataTxt);
    }

    public void getData(View view) {
        Methods methods=RetrofitClient.getRetrofitIntance().create(Methods.class);
        Call<Model> call=methods.getAllData();
        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                List<String> list = new ArrayList<>();
                ArrayList<Model.data> data=response.body().getData();
                for(Model.data data1 : data){
                  list.add(data1.getEmail());
                }
                String a=null;
                for(int i=0 ; i<list.size();i++){

                    a=a+"\n"+list.get(i);
                }
                textView.setText(a);

            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {

            }
        });
    }
}