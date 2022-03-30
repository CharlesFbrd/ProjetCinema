package com.project;

public class Séance {
    private int numSeance;
    private String horaireHeure;
    private String horaireMinute;
    private Film film;
    private Salle salle;

    public Séance(){

    }
    public int getNum(){
        return numSeance;
    }
    public String getHoraireHeure(){
        return horaireHeure;
    }

    public String getHoraireMinute(){
        return horaireMinute;
    }

    public Film getFilm(){
        return film;
    }

    public Salle getSalle(){
        return salle;
    }

    public void setNum(int n){
        numSeance = n;
    }

    public void setHoraireHeure(String h){
        horaireHeure = h;
    }

    public void setHoraireMinute(String h){
        horaireMinute = h;
    }

    public void setFilm(Film f){
        film = f;
    }

    public void setSalle(Salle s){
        salle = s;
    }
}

