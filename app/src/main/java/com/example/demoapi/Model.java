package com.example.demoapi;

import java.util.ArrayList;

public class Model {
    private String page;
    private String per_page;
    private String total;
    private String total_page;
    private ArrayList<data> data;

    public Model(String page, String per_page, String total, String total_page, ArrayList<Model.data> data) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_page = total_page;
        this.data = data;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPer_page() {
        return per_page;
    }

    public void setPer_page(String per_page) {
        this.per_page = per_page;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal_page() {
        return total_page;
    }

    public void setTotal_page(String total_page) {
        this.total_page = total_page;
    }

    public ArrayList<Model.data> getData() {
        return data;
    }

    public void setData(ArrayList<Model.data> data) {
        this.data = data;
    }

    public  class  data{
    private String id;
    private String email;
    private String firt_name;
    private String last_name;
    private  String avatar;


        public data(String id, String email, String firt_name, String last_name, String avatar) {
            this.id = id;
            this.email = email;
            this.firt_name = firt_name;
            this.last_name = last_name;
            this.avatar = avatar;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFirt_name() {
            return firt_name;
        }

        public void setFirt_name(String firt_name) {
            this.firt_name = firt_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }
}
