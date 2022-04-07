package com.project;
///Classe client membre heritant de la classe client mais ayant une id et un mdp en plus
public class ClientMembre extends Client{
    private String Id;
    private String Pw;
    private String categorie;

    ///Constructeur par defaut
    public ClientMembre(){

    }

    ///Getters et Setters
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
