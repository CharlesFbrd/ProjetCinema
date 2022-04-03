package com.project;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Connexion {
    /**
     * Attributs prives : connexion JDBC, statement, ordre requete et resultat
     * requete
     */
    private final Connection conn;
    private final Statement stmt;
    private ResultSet rset;
    private ResultSetMetaData rsetMeta;
    /**
     * ArrayList public pour les tables
     */
    public ArrayList<String> tables = new ArrayList<>();
    /**
     * ArrayList public pour les requêtes de sélection
     */
    public ArrayList<String> requetes = new ArrayList<>();
    /**
     * ArrayList public pour les requêtes de MAJ
     */
    public ArrayList<String> requetesMaj = new ArrayList<>();

    public Connexion(String nameDatabase, String loginDatabase, String passwordDatabase) throws SQLException, ClassNotFoundException{
        // chargement driver "com.mysql.jdbc.Driver"
        Class.forName("com.mysql.cj.jdbc.Driver");

        // url de connexion "jdbc:mysql://localhost:3305/usernameECE"
        String urlDatabase = "jdbc:mysql://localhost:8889/" + nameDatabase +"?useUnicode=true\n" +
                "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&\n" +
                "serverTimezone=UTC&\n"
                +"autoReconnect=true&useSSL=false";
        // String urlDatabase = "jdbc:mysql://localhost:3308/jps?characterEncoding=latin1";

        //création d'une connexion JDBC à la base
        conn = DriverManager.getConnection(urlDatabase, loginDatabase, passwordDatabase);

        // création d'un ordre SQL (statement)
        stmt = conn.createStatement();
    }



    public Film recupFilm(String nomFilm) throws SQLException {
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery("select * from `FILM` where `Nom`='"+nomFilm+"'");

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();
        rset.first();

        Film temp = new Film();
        temp.setNom( rset.getString(1));
        temp.setDureeHeure(rset.getString(2));
        temp.setDureeMinute(rset.getString(3));
        temp.setDesc(rset.getString(4));
        temp.setImage(rset.getString(5));
        return temp;
    }

    public Séance recupSeance(int numSeance) throws SQLException {
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery("select * from `SEANCE` where `NumSeance`='"+numSeance+"'");

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();
        rset.first();

        Séance temp = new Séance();
        temp.setNum(rset.getInt(1));
        temp.setHoraireHeure(rset.getString(2));
        temp.setHoraireMinute(rset.getString(3));
        temp.setFilm(recupFilm(rset.getString(4)));
        temp.setSalle(recupSalle(rset.getInt(5)));
        return temp;
    }

    public Salle recupSalle(int numSalle) throws SQLException{
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery("select * from `SALLE` where `NumSalle`='"+numSalle+"'");

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();
        rset.first();

        Salle temp = new Salle();
        temp.setNum(rset.getInt(1));
        temp.ajouterSeance(recupSeance(rset.getInt(2)));
        temp.ajouterSeance(recupSeance(rset.getInt(3)));
        temp.ajouterSeance(recupSeance(rset.getInt(4)));
        temp.ajouterSeance(recupSeance(rset.getInt(5)));
        return temp;
    }

    public ClientMembre recupClient(String id) throws SQLException{
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery("select * from `MEMBRE` where `ID`='"+id+"'");

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();
        rset.first();

        ClientMembre temp = new ClientMembre();
        temp.setNom(rset.getString(1));
        temp.setPrenom(rset.getString(2));
        temp.setCategorie(rset.getString(3));
        temp.setId(rset.getString(4));
        temp.setPw(rset.getString(5));
        return temp;
    }

    public Admin recupAdmin(String id) throws SQLException{ // récupération des infos de l'admin pour la connexion
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery("select * from `MEMBRE` where `ID`='"+id+"'");

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();
        rset.first();

        Admin temp = new Admin();
        temp.setNom(rset.getString(1));
        temp.setPrenom(rset.getString(2));
        temp.setCategorieAdmin(rset.getString(3));
        temp.setId(rset.getString(4));
        temp.setPw(rset.getString(5));
        return temp;
    }

    public void ecrireFilm(String nom, String dureeh, String dureem, String desc, String image) throws SQLException {
        stmt.executeUpdate("INSERT INTO  `FILM` (`Nom`, `Heure`, `Minute`, `Description`, `Image`) VALUES ("+"'"+nom+"',"+"'"+dureeh+"',"+"'"+dureem+"',"+"'"+desc+"',"+"'"+image+".png"+"');");
    }
    public void supprimerFilm(String nom) throws SQLException {
        stmt.executeUpdate("DELETE FROM `FILM` WHERE `Nom`= '"+nom+"' ");
    }

    public void ecrireSeance(int num, int horaireh, int horairem, String nomFilm, int numSalle) throws SQLException {
        stmt.executeUpdate("INSERT INTO  `SEANCE` (`NumSeance`, `Heure`, `Minute`, `NomFilm`, `NumSalle`) VALUES  ("+"'"+num+"',"+"'"+horaireh+"',"+"'"+horairem+"',"+"'"+nomFilm+"','"+numSalle+"');");
    }
    public void ecrireSalle(int num, int s1, int s2, int s3, int s4) throws SQLException {
        stmt.executeUpdate("INSERT INTO  `SALLE` (`NumSalle`, `NumSeance1`, `NumSeance2`, `NumSeance3`, `NumSeance4`) VALUES  ("+"'"+num+"',"+"'"+s1+"',"+"'"+s2+"',"+"'"+s3+"','"+s4+"');");
    }
    public void ecrireBillet(int num, int prix, int reduc, int numSeance, String nomClient) throws SQLException {
        stmt.executeUpdate("INSERT INTO  `BILLET` (`Num`, `Prix`, `Reduction`, `NumSeance`, `NomClient`) VALUES  ("+"'"+num+"',"+"'"+prix+"',"+"'"+reduc+"',"+"'"+numSeance+"','"+nomClient+"');");
    }
    public void ecrireClientMembre(String nom, String prenom, String categorie, String ID, String PW) throws SQLException {
        stmt.executeUpdate("INSERT INTO  `MEMBRE` (`Nom`, `Prenom`, `Categorie`, `ID`, `PW`) VALUES  ("+"'"+nom+"',"+"'"+prenom+"',"+"'"+categorie+"',"+"'"+ID+"',"+"'"+PW+"');");
    }

    public boolean connexionMembre(String id, String pw) throws SQLException {
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery("select * from `MEMBRE` where `ID`='"+id+"'");

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();
        rset.first();
        if(pw.equals(rset.getString(5))){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean connexionAdmin(String id, String pw) throws SQLException { // connexion admin
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery("select * from `MEMBRE` where `ID`='"+id+"'");

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();
        rset.first();
        if(pw.equals(rset.getString(5)) && rset.getString(3).equals("cAdmin" )){ // condition pour vérifier que l'utilisateur qui se connecte est bien un admin
            return true;
        }
        else{
            return false;
        }
    }

    public void creationMembre(String nom, String prenom, String categorie, String ID, String PW) throws SQLException {
        ecrireClientMembre(nom,prenom, categorie, ID, PW);
    }


    public List<Integer> filmPopulaire() throws SQLException {
        rset = stmt.executeQuery("select `NumSeance` from `BILLET`");
        rset.first();
        int F1 = 0, F2 = 0, F3 = 0, F4 = 0, F5 = 0, F6 = 0, F7 = 0, F8 = 0;
        List<Integer> temp = new ArrayList<>();

        while(rset.next()){
            if(rset.getInt(1) == 1 || rset.getInt(1) == 9 || rset.getInt(1) == 17 || rset.getInt(1) == 25){
                F1++;
            }
            if(rset.getInt(1) == 2 || rset.getInt(1) == 10 || rset.getInt(1) == 18 || rset.getInt(1) == 26){
                F2++;
            }
            if(rset.getInt(1) == 3 || rset.getInt(1) == 11 || rset.getInt(1) == 19 || rset.getInt(1) == 27){
                F3++;
            }
            if(rset.getInt(1) == 4 || rset.getInt(1) == 12 || rset.getInt(1) == 20 || rset.getInt(1) == 28){
                F4++;
            }
            if(rset.getInt(1) == 5 || rset.getInt(1) == 13 || rset.getInt(1) == 21 || rset.getInt(1) == 29){
                F5++;
            }
            if(rset.getInt(1) == 6 || rset.getInt(1) == 14 || rset.getInt(1) == 22 || rset.getInt(1) == 30){
                F6++;
            }
            if(rset.getInt(1) == 7 || rset.getInt(1) == 15 || rset.getInt(1) == 23 || rset.getInt(1) == 31){
                F7++;
            }
            if(rset.getInt(1) == 8 || rset.getInt(1) == 16 || rset.getInt(1) == 24 || rset.getInt(1) == 32){
                F8++;
            }
            rset.next();

        }

        temp.add(F1);
        temp.add(F2);
        temp.add(F3);
        temp.add(F4);
        temp.add(F5);
        temp.add(F6);
        temp.add(F7);
        temp.add(F8);

        System.out.println( F1  + "/" + F2 + "/"+ F3 + "/" + F4 + "/" + F5 + "/" + F6 + "/" + F7 +"/" + F8);

        return temp;


    }




}


