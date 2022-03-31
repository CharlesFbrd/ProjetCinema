package com.project;
import java.sql.*;
import java.util.ArrayList;

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
        String urlDatabase = "jdbc:mysql://localhost:3308/" + nameDatabase +"?useUnicode=true\n" +
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

    public void ecrireFilm(String nom, int dureeh, int dureem, String desc, String image) throws SQLException {
        stmt.executeUpdate("INSERT INTO  `FILM` (`Nom`, `Heure`, `Minute`, `Description`) VALUES ("+"'"+nom+"',"+"'"+dureeh+"',"+"'"+dureem+"',"+"'"+desc+"',"+"'"+image+".png"+"');");
    }
    public void ecrireSeance(int num, int horaireh, int horairem, String nomFilm, int numSalle) throws SQLException {
        stmt.executeUpdate("INSERT INTO  `SEANCE` (`NumSeance`, `Heure`, `Minute`, `NomFilm`, `NumSalle`) VALUES  ("+"'"+num+"',"+"'"+horaireh+"',"+"'"+horairem+"',"+"'"+nomFilm+"',"+numSalle+"');");
    }
    public void ecrireSalle(int num, int s1, int s2, int s3, int s4) throws SQLException {
        stmt.executeUpdate("INSERT INTO  `SALLE` (`NumSalle`, `NumSeance1`, `NumSeance2`, `NumSeance3`, `NumSeance4`) VALUES  ("+"'"+num+"',"+"'"+s1+"',"+"'"+s2+"',"+"'"+s3+"',"+s4+"');");
    }
    public void ecrireBillet(int num, int prix, int reduc, int numSeance, int nomClient) throws SQLException {
        stmt.executeUpdate("INSERT INTO  `BILLET` (`Num`, `Prix`, `Reduction`, `NumSeance`, `NomClient`) VALUES  ("+"'"+num+"',"+"'"+prix+"',"+"'"+reduc+"',"+"'"+numSeance+"',"+nomClient+"');");
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

    public void creationMembre(String nom, String prenom, String categorie, String ID, String PW) throws SQLException {
        ecrireClientMembre(nom,prenom, categorie, ID, PW);
    }

    /**
     * Méthode qui ajoute la table en parametre dans son ArrayList
     *
     * @param table
     */
    public void ajouterTable(String table) {
        tables.add(table);
    }

    /**
     * Méthode qui ajoute la requete de selection en parametre dans son
     * ArrayList
     *
     * @param requete
     */
    public void ajouterRequete(String requete) {
        requetes.add(requete);
    }

    /**
     * Méthode qui ajoute la requete de MAJ en parametre dans son
     * ArrayList
     *
     * @param requete
     */
    public void ajouterRequeteMaj(String requete) {
        requetesMaj.add(requete);
    }

    /**
     * Méthode qui retourne l'ArrayList des champs de la table en parametre
     *
     * @param table
     * @return
     * @throws java.sql.SQLException
     */
    public ArrayList remplirChampsTable(String table) throws SQLException {
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery("select * from " + table);

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();

        // calcul du nombre de colonnes du resultat
        int nbColonne = rsetMeta.getColumnCount();

        // creation d'une ArrayList de String
        ArrayList<String> liste;
        liste = new ArrayList<>();
        String champs = "";
        // Ajouter tous les champs du resultat dans l'ArrayList
        for (int i = 0; i < nbColonne; i++) {
            champs = champs + " " + rsetMeta.getColumnLabel(i + 1);
        }

        // ajouter un "\n" à la ligne des champs
        champs = champs + "\n";

        // ajouter les champs de la ligne dans l'ArrayList
        liste.add(champs);

        // Retourner l'ArrayList
        return liste;
    }

    /**
     * Methode qui retourne l'ArrayList des champs de la requete en parametre
     * @param requete
     * @return
     * @throws java.sql.SQLException
     */
    public ArrayList remplirChampsRequete(String requete) throws SQLException {
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery(requete);

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();

        // calcul du nombre de colonnes du resultat
        int nbColonne = rsetMeta.getColumnCount();

        // creation d'une ArrayList de String
        ArrayList<String> liste;
        liste = new ArrayList<>();

        // tant qu'il reste une ligne
        while (rset.next()) {
            String champs;
            champs = rset.getString(1); // ajouter premier champ

            // Concatener les champs de la ligne separes par ,
            for (int i = 1; i < nbColonne; i++) {
                champs = champs + "," + rset.getString(i + 1);
            }

            // ajouter un "\n" à la ligne des champs
            champs = champs + "\n";

            // ajouter les champs de la ligne dans l'ArrayList
            liste.add(champs);
        }

        // Retourner l'ArrayList
        return liste;
    }

    /**
     * Méthode qui execute une requete de MAJ en parametre
     * @param requeteMaj
     * @throws java.sql.SQLException
     */
    public void executeUpdate(String requeteMaj) throws SQLException {
        stmt.executeUpdate(requeteMaj);
    }
}
