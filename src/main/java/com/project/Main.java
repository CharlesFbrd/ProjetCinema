package com.project;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connexion conn = new Connexion("ProjetJava", "root","root");
        Fenetre cinema = new Fenetre();

        /*Film filmtest = new Film();
        filmtest = conn.recupFilm("Jurassic World");
        System.out.println(filmtest.getNom()+filmtest.getDureeHeure()+filmtest.getDureeMinute()+filmtest.getDesc()+filmtest.getImage());*/
    }
}
