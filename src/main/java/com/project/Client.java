package com.project;
import java.util.*;
///Classe permettant de gerer les clients invites
public class Client {
    private String nom;
    private String prenom;
    private List<Billet> billets = new ArrayList();

    ///Constructeur par defaut qui appelle le client Default User
    public Client(){
        this.nom = "Default";
        this.prenom = "User";
    }

    ///Getters et Setters
    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public List<Billet> getBillets(){
        return billets;
    }

    public Billet getBillet(int i){
        return billets.get(i);
    }

    public void setNom(String n){
        nom = n;
    }

    public void setPrenom(String p){
        prenom = p;
    }

    public void setBillets(List<Billet> b){
        billets = b;
    }

    public void setBillet(Billet b){
        billets.add(b);
    }
}

