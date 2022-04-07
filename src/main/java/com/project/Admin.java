package com.project;


public class Admin extends Client{

    private String IdAdmin;
    private String PwAdmin;
    private String categorieA = "cAdmin";

    public Admin(){

    }

    public String getId(){
        return IdAdmin;
    }

    public String getPw(){
        return PwAdmin;
    }

    public String getCategorieA(){
        return categorieA;
    }


    public void setId(String i){
        IdAdmin = i;
    }

    public void setPw(String p){
        PwAdmin = p;
    }


    public void setCategorieAdmin(String p){
        categorieA = p;
    }



}
