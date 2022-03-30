package com.project;
import java.util.*;

public class Salle {
    private int numero;
    private List<Séance> seances = new ArrayList<>();

    public Salle(){

    }

    public int getNum(){
        return numero;
    }

    public List<Séance> getSeances(){
        return seances;
    }

    public Séance getSeance(int i){
        return seances.get(i);
    }

    public void setNum(int n){
        numero = n;
    }

    public void setSeances(List<Séance> s){
        seances = s;
    }

    public void setSeance(Séance s, int i){
        seances.set(i,s);
    }

    public void ajouterSeance(Séance s){
        seances.add(s);
    }
}

