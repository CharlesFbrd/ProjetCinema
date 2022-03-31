package com.project;

public class ClientMembre extends Client{
    private String Id;
    private String Pw;
    private String categorie;

    public ClientMembre(){

    }

    public String getId(){
        return Id;
    }

    public String getPw(){
        return Pw;
    }

    public String getCategorie(){
        return categorie;
    }

    public void setId(String i){
        Id = i;
    }

    public void setPw(String p){
        Pw = p;
    }

    public void setCategorie(String c){
        categorie = c;
    }
}
