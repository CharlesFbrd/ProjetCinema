package com.project;
import java.sql.SQLException;

public class Cinema {
    private String nom;

    public Cinema() throws SQLException {
        this.nom = "UGECE Paris";
    }

    public String getNom(){
        return nom;
    }

}