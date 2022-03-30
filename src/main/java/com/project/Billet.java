package com.project;

public class Billet {
    private int num;
    private int prix;
    private int reduction;
    private Client client;
    private Séance séance;

    public Billet(int num, int p, int r, Client c, Séance s){
        this.num = num;
        this.reduction = r;
        this.prix = p-r;
        this.client = c;
        this.séance = s;
    }

    public int getPrix(){
        return prix;
    }

    public int getReduc(){
        return reduction;
    }

    public Client getClient(){
        return client;
    }

    public Séance getSeance(){
        return séance;
    }

    public void setPrix(int p){
        prix = p;
    }

    public void setReduc(int r){
        reduction = r;
    }

    public void setClient(Client c){
        client = c;
    }

    public void setSeance(Séance s){
        séance = s;
    }
}
