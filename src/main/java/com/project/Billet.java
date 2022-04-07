package com.project;
///Classe permettant de creer les billets
public class Billet {
    private int num;
    private int prix;
    private int reduction;
    private String client;
    private int séance;

    ///Constructeur surcharge
    public Billet(int num, int p, int r, int s, String c){
        this.num = num;
        this.reduction = r;
        this.prix = p-r;
        this.client = c;
        this.séance = s;
    }

    ///Getters et Setters
    public int getNum(){
        return num;
    }

    public int getPrix(){
        return prix;
    }

    public int getReduc(){
        return reduction;
    }

    public String getClient(){
        return client;
    }

    public int getSeance(){
        return séance;
    }

    public void setNum(int n){
        num = n;
    }

    public void setPrix(int p){
        prix = p;
    }

    public void setReduc(int r){
        reduction = r;
    }

    public void setClient(String c){
        client = c;
    }

    public void setSeance(int s){
        séance = s;
    }
}
