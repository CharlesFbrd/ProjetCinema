package com.project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.List;

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

    /// FENETRE - connexion en tant qu'admin
    JFrame fenetreDeConnexionAdmin = new JFrame();
    JPanel connecterAdmin = new JPanel();
    ImageIcon imageConnexAdmin = new ImageIcon("Logo2.png");
    JLabel logoConnexAdmin = new JLabel(imageConnexAdmin, JLabel.CENTER);
    JLabel IDAdmin = new JLabel("ID : ", JLabel.CENTER);
    JLabel PWAdmin = new JLabel("PW : ", JLabel.CENTER);
    JTextField IdAdmin = new JTextField();
    JTextField PwAdmin = new JTextField();
    JButton retourConnexAdmin = new JButton("Retour");
    JButton seConnecterAdmin = new JButton("Connexion");
    //////////////////////////////////

    ///FENETRE ADMIN -  options fonctionnalités profil employé / admin
    JFrame fenetreAdmin = new JFrame(); // création d'un panel pour la fenêtre
    ImageIcon imageAdmin = new ImageIcon("Logo.png"); // on charge le logo
    JLabel logoAdmin = new JLabel(imageAdmin, JLabel.CENTER);
    JPanel choixAdmin = new JPanel(); // création d'un panel pour les boutons
    JButton majFilms = new JButton("Mettre à jour les films à l'affiche"); ///Mettre à jour la liste des films
    JButton ajoutReduc = new JButton("Ajouter une offre de réduction");
    JButton filmsPop = new JButton("Consulter les films populaires");
    JButton dossiersClients = new JButton("Consulter le dossier d'un client");
    JButton deconnexion = new JButton("Déconnexion");
    ////////////////////////////////


    ///FENETRE ADMIN -  Mettre à jour la liste des films
    JFrame fenetreMajFilms = new JFrame(); // création d'un panel pour la fenêtre
    ImageIcon imageMaj = new ImageIcon("Logo2.png"); // on charge le logo
    JLabel logoMaj = new JLabel(imageMaj, JLabel.CENTER); // on crée une zone pour le logo
    JPanel choixOptionFilm = new JPanel(); // création d'un panel pour les boutons
    JButton ajoutFilm = new JButton("Ajouter un film");
    JButton suppFilm = new JButton("Supprimer un film");
    JButton retourMaj = new JButton("Retour");
    ////////////////////////////////


    ///FENETRE ADMIN -  Supprimer un film
    JFrame fenetreSuppFilm = new JFrame(); // création d'un panel pour la fenêtre
    ImageIcon imageSuppFilm = new ImageIcon("Logo2.png"); // on charge le logo
    JLabel logoSuppFilm = new JLabel(imageSuppFilm, JLabel.CENTER); // on crée une zone pour le logo
    JPanel pSuppFilm = new JPanel(); // création d'un panel pour les boutons
    JLabel nomSuppFilm = new JLabel("Entrez le nom du film à supprimer des affiches : ", JLabel.CENTER);
    JTextField entrerNomSuppFilm = new JTextField(); // création du champs pour renseigner le nom du film
    // public String nomSuppFilm = entrerNomSuppFilm.getText();
    JButton retourSuppFilm = new JButton("Retour");
    JButton bSuppFilm = new JButton("Supprimer le film");
    ////////////////////////////////

    ///FENETRE CONFIRMATION SUPPRESSION FILM /////
    JFrame fenetreConfirmationSuppFilm = new JFrame();
    JPanel confirmationSuppFilm = new JPanel();
    JLabel confirmationSuppressionFilm = new JLabel("Le film a bien été supprimé !", JLabel.CENTER);
    JButton okSuppFilm = new JButton("OK");
    ImageIcon imageConfSuppFilm = new ImageIcon("Logo.png");
    JLabel logoConfSuppFilm = new JLabel(imageConfSuppFilm, JLabel.CENTER);
    /////////////////////////////////////////////


    ///FENETRE ADMIN -  Ajouter un film
    JFrame fenetreAjoutFilm = new JFrame(); // création d'un panel pour la fenêtre
    ImageIcon imageAjoutFilm = new ImageIcon("Logo2.png"); // on charge le logo
    JLabel logoAjoutFilm = new JLabel(imageAjoutFilm, JLabel.CENTER); // on crée une zone pour le logo
    JPanel pAjoutFilm = new JPanel(); // création d'un panel pour les boutons
    JLabel nomAjoutFilm = new JLabel("Entrez le nom du film à mettre à l'affiche : ", JLabel.CENTER);
    JTextField entrerNomAjoutFilm = new JTextField(); // création du champs pour renseigner le nom du film
    JLabel dureeHeure = new JLabel("Entrez la durée du film en heure : ", JLabel.CENTER);
    JTextField entrerDureeHeure = new JTextField();
    JLabel dureeMin = new JLabel("Entrez la durée du film en min : ", JLabel.CENTER);
    JTextField entrerDureeMin = new JTextField();
    JLabel descriptionFilm = new JLabel("Entrez la description du film : ", JLabel.CENTER);
    JTextField entrerDescriptionFilm = new JTextField();
    JLabel afficheFilm = new JLabel("Entrez le nom de l'affiche de film : ", JLabel.CENTER);
    JTextField entrerNomAffiche = new JTextField();
    JButton retourAjoutFilm = new JButton("Retour");
    JButton bAjouterFilm = new JButton("Ajouter le film");
    ////////////////////////////////


    ///FENETRE CONFIRMATION AJOUT FILM /////
    JFrame fenetreConfirmationCAjoutFilm = new JFrame();
    JPanel confirmationAjoutFilm = new JPanel();
    JLabel confirmationCreationFilm = new JLabel("Le film a bien été ajouté!", JLabel.CENTER);
    JButton okAjoutFilm = new JButton("OK");
    ImageIcon imageConfAjoutFilm = new ImageIcon("Logo.png");
    JLabel logoConfAjoutFilm = new JLabel(imageConfAjoutFilm, JLabel.CENTER);
    /////////////////////////////////////////////


    ///FENETRE ADMIN -  Ajouter une offre de réduction
    JFrame fenetreReduc = new JFrame(); // création d'un panel pour la fenêtre
    ImageIcon imageReduc = new ImageIcon("Logo2.png"); // on charge le logo
    JLabel logoReduc = new JLabel(imageReduc, JLabel.CENTER);
    JPanel reduc = new JPanel(); // création d'un panel pour les boutons
    JLabel lReduction = new JLabel("Entrez le montant de la réduction : ", JLabel.CENTER);
    JTextField entrerReduction = new JTextField(); // création du champs pour l'offre de réduction
    JButton bAjouterReduc = new JButton("Valider");
    JButton retourReduc = new JButton("Retour");
    ////////////////////////////////


    ///FENETRE CONFIRMATION PRISE EN COMPTE RÉDUCTION /////
    JFrame fenetreConfirmationReduc = new JFrame();
    JPanel confirmationReduc = new JPanel();
    JLabel lconfirmationReduc = new JLabel("La réduction à appliquer a bien été prise en compte !", JLabel.CENTER);
    JButton okReduction = new JButton("OK");
    ImageIcon imageOkReduction = new ImageIcon("Logo.png");
    JLabel logoOkRedution = new JLabel(imageOkReduction, JLabel.CENTER);
    /////////////////////////////////////////////


    ///FENETRE ADMIN -  Consulter les films populaires
    JFrame fenetreFilmsPop = new JFrame(); // création d'un panel pour la fenêtre
    ImageIcon imageFilmsPop = new ImageIcon("Logo2.png"); // on charge le logo
    JLabel logoFilmsPop = new JLabel(imageFilmsPop, JLabel.CENTER);
    JPanel pFilmsPop = new JPanel(); // création d'un panel pour les boutons
    JLabel filmsPopu = new JLabel("Top 3 des films les plus populaires : ", JLabel.CENTER);
    JButton retourPop = new JButton("Retour");
    JLabel Top1 = new JLabel();
    JLabel Top2 = new JLabel();
    JLabel Top3 = new JLabel();
    JLabel imageTop1 = new JLabel();
    JLabel imageTop2 = new JLabel();
    JLabel imageTop3 = new JLabel();
    Integer nF1 = 0;
    Integer nF2 = 0;
    Integer nF3 = 0;
    Integer nF4 = 0;
    Integer nF5 = 0;
    Integer nF6 = 0;
    Integer nF7 = 0;
    Integer nF8 = 0;
    List<Integer> top3 = new ArrayList<>();
    Film filmPop1 = new Film();
    Film filmPop2 = new Film();
    Film filmPop3 = new Film();
    ////////////////////////////////


    ///FENETRE ADMIN -  Consulter le dossier d'un client
    JFrame fenetreDossierClient = new JFrame(); // création d'un panel pour la fenêtre
    ImageIcon imageDossierClient = new ImageIcon("Logo2.png"); // on charge le logo
    JLabel logoDossierClient = new JLabel(imageDossierClient, JLabel.CENTER);
    JPanel dossierClient = new JPanel(); // création d'un panel pour afficher du texte
    JLabel idClient = new JLabel("Entrez l'ID du client : ", JLabel.CENTER);
    JTextField entrerIdClient = new JTextField(); // création du champs pour renseigner l'id du client
    JButton rechercherDossierClient = new JButton("Rechercher client");
    JButton retourDossierClient = new JButton("Retour");
    ////////////////////////////////


    ///FENETRE INFORMATIONS CLIENT MEMBRE /////
    JFrame fenetreInfoClientMembre = new JFrame();
    JPanel infoClientMembre = new JPanel();
    JLabel infoClientMNom = new JLabel();
    JLabel infoClientMPrenom = new JLabel();
    JLabel infoClientMCategorie = new JLabel();
    JLabel InfoClientMHistorique = new JLabel("Historique des billets achetés : ", JLabel.CENTER);
    JButton okInfoClientMembre = new JButton("OK");
    ImageIcon imageInfoClient = new ImageIcon("Logo2.png");
    JLabel logoInfoClient = new JLabel(imageInfoClient, JLabel.CENTER);
    /////////////////////////////////////////////

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

    ///FENETRE FACTURE///////////////////////////
    JFrame fenetreFacture = new JFrame();
    JPanel facture = new JPanel();
    JLabel imageF = new JLabel();
    JLabel nomF = new JLabel();
    JLabel dureeF = new JLabel();
    JTextArea descF = new JTextArea();
    JLabel prix = new JLabel();
    JLabel reductionF = new JLabel();
    JLabel prixFinal = new JLabel();
    JLabel nbBillet = new JLabel("Nb de billet : ", JLabel.CENTER);
    JSpinner nbBillets = new JSpinner();
    JButton acheter = new JButton("Acheter");
    JButton retour3 = new JButton("Retour");
    /////////////////////////////////////////////

    ///FENETRE DE CONFIRMATION D ACHAT///////////
    JFrame fenetreConfirmationAchat = new JFrame();
    JPanel achat = new JPanel();
    JLabel confirmationAchat = new JLabel("Merci pour votre achat!", JLabel.CENTER);
    JButton ok2 = new JButton("OK");
    ImageIcon imageC5 = new ImageIcon("Logo.png");
    JLabel logo6 = new JLabel(imageC5, JLabel.CENTER);
    /////////////////////////////////////////////

    ///Attribut utilises pour la connexion et Objet de classe tampon
    Client client = new Client();
    ClientMembre clientMembre = new ClientMembre();
    Admin administrateur = new Admin();
    boolean testConnexion = false;
    boolean testConnexionA = false;
    int reduction = 0;
    Billet billetTemp = new Billet(0,0,0,0,"Default");

    public Fenetre() throws SQLException, ClassNotFoundException {

        Color jaunePale = new Color(255, 251, 220);
        Color jaune = new Color(255, 215, 0);
        ///FENETRE PRINCIPALE//////////
        ///Creation de la Frame principale
        fenetrePrincipale.setLayout(new BorderLayout());
        fenetrePrincipale.setBackground(jaunePale);
        fenetrePrincipale.setBounds(0, 0, 800, 700);
        fenetrePrincipale.setTitle("Cinema UGECE Paris");
        fenetrePrincipale.setResizable(true);

        ///On cree le pannel et on le set comme un Grid Bag Layout
        connexion.setLayout(new GridBagLayout());
        connexion.setBackground(jaunePale);
        GridBagConstraints gbc = new GridBagConstraints();
        ///On definit la taille du gridbaglayout
        gbc.weightx = 5;
        gbc.weighty = 5;
        ///gbc.fill = GridBagConstraints.BOTH;

        ///On configure les boutons
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

        ///On positionne les boutons dans leur case
        ///On definit leur ancrage
        ///Et on definit leur taille
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

        ///On ajoute le Panel a la Frame
        fenetrePrincipale.getContentPane().add(connexion, BorderLayout.CENTER);

        ///On definit la fermeture de la  Frame
        fenetrePrincipale.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
        ///On rend la Frame visible
        fenetrePrincipale.setVisible(true);

        ///On defnit l'evenementiel des boutons
        Invite.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ///On rend la fentre principale invisible et on affiche la fentre d'accueil du cinema
                fenetrePrincipale.setVisible(false);
                fenetreAcceuil.setVisible(true);
            }

        });
        Membre.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ///On rend invisible la fenetre principale et on affiche la fentre de choix
                fenetrePrincipale.setVisible(false);
                fenetreChoix.setVisible(true);
            }

        });

        Administrateur.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetrePrincipale.setVisible(false);
                fenetreDeConnexionAdmin.setVisible(true);
            }

        });
        //////////////////////////////////

        ///FENETRE CHOIX//////////////////
        fenetreChoix.setLayout(new BorderLayout());
        fenetreChoix.setBackground(jaunePale);
        fenetreChoix.setBounds(0, 0, 800, 700);
        fenetreChoix.setTitle("CineMax Paris");
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
                ///On rend la fenetre de choix invisible et on affiche celle de la creation de compte
                fenetreChoix.setVisible(false);
                fenetreCreationCompte.setVisible(true);
            }

        });
        seConnecter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ///On rend la fenetre de choix invisible et on affiche celle de connexion
                fenetreChoix.setVisible(false);
                fenetreDeConnexion.setVisible(true);
            }

        });
        ////////////////////////////////

        ///FENETRE CREATION COMPTE//////
        fenetreCreationCompte.setLayout(new BorderLayout());
        fenetreCreationCompte.setBackground(jaunePale);
        fenetreCreationCompte.setBounds(0, 0, 800, 700);
        fenetreCreationCompte.setTitle("CineMax Paris - Création de compte");
        fenetreCreationCompte.setResizable(true);

        creation.setLayout(new GridBagLayout());
        creation.setBackground(jaunePale);

        gbc.weightx = 3;
        gbc.weighty = 7;
        retour.setBackground(jaune);
        retour.setForeground(Color.BLACK);
        retour.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        retour.setFont(new Font("Arial", Font.BOLD, 20));

        ///On definit les attributs de la Combo Box
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
                ///On rend la fenetre de connexion invisible et on reaffiche celle du choix
                fenetreCreationCompte.setVisible(false);
                fenetreChoix.setVisible(true);
            }

        });
        creer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreCreationCompte.setVisible(false);
                try {
                    ///On recupere els informations saisit par le client et on les ajoute a la BDD
                    maconnexion.ecrireClientMembre(Nom.getText(), Prenom.getText(), (String) categorie.getItemAt(categorie.getSelectedIndex()), id.getText(), mdp.getText());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                ///On confirme la creation du compte
                fenetreConfirmationCreationCompte.setVisible(true);
            }

        });
        ///////////////////////////////////////

        ///FENETRE CONFIRMATION CREATION COMPTE///
        fenetreConfirmationCreationCompte.setLayout(new BorderLayout());
        fenetreConfirmationCreationCompte.setBackground(jaunePale);
        fenetreConfirmationCreationCompte.setBounds(0, 0, 800, 700);
        fenetreConfirmationCreationCompte.setTitle("CineMax Paris");
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
                ///On rend la fenetre de confirmation de creation de compte invisible et on affiche la fentre principale
                fenetreConfirmationCreationCompte.setVisible(false);
                fenetrePrincipale.setVisible(true);
            }

        });
        ////////////////////////////////////////////////////////////


        ///FENETRE DE CONNEXION////////////////
        fenetreDeConnexion.setLayout(new BorderLayout());
        fenetreDeConnexion.setBackground(jaunePale);
        fenetreDeConnexion.setBounds(0, 0, 800, 700);
        fenetreDeConnexion.setTitle("CineMax Paris - Connexion");
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
                System.exit(0); // System.exit(0); // tout fermer
            }
        });
        fenetreDeConnexion.setVisible(false);

        retour2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ///On rend la fenetre de connexion invisible et on affiche la fenetre de choix
                fenetreDeConnexion.setVisible(false);
                fenetreChoix.setVisible(true);
            }

        });
        seConnecter2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                try {
                    ///On test la connexion en recuperant l'identifiant et le mdp saisit
                    testConnexion = maconnexion.connexionMembre(Id.getText(), Pw.getText());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if(testConnexion == true){
                    ///Si la connexion est reussie on rend invisible la fenetre de connexion
                    fenetreDeConnexion.setVisible(false);
                    try {
                        ///On recupere les informations du client connecte
                        clientMembre = maconnexion.recupClient(Id.getText());
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    ///En fonction de la categorie du client on applique la reduction
                    if(clientMembre.getCategorie().equals("Regulier")){
                        reduction = 5;
                        System.out.println(reduction);
                    }
                    if(clientMembre.getCategorie().equals("Senior")){
                        reduction = 3;
                        System.out.println(reduction);
                    }
                    if(clientMembre.getCategorie().equals("Enfant")){
                        reduction = 6;
                        System.out.println(reduction);
                    }
                    fenetreAcceuil.setVisible(true);
                }else{/// Si la connexion est refusee on affiche un msg d'erreur
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
        /////////////////////////////////////////////////////////////

        ///FENETRE DE CONNEXION ADMIN////////////////
        fenetreDeConnexionAdmin.setLayout(new BorderLayout());
        fenetreDeConnexionAdmin.setBackground(jaunePale);
        fenetreDeConnexionAdmin.setBounds(0, 0, 800, 700);
        fenetreDeConnexionAdmin.setTitle("CineMax Paris - Connexion administrateur");
        fenetreDeConnexionAdmin.setResizable(true);

        connecterAdmin.setLayout(new GridBagLayout());
        connecterAdmin.setBackground(jaunePale);

        gbc.weightx = 3;
        gbc.weighty = 3;

        IDAdmin.setForeground(Color.BLACK);
        IDAdmin.setFont(new Font("Arial", Font.BOLD, 20));
        IdAdmin.setForeground(Color.BLACK);
        IdAdmin.setBackground(jaune);
        IdAdmin.setFont(new Font("Arial", Font.BOLD, 20));
        PWAdmin.setForeground(Color.BLACK);
        PWAdmin.setFont(new Font("Arial", Font.BOLD, 20));
        PwAdmin.setForeground(Color.BLACK);
        PwAdmin.setBackground(jaune);
        PwAdmin.setFont(new Font("Arial", Font.BOLD, 20));
        retourConnexAdmin.setBackground(jaune);
        retourConnexAdmin.setForeground(Color.BLACK);
        retourConnexAdmin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        retourConnexAdmin.setFont(new Font("Arial", Font.BOLD, 15));
        seConnecterAdmin.setBackground(jaune);
        seConnecterAdmin.setForeground(Color.BLACK);
        seConnecterAdmin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        seConnecterAdmin.setFont(new Font("Arial", Font.BOLD, 15));

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        connecterAdmin.add(logoConnexAdmin, gbc);

        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 100;
        gbc.ipady = 15;
        connecterAdmin.add(IDAdmin, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        connecterAdmin.add(IdAdmin, gbc);

        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 100;
        gbc.ipady = 15;
        connecterAdmin.add(PWAdmin, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        connecterAdmin.add(PwAdmin, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipadx = 100;
        gbc.ipady = 15;
        connecterAdmin.add(retourConnexAdmin,gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.ipadx = 80;
        gbc.ipady = 15;
        connecterAdmin.add(seConnecterAdmin,gbc);

        fenetreDeConnexionAdmin.getContentPane().add(connecterAdmin, BorderLayout.CENTER);

        fenetreDeConnexionAdmin.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
        fenetreDeConnexionAdmin.setVisible(false);

        retourConnexAdmin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreDeConnexionAdmin.setVisible(false);
                fenetrePrincipale.setVisible(true);
            }

        });

        seConnecterAdmin.addActionListener(new ActionListener(){ // j'utilise la fonction client membre pour les admins avec une nouvelle catégorie
            public void actionPerformed(ActionEvent evt){
                try {
                    testConnexionA= maconnexion.connexionAdmin(IdAdmin.getText(), PwAdmin.getText());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if(testConnexionA == true){
                    fenetreDeConnexionAdmin.setVisible(false);
                    try {
                        administrateur = maconnexion.recupAdmin(IdAdmin.getText());
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    fenetreAdmin.setVisible(true);
                }else{
                    JLabel mdpFauxA = new JLabel("Identifiant ou Mot de passe incorrect! Veuillez réessayer");
                    mdpFauxA.setFont(new Font("Arial", Font.BOLD, 15));
                    mdpFauxA.setBackground(jaunePale);
                    mdpFauxA.setForeground(Color.RED);
                    gbc.anchor = GridBagConstraints.CENTER;
                    gbc.weightx = 3;
                    gbc.weighty = 3;
                    gbc.gridx = 1;
                    gbc.gridy = 2;
                    gbc.ipadx = 100;
                    gbc.ipady = 15;
                    connecterAdmin.add(mdpFauxA,gbc);
                    fenetreDeConnexionAdmin.setVisible(false);
                    fenetreDeConnexionAdmin.getContentPane().add(connecterAdmin, BorderLayout.CENTER);
                    fenetreDeConnexionAdmin.setVisible(true);
                }
            }

        });
        /////////////////////////////////////////////////////////////

        ///FENETRE CONFIRMATION ACHAT///
        fenetreConfirmationAchat.setLayout(new BorderLayout());
        fenetreConfirmationAchat.setBackground(jaunePale);
        fenetreConfirmationAchat.setBounds(0, 0, 800, 700);
        fenetreConfirmationAchat.setTitle("CineMax Paris");
        fenetreConfirmationAchat.setResizable(true);

        achat.setLayout(new GridBagLayout());
        achat.setBackground(jaunePale);

        gbc.weightx = 3;
        gbc.weighty = 3;
        ok2.setBackground(jaune);
        ok2.setForeground(Color.BLACK);
        ok2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        ok2.setFont(new Font("Arial", Font.BOLD, 20));
        confirmationAchat.setFont(new Font("Arial", Font.BOLD, 20));

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        achat.add(logo6, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 300;
        gbc.ipady = 30;
        achat.add(confirmationAchat, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        achat.add(ok2, gbc);

        fenetreConfirmationAchat.getContentPane().add(achat, BorderLayout.CENTER);

        fenetreConfirmationAchat.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
        fenetreConfirmationAchat.setVisible(false);

        ok2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ///On rend la fenetre de confirmat d'achat invisible et on affiche la fenetre d'accueil
                fenetreConfirmationAchat.setVisible(false);
                fenetreAcceuil.setVisible(true);
            }

        });
        /////////////////////////////////////


        /// FENETRE ADMIN //////////////
        fenetreAdmin.setLayout(new BorderLayout());
        fenetreAdmin.setBackground(jaunePale);
        fenetreAdmin.setBounds(0, 0, 800, 700);
        fenetreAdmin.setTitle("CineMax Paris - Administrateur");
        fenetreAdmin.setResizable(true);

        choixAdmin.setLayout(new GridBagLayout());
        choixAdmin.setBackground(jaunePale);

        gbc.weightx = 5;
        gbc.weighty = 5;
        majFilms.setBackground(jaune);
        majFilms.setForeground(Color.BLACK);
        majFilms.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        majFilms.setFont(new Font("Arial", Font.BOLD, 20));
        ajoutReduc.setBackground(jaune);
        ajoutReduc.setForeground(Color.BLACK);
        ajoutReduc.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        ajoutReduc.setFont(new Font("Arial", Font.BOLD, 20));
        filmsPop.setBackground(jaune);
        filmsPop.setForeground(Color.BLACK);
        filmsPop.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        filmsPop.setFont(new Font("Arial", Font.BOLD, 20));
        dossiersClients.setBackground(jaune);
        dossiersClients.setForeground(Color.BLACK);
        dossiersClients.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        dossiersClients.setFont(new Font("Arial", Font.BOLD, 20));
        deconnexion.setBackground(jaune);
        deconnexion.setForeground(Color.BLACK);
        deconnexion.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        deconnexion.setFont(new Font("Arial", Font.BOLD, 18));


        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        choixAdmin.add(logoAdmin, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 120;
        gbc.ipady = 30;
        choixAdmin.add(majFilms, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 120;
        gbc.ipady = 30;
        choixAdmin.add(ajoutReduc, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipadx = 120;
        gbc.ipady = 30;
        choixAdmin.add(filmsPop,gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.ipadx = 120;
        gbc.ipady = 30;
        choixAdmin.add(dossiersClients,gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        choixAdmin.add(deconnexion,gbc); // à changer en déconnexion

        fenetreAdmin.getContentPane().add(choixAdmin, BorderLayout.CENTER);

        fenetreAdmin.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer
            }
        });
        fenetreAdmin.setVisible(false);

        majFilms.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreAdmin.setVisible(false);
                fenetreMajFilms.setVisible(true);
            }

        });

        ajoutReduc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreAdmin.setVisible(false);
                fenetreReduc.setVisible(true);
            }

        });

        filmsPop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreAdmin.setVisible(false);
                try {
                    top3 = maconnexion.filmPopulaire();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                nF1 = top3.get(0);
                nF2 = top3.get(1);
                nF3 = top3.get(2);
                nF4 = top3.get(3);
                nF5 = top3.get(4);
                nF6 = top3.get(5);
                nF7 = top3.get(6);
                nF8 = top3.get(7);


                Collections.sort(top3, Collections.reverseOrder());
                for(int i = 0; i < top3.size(); i++){

                    System.out.println(top3.get(i));

                }

                if(top3.get(0) == nF1){

                    filmPop1 = F1;
                }
                if(top3.get(0) == nF2){

                    filmPop1 = F2;
                }
                if(top3.get(0) == nF3){

                    filmPop1 = F3;
                }
                if(top3.get(0) == nF4){

                    filmPop1 = F4;
                }
                if(top3.get(0) == nF5){

                    filmPop1 = F5;
                }
                if(top3.get(0) == nF6){

                    filmPop1 = F6;
                }
                if(top3.get(0) == nF7){

                    filmPop1 = F7;
                }
                if(top3.get(0) == nF8){

                    filmPop1 = F8;
                }


                //FILM POP2
                if(top3.get(1) == nF1){

                    filmPop2 = F1;
                }
                if(top3.get(1) == nF2){

                    filmPop2 = F2;
                }
                if(top3.get(1) == nF3){

                    filmPop2 = F3;
                }
                if(top3.get(1) == nF4){

                    filmPop2 = F4;
                }
                if(top3.get(1) == nF5){

                    filmPop2 = F5;
                }
                if(top3.get(1) == nF6){

                    filmPop2 = F6;
                }
                if(top3.get(1) == nF7){

                    filmPop2 = F7;
                }
                if(top3.get(1) == nF8){

                    filmPop2 = F8;
                }

                //FILM POP3
                if(top3.get(2) == nF1){

                    filmPop3 = F1;
                }
                if(top3.get(2) == nF2){

                    filmPop3 = F2;
                }
                if(top3.get(2) == nF3){

                    filmPop3 = F3;
                }
                if(top3.get(2) == nF4){

                    filmPop3 = F4;
                }
                if(top3.get(2) == nF5){

                    filmPop3 = F5;
                }
                if(top3.get(2) == nF6){

                    filmPop3 = F6;
                }
                if(top3.get(2) == nF7){

                    filmPop3 = F7;
                }
                if(top3.get(2) == nF8){

                    filmPop3 = F8;
                }

                /// FENETRE ADMIN - Films populaires du moment // à finir
                fenetreFilmsPop.setLayout(new BorderLayout());
                fenetreFilmsPop.setBackground(jaunePale);
                fenetreFilmsPop.setBounds(0, 0, 800, 700);
                fenetreFilmsPop.setTitle("Administrateur - Films populaires");
                fenetreFilmsPop.setResizable(true);
                Top1.setText("Top 1 : " + filmPop1.getNom());
                Top1.setBackground(jaunePale);
                Top2.setText("Top 2 : " + filmPop2.getNom());
                Top2.setBackground(jaunePale);
                Top3.setText("Top 3 : " + filmPop3.getNom());
                Top3.setBackground(jaunePale);
                ImageIcon afficheTop1 = new ImageIcon(filmPop1.getImage());
                imageTop1.setIcon(afficheTop1);
                ImageIcon afficheTop2 = new ImageIcon(filmPop2.getImage());
                imageTop2.setIcon(afficheTop2);
                ImageIcon afficheTop3 = new ImageIcon(filmPop3.getImage());
                imageTop3.setIcon(afficheTop3);
                retourPop.setBackground(jaune);
                retourPop.setForeground(Color.BLACK);
                retourPop.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                retourPop.setFont(new Font("Arial", Font.BOLD, 20));

                pFilmsPop.setLayout(new GridBagLayout());
                pFilmsPop.setBackground(jaunePale);

                gbc.weightx = 3;
                gbc.weighty = 6;
                filmsPopu.setForeground(Color.BLACK);
                filmsPop.setFont(new Font("Arial", Font.BOLD, 20));

                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 140;
                gbc.ipady = 30;
                pFilmsPop.add(logoFilmsPop, gbc);

                gbc.anchor = GridBagConstraints.CENTER;
                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.ipadx = 50;
                gbc.ipady = 30;
                pFilmsPop.add(imageTop1, gbc);

                gbc.anchor = GridBagConstraints.CENTER;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 50;
                gbc.ipady = 30;
                pFilmsPop.add(imageTop2, gbc);

                gbc.anchor = GridBagConstraints.CENTER;
                gbc.gridx = 2;
                gbc.gridy = 1;
                gbc.ipadx = 50;
                gbc.ipady = 30;
                pFilmsPop.add(imageTop3, gbc);

                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 0;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 30;
                pFilmsPop.add(Top1, gbc);

                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 30;
                pFilmsPop.add(Top2, gbc);

                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 2;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 30;
                pFilmsPop.add(Top3, gbc);

                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 110;
                gbc.ipady = 15;
                pFilmsPop.add(retourPop, gbc);


                fenetreFilmsPop.getContentPane().add(pFilmsPop, BorderLayout.CENTER);

                fenetreFilmsPop.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer
                    }
                });
                fenetreFilmsPop.setVisible(true);

                retourPop.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent evt){
                        fenetreFilmsPop.setVisible(false);
                        fenetreAdmin.setVisible(true);
                    }

                });
            }

        });

        dossiersClients.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreAdmin.setVisible(false);
                fenetreDossierClient.setVisible(true);
            }

        });

        deconnexion.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreAdmin.setVisible(false);
                fenetrePrincipale.setVisible(true);
            }

        });

        //////////////////////////////////


        /// FENETRE ADMIN - Maj Films
        fenetreMajFilms.setLayout(new BorderLayout());
        fenetreMajFilms.setBackground(jaunePale);
        fenetreMajFilms.setBounds(0, 0, 800, 700);
        fenetreMajFilms.setTitle("Administrateur - Mise à jour des films à l'affiche");
        fenetreMajFilms.setResizable(true);

        choixOptionFilm.setLayout(new GridBagLayout());
        choixOptionFilm.setBackground(jaunePale);

        gbc.weightx = 5;
        gbc.weighty = 5;
        ajoutFilm.setBackground(jaune);
        ajoutFilm.setForeground(Color.BLACK);
        ajoutFilm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        ajoutFilm.setFont(new Font("Arial", Font.BOLD, 20));
        suppFilm.setBackground(jaune);
        suppFilm.setForeground(Color.BLACK);
        suppFilm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        suppFilm.setFont(new Font("Arial", Font.BOLD, 20));
        retourMaj.setBackground(jaune);
        retourMaj.setForeground(Color.BLACK);
        retourMaj.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        retourMaj.setFont(new Font("Arial", Font.BOLD, 20));


        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        choixOptionFilm.add(logoMaj, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        choixOptionFilm.add(ajoutFilm, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        choixOptionFilm.add(suppFilm, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        choixOptionFilm.add(retourMaj, gbc);



        fenetreMajFilms.getContentPane().add(choixOptionFilm, BorderLayout.CENTER);

        fenetreMajFilms.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer
            }
        });
        fenetreMajFilms.setVisible(false);

        retourMaj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreMajFilms.setVisible(false);
                fenetreAdmin.setVisible(true);
            }

        });

        ajoutFilm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreMajFilms.setVisible(false);
                fenetreAjoutFilm.setVisible(true);
            }

        });

        suppFilm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreMajFilms.setVisible(false);
                fenetreSuppFilm.setVisible(true);
            }

        });
        //////////////////////////////////

        /// FENETRE ADMIN - Supprimer un film
        fenetreSuppFilm.setLayout(new BorderLayout());
        fenetreSuppFilm.setBackground(jaunePale);
        fenetreSuppFilm.setBounds(0, 0, 800, 700);
        fenetreSuppFilm.setTitle("Administrateur - Supprimer un film");
        fenetreSuppFilm.setResizable(true);

        pSuppFilm.setLayout(new GridBagLayout());
        pSuppFilm.setBackground(jaunePale);

        gbc.weightx = 5;
        gbc.weighty = 5;
        nomSuppFilm.setBackground(jaunePale);
        nomSuppFilm.setForeground(Color.BLACK);
        nomSuppFilm.setFont(new Font("Arial", Font.BOLD, 20));
        entrerNomSuppFilm.setBackground(jaune);
        entrerNomSuppFilm.setForeground(Color.BLACK);
        entrerNomSuppFilm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        entrerNomSuppFilm.setFont(new Font("Arial", Font.BOLD, 20));
        bSuppFilm.setBackground(jaune);
        bSuppFilm.setForeground(Color.BLACK);
        bSuppFilm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        bSuppFilm.setFont(new Font("Arial", Font.BOLD, 15));
        retourSuppFilm.setBackground(jaune);
        retourSuppFilm.setForeground(Color.BLACK);
        retourSuppFilm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        retourSuppFilm.setFont(new Font("Arial", Font.BOLD, 15));


        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        pSuppFilm.add(logoSuppFilm, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        pSuppFilm.add(nomSuppFilm, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 150;
        gbc.ipady = 15;
        pSuppFilm.add(entrerNomSuppFilm, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.ipadx = 100;
        gbc.ipady = 10;
        pSuppFilm.add(bSuppFilm, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.ipadx = 100;
        gbc.ipady = 10;
        pSuppFilm.add(retourSuppFilm, gbc);


        fenetreSuppFilm.getContentPane().add(pSuppFilm, BorderLayout.CENTER);

        fenetreSuppFilm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer
            }
        });
        fenetreSuppFilm.setVisible(false);

        bSuppFilm.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt){
                fenetreSuppFilm.setVisible(false);
                try {
                    maconnexion.supprimerFilm(entrerNomSuppFilm.getText());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                fenetreMajFilms.setVisible(true);
            }

        });

        retourSuppFilm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreSuppFilm.setVisible(false);
                fenetreMajFilms.setVisible(true);
            }

        });

        ///FENETRE CONFIRMATION SUPRESSION FILM///
        fenetreConfirmationSuppFilm.setLayout(new BorderLayout());
        fenetreConfirmationSuppFilm.setBackground(jaunePale);
        fenetreConfirmationSuppFilm.setBounds(0, 0, 800, 700);
        fenetreConfirmationSuppFilm.setTitle("Administrateur - Confirmation supression film");
        fenetreConfirmationSuppFilm.setResizable(true);

        confirmationSuppFilm.setLayout(new GridBagLayout());
        confirmationSuppFilm.setBackground(jaunePale);

        gbc.weightx = 3;
        gbc.weighty = 3;
        okSuppFilm.setBackground(jaune);
        okSuppFilm.setForeground(Color.BLACK);
        okSuppFilm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        okSuppFilm.setFont(new Font("Arial", Font.BOLD, 20));
        confirmationSuppFilm.setFont(new Font("Arial", Font.BOLD, 20));

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        confirmationSuppFilm.add(logoConfSuppFilm, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 300;
        gbc.ipady = 30;
        confirmationSuppFilm.add(confirmationSuppressionFilm, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        confirmationSuppFilm.add(okSuppFilm, gbc);

        fenetreConfirmationSuppFilm.getContentPane().add(confirmationSuppFilm, BorderLayout.CENTER);

        fenetreConfirmationSuppFilm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // System.exit(0); // tout fermer
            }
        });
        fenetreConfirmationSuppFilm.setVisible(false);

        okSuppFilm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreConfirmationSuppFilm.setVisible(false);
                fenetreMajFilms.setVisible(true);
            }

        });
        //////////////////////////////////


        /// FENETRE ADMIN - Ajouter un film
        fenetreAjoutFilm.setLayout(new BorderLayout());
        fenetreAjoutFilm.setBackground(jaunePale);
        fenetreAjoutFilm.setBounds(0, 0, 800, 700);
        fenetreAjoutFilm.setTitle("Administrateur - Ajouter un film");
        fenetreAjoutFilm.setResizable(true);

        pAjoutFilm.setLayout(new GridBagLayout());
        pAjoutFilm.setBackground(jaunePale);

        gbc.weightx = 5;
        gbc.weighty = 11;
        nomAjoutFilm.setBackground(jaunePale);
        nomAjoutFilm.setForeground(Color.BLACK);
        nomAjoutFilm.setFont(new Font("Arial", Font.BOLD, 17));
        entrerNomAjoutFilm.setBackground(jaune);
        entrerNomAjoutFilm.setForeground(Color.BLACK);
        entrerNomAjoutFilm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        entrerNomAjoutFilm.setFont(new Font("Arial", Font.BOLD, 17));
        dureeHeure.setBackground(jaunePale);
        dureeHeure.setForeground(Color.BLACK);
        dureeHeure.setFont(new Font("Arial", Font.BOLD, 17));
        entrerDureeHeure.setBackground(jaune);
        entrerDureeHeure.setForeground(Color.BLACK);
        entrerDureeHeure.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        entrerDureeHeure.setFont(new Font("Arial", Font.BOLD, 17));
        dureeMin.setBackground(jaunePale);
        dureeMin.setForeground(Color.BLACK);
        dureeMin.setFont(new Font("Arial", Font.BOLD, 17));
        entrerDureeMin.setBackground(jaune);
        entrerDureeMin.setForeground(Color.BLACK);
        entrerDureeMin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        entrerDureeMin.setFont(new Font("Arial", Font.BOLD, 17));
        descriptionFilm.setBackground(jaunePale);
        descriptionFilm.setForeground(Color.BLACK);
        descriptionFilm.setFont(new Font("Arial", Font.BOLD, 17));
        entrerDescriptionFilm.setBackground(jaune);
        entrerDescriptionFilm.setForeground(Color.BLACK);
        entrerDescriptionFilm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        entrerDescriptionFilm.setFont(new Font("Arial", Font.BOLD, 17));
        afficheFilm.setBackground(jaunePale);
        afficheFilm.setForeground(Color.BLACK);
        afficheFilm.setFont(new Font("Arial", Font.BOLD, 17));
        entrerNomAffiche.setBackground(jaune);
        entrerNomAffiche.setForeground(Color.BLACK);
        entrerNomAffiche.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        entrerNomAffiche.setFont(new Font("Arial", Font.BOLD, 17));
        bAjouterFilm.setBackground(jaune);
        bAjouterFilm.setForeground(Color.BLACK);
        bAjouterFilm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        bAjouterFilm.setFont(new Font("Arial", Font.BOLD, 15));
        retourAjoutFilm.setBackground(jaune);
        retourAjoutFilm.setForeground(Color.BLACK);
        retourAjoutFilm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        retourAjoutFilm.setFont(new Font("Arial", Font.BOLD, 15));


        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        pAjoutFilm.add(logoAjoutFilm, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        pAjoutFilm.add(nomAjoutFilm, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 150;
        gbc.ipady = 14;
        pAjoutFilm.add(entrerNomAjoutFilm, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        pAjoutFilm.add(dureeHeure, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.ipadx = 150;
        gbc.ipady = 14;
        pAjoutFilm.add(entrerDureeHeure, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        pAjoutFilm.add(dureeMin, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.ipadx = 150;
        gbc.ipady = 14;
        pAjoutFilm.add(entrerDureeMin, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        pAjoutFilm.add(descriptionFilm, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.ipadx = 150;
        gbc.ipady = 14;
        pAjoutFilm.add(entrerDescriptionFilm, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        pAjoutFilm.add(afficheFilm, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.ipadx = 150;
        gbc.ipady = 14;
        pAjoutFilm.add(entrerNomAffiche, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.ipadx = 100;
        gbc.ipady = 15;
        pAjoutFilm.add(retourAjoutFilm,gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 2;
        gbc.gridy = 10;
        gbc.ipadx = 80;
        gbc.ipady = 15;
        pAjoutFilm.add(bAjouterFilm,gbc);


        fenetreAjoutFilm.getContentPane().add(pAjoutFilm, BorderLayout.CENTER);

        fenetreAjoutFilm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer
            }
        });
        fenetreAjoutFilm.setVisible(false);

        retourAjoutFilm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreAjoutFilm.setVisible(false);
                fenetreMajFilms.setVisible(true);
            }

        });

        bAjouterFilm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreAjoutFilm.setVisible(false);
                try {
                    maconnexion.ecrireFilm(entrerNomAjoutFilm.getText(), entrerDureeHeure.getText(), entrerDureeMin.getText(), entrerDescriptionFilm.getText(), entrerNomAffiche.getText());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                fenetreConfirmationCAjoutFilm.setVisible(true);
            }

        });
        //////////////////////////////////

        ///FENETRE CONFIRMATION AJOUT FILM///
        fenetreConfirmationCAjoutFilm.setLayout(new BorderLayout());
        fenetreConfirmationCAjoutFilm.setBackground(jaunePale);
        fenetreConfirmationCAjoutFilm.setBounds(0, 0, 800, 700);
        fenetreConfirmationCAjoutFilm.setTitle("Administrateur - Confirmation ajout film");
        fenetreConfirmationCAjoutFilm.setResizable(true);

        confirmationAjoutFilm.setLayout(new GridBagLayout());
        confirmationAjoutFilm.setBackground(jaunePale);

        gbc.weightx = 3;
        gbc.weighty = 3;
        okAjoutFilm.setBackground(jaune);
        okAjoutFilm.setForeground(Color.BLACK);
        okAjoutFilm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        okAjoutFilm.setFont(new Font("Arial", Font.BOLD, 20));
        confirmationAjoutFilm.setFont(new Font("Arial", Font.BOLD, 20));

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        confirmationAjoutFilm.add(logoConfAjoutFilm, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 300;
        gbc.ipady = 30;
        confirmationAjoutFilm.add(confirmationCreationFilm, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        confirmationAjoutFilm.add(okAjoutFilm, gbc);

        fenetreConfirmationCAjoutFilm.getContentPane().add(confirmationAjoutFilm, BorderLayout.CENTER);

        fenetreConfirmationCAjoutFilm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
        fenetreConfirmationCAjoutFilm.setVisible(false);

        okAjoutFilm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreConfirmationCAjoutFilm.setVisible(false);
                fenetreMajFilms.setVisible(true);
            }

        });



        /// FENETRE ADMIN - Offres de réduction
        fenetreReduc.setLayout(new BorderLayout());
        fenetreReduc.setBackground(jaunePale);
        fenetreReduc.setBounds(0, 0, 800, 700);
        fenetreReduc.setTitle("Administrateur - Offres de réductions");
        fenetreReduc.setResizable(true);

        reduc.setLayout(new GridBagLayout());
        reduc.setBackground(jaunePale);

        gbc.weightx = 5;
        gbc.weighty = 5;
        //reduction.setBackground(jaune);
        lReduction.setForeground(Color.BLACK);
        //reduction.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        lReduction.setFont(new Font("Arial", Font.BOLD, 20));
        entrerReduction.setBackground(jaune);
        entrerReduction.setForeground(Color.BLACK);
        entrerReduction.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        entrerReduction.setFont(new Font("Arial", Font.BOLD, 20));
        bAjouterReduc.setBackground(jaune);
        bAjouterReduc.setForeground(Color.BLACK);
        bAjouterReduc.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        bAjouterReduc.setFont(new Font("Arial", Font.BOLD, 15));
        retourReduc.setBackground(jaune);
        retourReduc.setForeground(Color.BLACK);
        retourReduc.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        retourReduc.setFont(new Font("Arial", Font.BOLD, 15));


        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        reduc.add(logoReduc, gbc);

        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 120;
        gbc.ipady = 30;
        reduc.add(lReduction, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 120;
        gbc.ipady = 10;
        reduc.add(entrerReduction, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        reduc.add(bAjouterReduc, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.ipadx = 120;
        gbc.ipady = 15;
        reduc.add(retourReduc, gbc);


        fenetreReduc.getContentPane().add(reduc, BorderLayout.CENTER);

        fenetreReduc.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer
            }
        });
        fenetreReduc.setVisible(false);

        retourReduc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreReduc.setVisible(false);
                fenetreAdmin.setVisible(true);
            }

        });

        bAjouterReduc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreReduc.setVisible(false);
                reduction = (Integer.parseInt(entrerReduction.getText()));
                fenetreAdmin.setVisible(true);
            }

        });
        //////////////////////////////////


        ///FENETRE CONFIRMATION REDUCTION //////
        fenetreConfirmationReduc.setLayout(new BorderLayout());
        fenetreConfirmationReduc.setBackground(jaunePale);
        fenetreConfirmationReduc.setBounds(0, 0, 800, 700);
        fenetreConfirmationReduc.setTitle("Administrateur - Validation de la réduction");
        fenetreConfirmationReduc.setResizable(true);

        confirmationReduc.setLayout(new GridBagLayout());
        confirmationReduc.setBackground(jaunePale);

        gbc.weightx = 3;
        gbc.weighty = 3;
        okReduction.setBackground(jaune);
        okReduction.setForeground(Color.BLACK);
        okReduction.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        okReduction.setFont(new Font("Arial", Font.BOLD, 20));
        confirmationReduc.setFont(new Font("Arial", Font.BOLD, 20));

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        confirmationReduc.add(logoOkRedution, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 300;
        gbc.ipady = 30;
        confirmationReduc.add(lconfirmationReduc, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 200;
        gbc.ipady = 15;
        confirmationReduc.add(okReduction, gbc);

        fenetreConfirmationReduc.getContentPane().add(confirmationReduc, BorderLayout.CENTER);

        fenetreConfirmationReduc.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
        fenetreConfirmationReduc.setVisible(false);

        okReduction.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreConfirmationCAjoutFilm.setVisible(false);
                fenetreAdmin.setVisible(true);
            }

        });






        /// FENETRE ADMIN - Consulter dossier d'un client
        fenetreDossierClient.setLayout(new BorderLayout());
        fenetreDossierClient.setBackground(jaunePale);
        fenetreDossierClient.setBounds(0, 0, 800, 700);
        fenetreDossierClient.setTitle("Administrateur - Dossiers clients");
        fenetreDossierClient.setResizable(true);

        dossierClient.setLayout(new GridBagLayout());
        dossierClient.setBackground(jaunePale);

        gbc.weightx = 5;
        gbc.weighty = 5;
        idClient.setForeground(Color.BLACK);
        idClient.setFont(new Font("Arial", Font.BOLD, 20));
        entrerIdClient.setForeground(Color.BLACK);
        entrerIdClient.setBackground(jaune);
        entrerIdClient.setFont(new Font("Arial", Font.BOLD, 20));
        rechercherDossierClient.setBackground(jaune);
        rechercherDossierClient.setForeground(Color.BLACK);
        rechercherDossierClient.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        rechercherDossierClient.setFont(new Font("Arial", Font.BOLD, 20));
        retourDossierClient.setBackground(jaune);
        retourDossierClient.setForeground(Color.BLACK);
        retourDossierClient.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        retourDossierClient.setFont(new Font("Arial", Font.BOLD, 20));


        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        dossierClient.add(logoDossierClient, gbc);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 140;
        gbc.ipady = 30;
        dossierClient.add(idClient, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 250;
        gbc.ipady = 10;
        dossierClient.add(entrerIdClient, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.ipadx = 140;
        gbc.ipady = 15;
        dossierClient.add(rechercherDossierClient, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.ipadx = 140;
        gbc.ipady = 15;
        dossierClient.add(retourDossierClient, gbc);


        fenetreDossierClient.getContentPane().add(dossierClient, BorderLayout.CENTER);

        fenetreDossierClient.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer
            }
        });
        fenetreDossierClient.setVisible(false);

        rechercherDossierClient.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreDossierClient.setVisible(false);
                try {
                    clientMembre = maconnexion.recupClient(entrerIdClient.getText());
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                /// FENETRE ADMIN - Information du client

                fenetreInfoClientMembre.setLayout(new BorderLayout());
                fenetreInfoClientMembre.setBackground(jaunePale);
                fenetreInfoClientMembre.setBounds(0, 0, 800, 700);
                fenetreInfoClientMembre.setTitle("Administrateur - Information du client");
                fenetreInfoClientMembre.setResizable(true);

                infoClientMembre.setLayout(new GridBagLayout());
                infoClientMembre.setBackground(jaunePale);

                gbc.weightx = 5;
                gbc.weighty = 5;
                infoClientMembre.setForeground(Color.BLACK);
                infoClientMembre.setFont(new Font("Arial", Font.BOLD, 20));
                infoClientMNom.setText("Nom : " + clientMembre.getNom());
                infoClientMNom.setFont(new Font("Arial", Font.BOLD, 20));
                infoClientMPrenom.setText("Prenom : " + clientMembre.getPrenom());
                infoClientMPrenom.setFont(new Font("Arial", Font.BOLD, 20));
                infoClientMCategorie.setText("Catégorie : " + clientMembre.getCategorie());
                infoClientMCategorie.setFont(new Font("Arial", Font.BOLD, 20));

                okInfoClientMembre.setBackground(jaune);
                okInfoClientMembre.setForeground(Color.BLACK);
                okInfoClientMembre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                okInfoClientMembre.setFont(new Font("Arial", Font.BOLD, 20));

                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 140;
                gbc.ipady = 30;
                infoClientMembre.add(logoInfoClient, gbc);

                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                infoClientMembre.add(infoClientMNom, gbc);

                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 140;
                gbc.ipady = 15;
                infoClientMembre.add(infoClientMPrenom, gbc);

                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 140;
                gbc.ipady = 15;
                infoClientMembre.add(infoClientMCategorie, gbc);


                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 140;
                gbc.ipady = 15;
                infoClientMembre.add(okInfoClientMembre, gbc);


                fenetreInfoClientMembre.getContentPane().add(infoClientMembre, BorderLayout.CENTER);

                fenetreInfoClientMembre.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer
                    }
                });
                fenetreInfoClientMembre.setVisible(false);


                okInfoClientMembre.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent evt){
                        fenetreInfoClientMembre.setVisible(false);
                        fenetreDossierClient.setVisible(true);
                    }

                });

                fenetreInfoClientMembre.setVisible(true); // faire fenetre confirmation
            }

        });


        retourDossierClient.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreDossierClient.setVisible(false);
                fenetreAdmin.setVisible(true);
            }

        });
        //////////////////////////////////


        ///FENETRE ACCUEIL//////////////////
        F1 = maconnexion.recupFilm("Avatar");
        F2 = maconnexion.recupFilm("Avengers: EndGame");
        F3 = maconnexion.recupFilm("Titanic");
        F4 = maconnexion.recupFilm("Star Wars VII: Le Réveil de la Force");
        F5 = maconnexion.recupFilm("Spider-Man: No Way Home");
        F6 = maconnexion.recupFilm("Le Roi Lion");
        F7 = maconnexion.recupFilm("Jurassic World");
        F8 = maconnexion.recupFilm("The Dark Knight : Le Chevalier Noir");

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
        fenetreAcceuil.setTitle("CineMax Paris");
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

        ///On configure les panels pour les boutons des seances
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
        fenetreFacture.setLayout(new BorderLayout());
        fenetreFacture.setBackground(jaunePale);
        fenetreFacture.setBounds(0, 0, 800, 700);
        fenetreFacture.setTitle("Cinema UGECE Paris");
        fenetreFacture.setResizable(true);
        facture.setLayout(new GridBagLayout());
        facture.setBackground(jaunePale);
        gbc.weightx = 3;
        gbc.weighty = 6;
        nomF.setFont(new Font("Arial", Font.BOLD, 15));
        dureeF.setFont(new Font("Arial", Font.BOLD, 15));
        descF.setFont(new Font("Arial", Font.BOLD, 15));
        descF.setEditable(false);
        descF.setBackground(jaunePale);
        prix.setFont(new Font("Arial", Font.BOLD, 15));
        prix.setText("Prix : 10");
        reductionF.setFont(new Font("Arial", Font.BOLD, 15));
        int temp = 10 -reduction;
        prixFinal.setFont(new Font("Arial", Font.BOLD, 15));
        nbBillet.setFont(new Font("Arial", Font.BOLD, 15));
        acheter.setBackground(jaune);
        acheter.setForeground(Color.BLACK);
        acheter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        acheter.setFont(new Font("Arial", Font.BOLD, 20));
        retour3.setBackground(jaune);
        retour3.setForeground(Color.BLACK);
        retour3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        retour3.setFont(new Font("Arial", Font.BOLD, 20));

        ///Si le client choisit la seance de 8h30 pour le premier film
        Seance1F1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F1.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F1.getNom());
                dureeF.setText("Duree : "+F1.getDureeHeure()+"h"+F1.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F1.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(1);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(1);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });
        ///On reproduit le meme schema pour les 31 autres boutons
        Seance2F1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F1.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F1.getNom());
                dureeF.setText("Duree : "+F1.getDureeHeure()+"h"+F1.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F1.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(9);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(9);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance3F1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F1.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F1.getNom());
                dureeF.setText("Duree : "+F1.getDureeHeure()+"h"+F1.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F1.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(17);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(17);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance4F1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F1.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F1.getNom());
                dureeF.setText("Duree : "+F1.getDureeHeure()+"h"+F1.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F1.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(25);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(25);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance1F2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F2.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F2.getNom());
                dureeF.setText("Duree : "+F2.getDureeHeure()+"h"+F2.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F2.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(2);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(2);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance2F2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F2.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F2.getNom());
                dureeF.setText("Duree : "+F2.getDureeHeure()+"h"+F2.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F2.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(10);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(10);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance3F2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F2.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F2.getNom());
                dureeF.setText("Duree : "+F2.getDureeHeure()+"h"+F2.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F2.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(18);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(18);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance4F2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F2.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F2.getNom());
                dureeF.setText("Duree : "+F2.getDureeHeure()+"h"+F2.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F2.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(26);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(26);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance1F3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F3.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F3.getNom());
                dureeF.setText("Duree : "+F3.getDureeHeure()+"h"+F3.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F3.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(3);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(3);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance2F3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F3.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F3.getNom());
                dureeF.setText("Duree : "+F3.getDureeHeure()+"h"+F3.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F3.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(11);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(11);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance3F3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F3.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F3.getNom());
                dureeF.setText("Duree : "+F3.getDureeHeure()+"h"+F3.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F3.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(19);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(19);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance4F3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F3.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F3.getNom());
                dureeF.setText("Duree : "+F3.getDureeHeure()+"h"+F3.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F3.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(27);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(27);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance1F4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F4.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F4.getNom());
                dureeF.setText("Duree : "+F4.getDureeHeure()+"h"+F4.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F4.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(4);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(4);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance2F4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F4.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F4.getNom());
                dureeF.setText("Duree : "+F4.getDureeHeure()+"h"+F4.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F4.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(12);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(12);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance3F4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F4.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F4.getNom());
                dureeF.setText("Duree : "+F4.getDureeHeure()+"h"+F4.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F4.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(20);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(20);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance4F4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F4.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F4.getNom());
                dureeF.setText("Duree : "+F4.getDureeHeure()+"h"+F4.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F4.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(28);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(28);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance1F5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F5.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F5.getNom());
                dureeF.setText("Duree : "+F5.getDureeHeure()+"h"+F5.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F5.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(5);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(5);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance2F5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F5.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F5.getNom());
                dureeF.setText("Duree : "+F5.getDureeHeure()+"h"+F5.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F5.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(13);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(13);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance3F5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F5.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F5.getNom());
                dureeF.setText("Duree : "+F5.getDureeHeure()+"h"+F5.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F5.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(21);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(21);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance4F5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F5.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F5.getNom());
                dureeF.setText("Duree : "+F5.getDureeHeure()+"h"+F5.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F5.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(29);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(29);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance1F6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F6.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F6.getNom());
                dureeF.setText("Duree : "+F6.getDureeHeure()+"h"+F6.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F6.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(6);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(6);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance2F6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F6.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F6.getNom());
                dureeF.setText("Duree : "+F6.getDureeHeure()+"h"+F6.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F6.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(14);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(14);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance3F6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F6.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F6.getNom());
                dureeF.setText("Duree : "+F6.getDureeHeure()+"h"+F6.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F6.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(22);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(22);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance4F6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F6.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F6.getNom());
                dureeF.setText("Duree : "+F6.getDureeHeure()+"h"+F6.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F6.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(30);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(30);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance1F7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F7.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F7.getNom());
                dureeF.setText("Duree : "+F7.getDureeHeure()+"h"+F7.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F7.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(7);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(7);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance2F7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F7.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F7.getNom());
                dureeF.setText("Duree : "+F7.getDureeHeure()+"h"+F7.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F7.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(15);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(15);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance3F7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F7.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F7.getNom());
                dureeF.setText("Duree : "+F7.getDureeHeure()+"h"+F7.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F7.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(23);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(23);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance4F7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F7.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F7.getNom());
                dureeF.setText("Duree : "+F7.getDureeHeure()+"h"+F7.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F7.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(32);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(32);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance1F8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F8.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F8.getNom());
                dureeF.setText("Duree : "+F8.getDureeHeure()+"h"+F8.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F8.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(8);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(8);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance2F8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F8.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F8.getNom());
                dureeF.setText("Duree : "+F8.getDureeHeure()+"h"+F8.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F8.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(16);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(16);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance3F8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F8.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F8.getNom());
                dureeF.setText("Duree : "+F8.getDureeHeure()+"h"+F8.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F8.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(24);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(24);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });

        Seance4F8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                ImageIcon imagetemp = new ImageIcon(F8.getImage());
                imageF.setIcon(imagetemp);
                nomF.setText(F8.getNom());
                dureeF.setText("Duree : "+F8.getDureeHeure()+"h"+F8.getDureeMinute());
                reductionF.setText("Reduction : " + String.valueOf(reduction));
                descF.setText("Synopsis : "+F8.getDesc());
                int temp = 10 -reduction;
                temp *= (int) nbBillets.getValue();
                prixFinal.setText("Prix Total : "+String.valueOf(temp));
                gbc.anchor = GridBagConstraints.NORTHEAST;
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.ipadx = 100;
                gbc.ipady = 10;
                facture.add(imageF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nomF, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(dureeF, gbc);
                gbc.anchor = GridBagConstraints.WEST;
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 80;
                gbc.ipady = 15;
                facture.add(descF, gbc);
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 10;
                gbc.ipady = 15;
                facture.add(nbBillet, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(nbBillets, gbc);
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prix, gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(reductionF, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.ipadx = 50;
                gbc.ipady = 15;
                facture.add(prixFinal, gbc);
                gbc.gridx = 0;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(retour3, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.ipadx = 100;
                gbc.ipady = 30;
                gbc.anchor = GridBagConstraints.CENTER;
                facture.add(acheter, gbc);
                if(testConnexion == true){
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(clientMembre.getNom());
                    billetTemp.setSeance(32);
                }else{
                    billetTemp.setNum(1 + (int)(Math.random() * ((100 - 1) + 1)));
                    billetTemp.setPrix(10);
                    billetTemp.setReduc(reduction);
                    billetTemp.setClient(client.getNom());
                    billetTemp.setSeance(32);

                }

                fenetreFacture.getContentPane().add(facture, BorderLayout.CENTER);

                fenetreFacture.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent evt) {
                        System.exit(0); // tout fermer												System.exit(0); // tout fermer
                    }
                });
                fenetreFacture.setVisible(true);

            }

        });


        retour3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                fenetreFacture.setVisible(false);
            }

        });
        acheter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                try {
                    for(int i=0; i<(int) nbBillets.getValue();i++){
                        maconnexion.ecrireBillet(billetTemp.getNum(), billetTemp.getPrix(), billetTemp.getReduc(), billetTemp.getSeance(), billetTemp.getClient());
                        if(testConnexion == true){
                            clientMembre.setBillet(billetTemp);
                        }else{
                            client.setBillet(billetTemp);
                        }
                        billetTemp.setNum(billetTemp.getNum()+1);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                fenetreFacture.setVisible(false);
                fenetreConfirmationAchat.setVisible(true);
            }

        });
        //////////////////////////////////////////////////////////////
    }
}
