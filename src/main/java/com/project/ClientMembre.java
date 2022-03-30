package com.project;

public class ClientMembre extends Client{
    private String Id;
    private String Pw;

    public ClientMembre(){

    }

    public String getId(){
        return Id;
    }

    public String getPw(){
        return Pw;
    }

    public void setId(String i){
        Id = i;
    }

    public void setPw(String p){
        Pw = p;
    }
}
