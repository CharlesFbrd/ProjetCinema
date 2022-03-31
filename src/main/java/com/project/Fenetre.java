package com.project;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Fenetre {
    private Connexion maconnexion = new Connexion("projet", "root","root");;

    ///FENETRE PRINCIPALE
    JFrame fenetrePrincipale = new JFrame();
    ImageIcon imageC = new ImageIcon("Logo.png");
    JLabel logo = new JLabel(imageC, JLabel.CENTER);
    JPanel connexion = new JPanel();
    JButton Invite = new JButton("Client Invite");
    JButton Membre = new JButton("Client Membre");
    JButton Administrateur = new JButton("Administrateur");
    ///////////////////////

    ///FENETRE CHOIX
    JFrame fenetreChoix = new JFrame();
    ImageIcon image3 = new ImageIcon("Logo.png");
    JLabel logo3 = new JLabel(image3, JLabel.CENTER);
    JPanel choix = new JPanel();
    JButton creerCompte = new JButton("Nouveau Membre");
    JButton seConnecter = new JButton("Ancien Membre");
    ///////////////////////

    ///FENETRE CREATION COMPTE
    JFrame fenetreCreationCompte = new JFrame();
    JPanel creation = new JPanel();
    ImageIcon imageC2 = new ImageIcon("Logo2.png");
    JLabel petitLogo = new JLabel(imageC2, JLabel.CENTER);
    JLabel nom = new JLabel("Nom : ", JLabel.CENTER);
    JLabel prenom = new JLabel("Prenom : ", JLabel.CENTER);
    JLabel identifiant = new JLabel("Id : ", JLabel.CENTER);
    JLabel motDePasse = new JLabel("Mdp : ", JLabel.CENTER);
    JTextField Nom = new JTextField();
    JTextField Prenom = new JTextField();
    JTextField id = new JTextField();
    JTextField mdp = new JTextField();
    JButton retour = new JButton("Retour");
    JButton creer = new JButton("Creer");
    ////////////////////////////

    ///FENETRE DE CONNEXION///////////
    JFrame fenetreDeConnexion = new JFrame();
    JPanel connecter = new JPanel();
    ImageIcon imageC3 = new ImageIcon("Logo2.png");
    JLabel logo4 = new JLabel(imageC3, JLabel.CENTER);
    JLabel ID = new JLabel("ID : ", JLabel.CENTER);
    JLabel PW = new JLabel("PW : ", JLabel.CENTER);
    JTextField Id = new JTextField();
    JTextField Pw = new JTextField();
    JButton retour2 = new JButton("Retour");
    JButton seConnecter2 = new JButton("Connexion");
    JComboBox categorie = new JComboBox();
    //////////////////////////////////

    ///FENETRE ACCUEIL///////////////
    JFrame fenetreAcceuil = new JFrame();
    JPanel cinema = new JPanel();
    JPanel Sfilm1 = new JPanel();
    JPanel Sfilm2 = new JPanel();
    JPanel Sfilm3 = new JPanel();
    JPanel Sfilm4 = new JPanel();
    JPanel Sfilm5 = new JPanel();
    JPanel Sfilm6 = new JPanel();
    JPanel Sfilm7 = new JPanel();
    JPanel Sfilm8 = new JPanel();

    Film F1 = new Film();
    Film F2 = new Film();
    Film F3 = new Film();
    Film F4 = new Film();
    Film F5 = new Film();
    Film F6 = new Film();
    Film F7 = new Film();
    Film F8 = new Film();




    JButton Seance1F1 = new JButton("8h30");
    JButton Seance2F1 = new JButton("12h30");
    JButton Seance3F1 = new JButton("16h30");
    JButton Seance4F1 = new JButton("20h30");
    JButton Seance1F2 = new JButton("8h30");
    JButton Seance2F2 = new JButton("12h30");
    JButton Seance3F2 = new JButton("16h30");
    JButton Seance4F2 = new JButton("20h30");
    JButton Seance1F3 = new JButton("8h30");
    JButton Seance2F3 = new JButton("12h30");
    JButton Seance3F3 = new JButton("16h30");
    JButton Seance4F3 = new JButton("20h30");
    JButton Seance1F4 = new JButton("8h30");
    JButton Seance2F4 = new JButton("12h30");
    JButton Seance3F4 = new JButton("16h30");
    JButton Seance4F4 = new JButton("20h30");
    JButton Seance1F5 = new JButton("8h30");
    JButton Seance2F5 = new JButton("12h30");
    JButton Seance3F5 = new JButton("16h30");
    JButton Seance4F5 = new JButton("20h30");
    JButton Seance1F6 = new JButton("8h30");
    JButton Seance2F6 = new JButton("12h30");
    JButton Seance3F6 = new JButton("16h30");
    JButton Seance4F6 = new JButton("20h30");
    JButton Seance1F7 = new JButton("8h30");
    JButton Seance2F7 = new JButton("12h30");
    JButton Seance3F7 = new JButton("16h30");
    JButton Seance4F7 = new JButton("20h30");
    JButton Seance1F8 = new JButton("8h30");
    JButton Seance2F8 = new JButton("12h30");
    JButton Seance3F8 = new JButton("16h30");
    JButton Seance4F8 = new JButton("20h30");
    /////////////////////////////////////////////

    ///FENETRE CONFIRMATION CREATION COMPTE//////
    JFrame fenetreConfirmationCreationCompte = new JFrame();
    JPanel confirmation = new JPanel();
    JLabel confirmationCreation = new JLabel("Votre compte a bien été crée!", JLabel.CENTER);
    JButton ok = new JButton("OK");
    ImageIcon imageC4 = new ImageIcon("Logo.png");
    JLabel logo5 = new JLabel(imageC4, JLabel.CENTER);
    /////////////////////////////////////////////

    Client client = new Client();
    ClientMembre clientMembre = new ClientMembre();
    boolean testConnexion = false;
    int reduction = 0;

    public Fenetre() throws SQLException, ClassNotFoundException {

        Color jaunePale = new Color(255, 251, 220);
        Color jaune = new Color(255, 215, 0);
        ///FENETRE PRINCIPALE//////////
        fenetrePrincipale.setLayout(new BorderLayout());
        fenetrePrincipale.setBackground(jaunePale);
        fenetrePrincipale.setBounds(0, 0, 800, 700);
        fenetrePrincipale.setTitle("Cinema UGECE Paris");
        fenetrePrincipale.setResizable(true);

        connexion.setLayout(new GridBagLayout());
        connexion.setBackground(jaunePale);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 5;
        gbc.weighty = 5;
        ///gbc.fill = GridBagConstraints.BOTH;
        Invite.setBackground(jaune);
        Invite.setForeground(Color.BLACK);
        Invite.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Invite.setFont(new Font("Arial", Font.BOLD, 20));
        Membre.setBackground(jaune);
        Membre.setForeground(Color.BLACK);
        Membre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Membre.setFont(new Font("Arial", Font.BOLD, 20));
        Administrateur.setBackground(jaune);
        Administrateur.setForeground(Color.BLACK);
        Administrateur.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Administrateur.setFont(new Font("Arial", Font.BOLD, 20));

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        connexion.add(logo3, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        connexion.add(Invite, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 120;
        gbc.ipady = 30;
        connexion.add(Membre, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipadx = 120;
        gbc.ipady = 30;
        connexion.add(Administrateur,gbc);

        fenetrePrincipale.getContentPane().add(connexion, BorderLayout.CENTER);

        fenetrePrincipale.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
        fenetrePrincipale.setVisible(true);

        Invite.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetrePrincipale.setVisible(false);
                fenetreAcceuil.setVisible(true);
            }

        });
        Membre.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetrePrincipale.setVisible(false);
                fenetreChoix.setVisible(true);
            }

        });
        /*Administrateur.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetrePrincipale.setVisible(false);
                fenetreAdmin.setVisible(true);
            }

        });*/
        //////////////////////////////////

        ///FENETRE CHOIX//////////////////
        fenetreChoix.setLayout(new BorderLayout());
        fenetreChoix.setBackground(jaunePale);
        fenetreChoix.setBounds(0, 0, 800, 700);
        fenetreChoix.setTitle("Cinema UGECE Paris");
        fenetreChoix.setResizable(true);

        choix.setLayout(new GridBagLayout());
        choix.setBackground(jaunePale);

        gbc.weightx = 5;
        gbc.weighty = 5;
        creerCompte.setBackground(jaune);
        creerCompte.setForeground(Color.BLACK);
        creerCompte.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        creerCompte.setFont(new Font("Arial", Font.BOLD, 20));
        seConnecter.setBackground(jaune);
        seConnecter.setForeground(Color.BLACK);
        seConnecter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        seConnecter.setFont(new Font("Arial", Font.BOLD, 20));

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        choix.add(logo, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        choix.add(creerCompte, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 160;
        gbc.ipady = 30;
        choix.add(seConnecter, gbc);

        fenetreChoix.getContentPane().add(choix, BorderLayout.CENTER);

        fenetreChoix.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
        fenetreChoix.setVisible(false);
        creerCompte.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreChoix.setVisible(false);
                fenetreCreationCompte.setVisible(true);
            }

        });
        seConnecter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreChoix.setVisible(false);
                fenetreDeConnexion.setVisible(true);
            }

        });
        ////////////////////////////////

        ///FENETRE CREATION COMPTE//////
        fenetreCreationCompte.setLayout(new BorderLayout());
        fenetreCreationCompte.setBackground(jaunePale);
        fenetreCreationCompte.setBounds(0, 0, 800, 700);
        fenetreCreationCompte.setTitle("Cinema UGECE Paris");
        fenetreCreationCompte.setResizable(true);

        creation.setLayout(new GridBagLayout());
        creation.setBackground(jaunePale);

        gbc.weightx = 3;
        gbc.weighty = 7;
        retour.setBackground(jaune);
        retour.setForeground(Color.BLACK);
        retour.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        retour.setFont(new Font("Arial", Font.BOLD, 20));
        creer.setBackground(jaune);
        creer.setForeground(Color.BLACK);
        creer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        creer.setFont(new Font("Arial", Font.BOLD, 20));
        categorie.addItem("Regulier");
        categorie.addItem("Senior");
        categorie.addItem("Enfant");
        categorie.setBackground(jaune);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        creation.add(petitLogo, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 100;
        gbc.ipady = 15;
        creation.add(categorie, gbc);


        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 100;
        gbc.ipady = 15;
        creation.add(nom, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        creation.add(Nom, gbc);


        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipadx = 100;
        gbc.ipady = 15;
        creation.add(prenom, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        creation.add(Prenom, gbc);

        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.ipadx = 100;
        gbc.ipady = 15;
        creation.add(identifiant, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        creation.add(id, gbc);

        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.ipadx = 100;
        gbc.ipady = 15;
        creation.add(motDePasse, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        creation.add(mdp, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.ipadx = 100;
        gbc.ipady = 30;
        creation.add(retour,gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.ipadx = 100;
        gbc.ipady = 30;
        creation.add(creer,gbc);

        fenetreCreationCompte.getContentPane().add(creation, BorderLayout.CENTER);

        fenetreCreationCompte.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
        fenetreCreationCompte.setVisible(false);
        retour.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreCreationCompte.setVisible(false);
                fenetreChoix.setVisible(true);
            }

        });
        creer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreCreationCompte.setVisible(false);
                try {
                    System.out.println((String) categorie.getItemAt(categorie.getSelectedIndex()));
                    maconnexion.ecrireClientMembre(Nom.getText(), Prenom.getText(), (String) categorie.getItemAt(categorie.getSelectedIndex()), id.getText(), mdp.getText());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                fenetreConfirmationCreationCompte.setVisible(true);
            }

        });
        ///////////////////////////////////////

        ///FENETRE CONFIRMATION CREATION COMPTE///
        fenetreConfirmationCreationCompte.setLayout(new BorderLayout());
        fenetreConfirmationCreationCompte.setBackground(jaunePale);
        fenetreConfirmationCreationCompte.setBounds(0, 0, 800, 700);
        fenetreConfirmationCreationCompte.setTitle("Cinema UGECE Paris");
        fenetreConfirmationCreationCompte.setResizable(true);

        confirmation.setLayout(new GridBagLayout());
        confirmation.setBackground(jaunePale);

        gbc.weightx = 3;
        gbc.weighty = 3;
        ok.setBackground(jaune);
        ok.setForeground(Color.BLACK);
        ok.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        ok.setFont(new Font("Arial", Font.BOLD, 20));
        confirmationCreation.setFont(new Font("Arial", Font.BOLD, 20));

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        confirmation.add(logo5, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 300;
        gbc.ipady = 30;
        confirmation.add(confirmationCreation, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        confirmation.add(ok, gbc);

        fenetreConfirmationCreationCompte.getContentPane().add(confirmation, BorderLayout.CENTER);

        fenetreConfirmationCreationCompte.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
        fenetreConfirmationCreationCompte.setVisible(false);

        ok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreConfirmationCreationCompte.setVisible(false);
                fenetrePrincipale.setVisible(true);
            }

        });

        ///FENETRE DE CONNEXION////////////////
        fenetreDeConnexion.setLayout(new BorderLayout());
        fenetreDeConnexion.setBackground(jaunePale);
        fenetreDeConnexion.setBounds(0, 0, 800, 700);
        fenetreDeConnexion.setTitle("Cinema UGECE Paris");
        fenetreDeConnexion.setResizable(true);

        connecter.setLayout(new GridBagLayout());
        connecter.setBackground(jaunePale);

        gbc.weightx = 3;
        gbc.weighty = 3;
        retour2.setBackground(jaune);
        retour2.setForeground(Color.BLACK);
        retour2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        retour2.setFont(new Font("Arial", Font.BOLD, 20));
        seConnecter2.setBackground(jaune);
        seConnecter2.setForeground(Color.BLACK);
        seConnecter2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        seConnecter2.setFont(new Font("Arial", Font.BOLD, 20));

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        connecter.add(logo4, gbc);


        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 100;
        gbc.ipady = 15;
        connecter.add(ID, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        connecter.add(Id, gbc);


        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 100;
        gbc.ipady = 15;
        connecter.add(PW, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        connecter.add(Pw, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipadx = 100;
        gbc.ipady = 30;
        connecter.add(retour2,gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.ipadx = 80;
        gbc.ipady = 30;
        connecter.add(seConnecter2,gbc);

        fenetreDeConnexion.getContentPane().add(connecter, BorderLayout.CENTER);

        fenetreDeConnexion.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
        fenetreDeConnexion.setVisible(false);
        retour2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreDeConnexion.setVisible(false);
                fenetreChoix.setVisible(true);
            }

        });
        seConnecter2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                try {
                    testConnexion = maconnexion.connexionMembre(Id.getText(), Pw.getText());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if(testConnexion == true){
                    fenetreDeConnexion.setVisible(false);
                    fenetreAcceuil.setVisible(true);
                }else{
                    JLabel mdpFaux = new JLabel("Identifiant ou Mot de passe incorrect!");
                    mdpFaux.setFont(new Font("Arial", Font.BOLD, 15));
                    mdpFaux.setBackground(jaunePale);
                    mdpFaux.setForeground(Color.RED);
                    gbc.anchor = GridBagConstraints.CENTER;
                    gbc.weightx = 3;
                    gbc.weighty = 3;
                    gbc.gridx = 1;
                    gbc.gridy = 2;
                    gbc.ipadx = 100;
                    gbc.ipady = 15;
                    connecter.add(mdpFaux,gbc);
                    fenetreDeConnexion.setVisible(false);
                    fenetreDeConnexion.getContentPane().add(connecter, BorderLayout.CENTER);
                    fenetreDeConnexion.setVisible(true);
                }
            }

        });


        ///FENETRE ACCUEIL//////////////////
        F1 = maconnexion.recupFilm("Avatar");
        F2 = maconnexion.recupFilm("Avengers: EndGame");
        F3 = maconnexion.recupFilm("Jurassic World");
        F4 = maconnexion.recupFilm("Le Roi Lion");
        F5 = maconnexion.recupFilm("Spider-Man: No Way Home");
        F6 = maconnexion.recupFilm("Star Wars VII: Le Réveil de la Force");
        F7 = maconnexion.recupFilm("The Dark Knight : Le Chevalier Noir");
        F8 = maconnexion.recupFilm("Titanic");

        JLabel nomF1 = new JLabel(F1.getNom(), JLabel.CENTER);
        JLabel nomF2 = new JLabel(F2.getNom(), JLabel.CENTER);
        JLabel nomF3 = new JLabel(F3.getNom(), JLabel.CENTER);
        JLabel nomF4 = new JLabel(F4.getNom(), JLabel.CENTER);
        JLabel nomF5 = new JLabel(F5.getNom(), JLabel.CENTER);
        JLabel nomF6 = new JLabel(F6.getNom(), JLabel.CENTER);
        JLabel nomF7 = new JLabel(F7.getNom(), JLabel.CENTER);
        JLabel nomF8 = new JLabel(F8.getNom(), JLabel.CENTER);

        JLabel dureeF1 = new JLabel("Duree : "+F1.getDureeHeure()+"h"+F1.getDureeMinute(), JLabel.CENTER);
        JLabel dureeF2 = new JLabel("Duree : "+F2.getDureeHeure()+"h"+F2.getDureeMinute(), JLabel.CENTER);
        JLabel dureeF3 = new JLabel("Duree : "+F3.getDureeHeure()+"h"+F3.getDureeMinute(), JLabel.CENTER);
        JLabel dureeF4 = new JLabel("Duree : "+F4.getDureeHeure()+"h"+F4.getDureeMinute(), JLabel.CENTER);
        JLabel dureeF5 = new JLabel("Duree : "+F5.getDureeHeure()+"h"+F5.getDureeMinute(), JLabel.CENTER);
        JLabel dureeF6 = new JLabel("Duree : "+F6.getDureeHeure()+"h"+F6.getDureeMinute(), JLabel.CENTER);
        JLabel dureeF7 = new JLabel("Duree : "+F7.getDureeHeure()+"h"+F7.getDureeMinute(), JLabel.CENTER);
        JLabel dureeF8 = new JLabel("Duree : "+F8.getDureeHeure()+"h"+F8.getDureeMinute(), JLabel.CENTER);

        JLabel descF1 = new JLabel("Synopsis : "+F1.getDesc(), JLabel.CENTER);
        JLabel descF2 = new JLabel("Synopsis : "+F2.getDesc(), JLabel.CENTER);
        JLabel descF3 = new JLabel("Synopsis : "+F3.getDesc(), JLabel.CENTER);
        JLabel descF4 = new JLabel("Synopsis : "+F4.getDesc(), JLabel.CENTER);
        JLabel descF5 = new JLabel("Synopsis : "+F5.getDesc(), JLabel.CENTER);
        JLabel descF6 = new JLabel("Synopsis : "+F6.getDesc(), JLabel.CENTER);
        JLabel descF7 = new JLabel("Synopsis : "+F7.getDesc(), JLabel.CENTER);
        JLabel descF8 = new JLabel("Synopsis : "+F8.getDesc(), JLabel.CENTER);

        ImageIcon bordereau = new ImageIcon("Bordereau.png");
        JLabel logoAccueil = new JLabel(bordereau, JLabel.CENTER);
        ImageIcon imageF1 = new ImageIcon(F1.getImage());
        JLabel logoF1 = new JLabel(imageF1, JLabel.CENTER);
        ImageIcon imageF2 = new ImageIcon(F2.getImage());
        JLabel logoF2 = new JLabel(imageF2, JLabel.CENTER);
        ImageIcon imageF3 = new ImageIcon(F3.getImage());
        JLabel logoF3 = new JLabel(imageF3, JLabel.CENTER);
        ImageIcon imageF4 = new ImageIcon(F4.getImage());
        JLabel logoF4 = new JLabel(imageF4, JLabel.CENTER);
        ImageIcon imageF5 = new ImageIcon(F5.getImage());
        JLabel logoF5 = new JLabel(imageF5, JLabel.CENTER);
        ImageIcon imageF6 = new ImageIcon(F6.getImage());
        JLabel logoF6 = new JLabel(imageF6, JLabel.CENTER);
        ImageIcon imageF7 = new ImageIcon(F7.getImage());
        JLabel logoF7 = new JLabel(imageF7, JLabel.CENTER);
        ImageIcon imageF8 = new ImageIcon(F8.getImage());
        JLabel logoF8 = new JLabel(imageF8, JLabel.CENTER);

        fenetreAcceuil.setLayout(new BorderLayout());
        fenetreAcceuil.setBackground(jaunePale);
        fenetreAcceuil.setBounds(0, 0,  1280, 1100);
        fenetreAcceuil.setTitle("Cinema UGECE Paris");
        fenetreAcceuil.setResizable(true);

        cinema.setLayout(new GridBagLayout());
        cinema.setBackground(jaunePale);
        gbc.weightx = 6;
        gbc.weighty = 5;

        nomF1.setFont(new Font("Arial", Font.BOLD, 15));
        dureeF1.setFont(new Font("Arial", Font.BOLD, 15));
        nomF2.setFont(new Font("Arial", Font.BOLD, 15));
        dureeF2.setFont(new Font("Arial", Font.BOLD, 15));
        nomF3.setFont(new Font("Arial", Font.BOLD, 15));
        dureeF3.setFont(new Font("Arial", Font.BOLD, 15));
        nomF4.setFont(new Font("Arial", Font.BOLD, 15));
        dureeF4.setFont(new Font("Arial", Font.BOLD, 15));
        nomF5.setFont(new Font("Arial", Font.BOLD, 15));
        dureeF5.setFont(new Font("Arial", Font.BOLD, 15));
        nomF6.setFont(new Font("Arial", Font.BOLD, 15));
        dureeF6.setFont(new Font("Arial", Font.BOLD, 15));
        nomF7.setFont(new Font("Arial", Font.BOLD, 15));
        dureeF7.setFont(new Font("Arial", Font.BOLD, 15));
        nomF8.setFont(new Font("Arial", Font.BOLD, 15));
        dureeF8.setFont(new Font("Arial", Font.BOLD, 15));

        Seance1F1.setBackground(jaune);
        Seance1F1.setForeground(Color.BLACK);
        Seance1F1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance1F1.setFont(new Font("Arial", Font.BOLD, 20));
        Seance2F1.setBackground(jaune);
        Seance2F1.setForeground(Color.BLACK);
        Seance2F1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance2F1.setFont(new Font("Arial", Font.BOLD, 20));
        Seance3F1.setBackground(jaune);
        Seance3F1.setForeground(Color.BLACK);
        Seance3F1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance3F1.setFont(new Font("Arial", Font.BOLD, 20));
        Seance4F1.setBackground(jaune);
        Seance4F1.setForeground(Color.BLACK);
        Seance4F1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance4F1.setFont(new Font("Arial", Font.BOLD, 20));

        Seance1F2.setBackground(jaune);
        Seance1F2.setForeground(Color.BLACK);
        Seance1F2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance1F2.setFont(new Font("Arial", Font.BOLD, 20));
        Seance2F2.setBackground(jaune);
        Seance2F2.setForeground(Color.BLACK);
        Seance2F2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance2F2.setFont(new Font("Arial", Font.BOLD, 20));
        Seance3F2.setBackground(jaune);
        Seance3F2.setForeground(Color.BLACK);
        Seance3F2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance3F2.setFont(new Font("Arial", Font.BOLD, 20));
        Seance4F2.setBackground(jaune);
        Seance4F2.setForeground(Color.BLACK);
        Seance4F2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance4F2.setFont(new Font("Arial", Font.BOLD, 20));

        Seance1F3.setBackground(jaune);
        Seance1F3.setForeground(Color.BLACK);
        Seance1F3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance1F3.setFont(new Font("Arial", Font.BOLD, 20));
        Seance2F3.setBackground(jaune);
        Seance2F3.setForeground(Color.BLACK);
        Seance2F3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance2F3.setFont(new Font("Arial", Font.BOLD, 20));
        Seance3F3.setBackground(jaune);
        Seance3F3.setForeground(Color.BLACK);
        Seance3F3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance3F3.setFont(new Font("Arial", Font.BOLD, 20));
        Seance4F3.setBackground(jaune);
        Seance4F3.setForeground(Color.BLACK);
        Seance4F3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance4F3.setFont(new Font("Arial", Font.BOLD, 20));

        Seance1F4.setBackground(jaune);
        Seance1F4.setForeground(Color.BLACK);
        Seance1F4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance1F4.setFont(new Font("Arial", Font.BOLD, 20));
        Seance2F4.setBackground(jaune);
        Seance2F4.setForeground(Color.BLACK);
        Seance2F4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance2F4.setFont(new Font("Arial", Font.BOLD, 20));
        Seance3F4.setBackground(jaune);
        Seance3F4.setForeground(Color.BLACK);
        Seance3F4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance3F4.setFont(new Font("Arial", Font.BOLD, 20));
        Seance4F4.setBackground(jaune);
        Seance4F4.setForeground(Color.BLACK);
        Seance4F4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance4F4.setFont(new Font("Arial", Font.BOLD, 20));

        Seance1F5.setBackground(jaune);
        Seance1F5.setForeground(Color.BLACK);
        Seance1F5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance1F5.setFont(new Font("Arial", Font.BOLD, 20));
        Seance2F5.setBackground(jaune);
        Seance2F5.setForeground(Color.BLACK);
        Seance2F5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance2F5.setFont(new Font("Arial", Font.BOLD, 20));
        Seance3F5.setBackground(jaune);
        Seance3F5.setForeground(Color.BLACK);
        Seance3F5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance3F5.setFont(new Font("Arial", Font.BOLD, 20));
        Seance4F5.setBackground(jaune);
        Seance4F5.setForeground(Color.BLACK);
        Seance4F5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance4F5.setFont(new Font("Arial", Font.BOLD, 20));

        Seance1F6.setBackground(jaune);
        Seance1F6.setForeground(Color.BLACK);
        Seance1F6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance1F6.setFont(new Font("Arial", Font.BOLD, 20));
        Seance2F6.setBackground(jaune);
        Seance2F6.setForeground(Color.BLACK);
        Seance2F6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance2F6.setFont(new Font("Arial", Font.BOLD, 20));
        Seance3F6.setBackground(jaune);
        Seance3F6.setForeground(Color.BLACK);
        Seance3F6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance3F6.setFont(new Font("Arial", Font.BOLD, 20));
        Seance4F6.setBackground(jaune);
        Seance4F6.setForeground(Color.BLACK);
        Seance4F6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance4F6.setFont(new Font("Arial", Font.BOLD, 20));

        Seance1F7.setBackground(jaune);
        Seance1F7.setForeground(Color.BLACK);
        Seance1F7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance1F7.setFont(new Font("Arial", Font.BOLD, 20));
        Seance2F7.setBackground(jaune);
        Seance2F7.setForeground(Color.BLACK);
        Seance2F7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance2F7.setFont(new Font("Arial", Font.BOLD, 20));
        Seance3F7.setBackground(jaune);
        Seance3F7.setForeground(Color.BLACK);
        Seance3F7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance3F7.setFont(new Font("Arial", Font.BOLD, 20));
        Seance4F7.setBackground(jaune);
        Seance4F7.setForeground(Color.BLACK);
        Seance4F7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance4F7.setFont(new Font("Arial", Font.BOLD, 20));

        Seance1F8.setBackground(jaune);
        Seance1F8.setForeground(Color.BLACK);
        Seance1F8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance1F8.setFont(new Font("Arial", Font.BOLD, 20));
        Seance2F8.setBackground(jaune);
        Seance2F8.setForeground(Color.BLACK);
        Seance2F8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance2F8.setFont(new Font("Arial", Font.BOLD, 20));
        Seance3F8.setBackground(jaune);
        Seance3F8.setForeground(Color.BLACK);
        Seance3F8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance3F8.setFont(new Font("Arial", Font.BOLD, 20));
        Seance4F8.setBackground(jaune);
        Seance4F8.setForeground(Color.BLACK);
        Seance4F8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Seance4F8.setFont(new Font("Arial", Font.BOLD, 20));

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 6;
        gbc.ipadx = 1280;
        gbc.ipady = 220;
        cinema.add(logoAccueil, gbc);

        gbc.anchor = GridBagConstraints.SOUTHEAST;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.ipadx = 160;
        gbc.ipady = 210;
        cinema.add(logoF1, gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        cinema.add(logoF2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        cinema.add(logoF3, gbc);
        gbc.gridx = 3;
        gbc.gridy = 2;
        cinema.add(logoF4, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        cinema.add(logoF5, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        cinema.add(logoF6, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        cinema.add(logoF7, gbc);
        gbc.gridx = 3;
        gbc.gridy = 4;
        cinema.add(logoF8, gbc);

        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 50;
        gbc.ipady = 15;
        cinema.add(nomF1, gbc);
        gbc.gridx = 4;
        gbc.gridy = 1;
        cinema.add(nomF2, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        cinema.add(nomF3, gbc);
        gbc.gridx = 4;
        gbc.gridy = 2;
        cinema.add(nomF4, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        cinema.add(nomF5, gbc);
        gbc.gridx = 4;
        gbc.gridy = 3;
        cinema.add(nomF6, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        cinema.add(nomF7, gbc);
        gbc.gridx = 4;
        gbc.gridy = 4;
        cinema.add(nomF8, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 50;
        gbc.ipady = 15;
        cinema.add(dureeF1, gbc);
        gbc.gridx = 4;
        gbc.gridy = 1;
        cinema.add(dureeF2, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        cinema.add(dureeF3, gbc);
        gbc.gridx = 4;
        gbc.gridy = 2;
        cinema.add(dureeF4, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        cinema.add(dureeF5, gbc);
        gbc.gridx = 4;
        gbc.gridy = 3;
        cinema.add(dureeF6, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        cinema.add(dureeF7, gbc);
        gbc.gridx = 4;
        gbc.gridy = 4;
        cinema.add(dureeF8, gbc);

        /*gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        cinema.add(descF1, gbc);
        gbc.gridx = 4;
        gbc.gridy = 1;
        cinema.add(descF2, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        cinema.add(descF3, gbc);
        gbc.gridx = 4;
        gbc.gridy = 2;
        cinema.add(descF4, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        cinema.add(descF5, gbc);
        gbc.gridx = 4;
        gbc.gridy = 3;
        cinema.add(descF6, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        cinema.add(descF7, gbc);
        gbc.gridx = 4;
        gbc.gridy = 4;
        cinema.add(descF8, gbc);*/
        Sfilm1.setLayout(new GridBagLayout());
        Sfilm2.setLayout(new GridBagLayout());
        Sfilm3.setLayout(new GridBagLayout());
        Sfilm4.setLayout(new GridBagLayout());
        Sfilm5.setLayout(new GridBagLayout());
        Sfilm6.setLayout(new GridBagLayout());
        Sfilm7.setLayout(new GridBagLayout());
        Sfilm8.setLayout(new GridBagLayout());

        Sfilm1.setBackground(jaunePale);
        Sfilm2.setBackground(jaunePale);
        Sfilm3.setBackground(jaunePale);
        Sfilm4.setBackground(jaunePale);
        Sfilm5.setBackground(jaunePale);
        Sfilm6.setBackground(jaunePale);
        Sfilm7.setBackground(jaunePale);
        Sfilm8.setBackground(jaunePale);

        gbc.weightx = 2;
        gbc.weighty = 2;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 50;
        gbc.ipady = 15;
        Sfilm1.add(Seance1F1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 40;
        gbc.ipady = 15;
        Sfilm1.add(Seance2F1, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        Sfilm1.add(Seance3F1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        Sfilm1.add(Seance4F1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 50;
        gbc.ipady = 15;
        Sfilm2.add(Seance1F2, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 40;
        gbc.ipady = 15;
        Sfilm2.add(Seance2F2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        Sfilm2.add(Seance3F2, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        Sfilm2.add(Seance4F2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 50;
        gbc.ipady = 15;
        Sfilm3.add(Seance1F3, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 40;
        gbc.ipady = 15;
        Sfilm3.add(Seance2F3, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        Sfilm3.add(Seance3F3, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        Sfilm3.add(Seance4F3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 50;
        gbc.ipady = 15;
        Sfilm4.add(Seance1F4, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 40;
        gbc.ipady = 15;
        Sfilm4.add(Seance2F4, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        Sfilm4.add(Seance3F4, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        Sfilm4.add(Seance4F4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 50;
        gbc.ipady = 15;
        Sfilm5.add(Seance1F5, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 40;
        gbc.ipady = 15;
        Sfilm5.add(Seance2F5, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        Sfilm5.add(Seance3F5, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        Sfilm5.add(Seance4F5, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 50;
        gbc.ipady = 15;
        Sfilm6.add(Seance1F6, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 40;
        gbc.ipady = 15;
        Sfilm6.add(Seance2F6, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        Sfilm6.add(Seance3F6, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        Sfilm6.add(Seance4F6, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 50;
        gbc.ipady = 15;
        Sfilm7.add(Seance1F7, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 40;
        gbc.ipady = 15;
        Sfilm7.add(Seance2F7, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        Sfilm7.add(Seance3F7, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        Sfilm7.add(Seance4F7, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 50;
        gbc.ipady = 15;
        Sfilm8.add(Seance1F8, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 40;
        gbc.ipady = 15;
        Sfilm8.add(Seance2F8, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        Sfilm8.add(Seance3F8, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        Sfilm8.add(Seance4F8, gbc);

        gbc.weightx = 6;
        gbc.weighty = 5;
        gbc.ipadx = 160;
        gbc.ipady = 210;

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 2;
        gbc.gridy = 1;
        cinema.add(Sfilm1, gbc);
        gbc.gridx = 5;
        gbc.gridy = 1;
        cinema.add(Sfilm2, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        cinema.add(Sfilm3, gbc);
        gbc.gridx = 5;
        gbc.gridy = 2;
        cinema.add(Sfilm4, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        cinema.add(Sfilm5, gbc);
        gbc.gridx = 5;
        gbc.gridy = 3;
        cinema.add(Sfilm6, gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        cinema.add(Sfilm7, gbc);
        gbc.gridx = 5;
        gbc.gridy = 4;
        cinema.add(Sfilm8, gbc);


        fenetreAcceuil.getContentPane().add(cinema, BorderLayout.CENTER);

        fenetreAcceuil.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
        fenetreAcceuil.setVisible(false);



    }
}
