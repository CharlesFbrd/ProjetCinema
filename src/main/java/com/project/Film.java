package com.project;

public class Film {
    private String nom;
    private String dureeMinute;
    private String dureeHeure;
    private String description;
    private String image;

    public Film(){

    }

    public String getNom(){
        return nom;
    }

    public String getDureeMinute(){
        return dureeMinute;
    }

    public String getDureeHeure(){
        return dureeHeure;
    }

    public String getDesc(){
        return description;
    }

    public String getImage(){
        return image;
    }

    public void setNom(String n){
        nom = n;
    }

    public void setDureeMinute(String m){
        dureeMinute = m;
    }

    public void setDureeHeure(String h){
        dureeHeure = h;
    }

    public void setDesc(String d){
        description = d;
    }

    public void setImage(String i){
        image = i;
    }

}

