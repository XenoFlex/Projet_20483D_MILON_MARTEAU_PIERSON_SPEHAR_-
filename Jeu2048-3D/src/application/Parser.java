/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import ConsoleGame.Joueur;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Eva
 */
public class Parser {
    private final File fichier;

    public Parser(String classement_joueurs) {
        this.fichier = new File(classement_joueurs);
    }

    /*
     * Vérifie si l'attribut fichier est un fichier existant sur notre disque dur
     */
    public boolean doesFileExists() {
        try {
            return this.fichier.exists();
        } catch (SecurityException se) {
            System.out.println("Security Exception : access to file denied");
            return false;
        }
    }

    // Ajoute une ligne dans le fichier .csv (voir attribut de classe)
    //correspondant à un joueur avec son nom et son score
   
    public void addInternaute(Joueur i) {
        if (this.doesFileExists()) {
            try {
                FileWriter fwriter = new FileWriter(this.fichier, true);
                BufferedWriter outputfile = new BufferedWriter(fwriter);
                outputfile.write(i.toString());
                outputfile.newLine();
                outputfile.close();
            } catch (IOException ioe) {
                System.out.println("Probleme pendant l'écriture du fichier " + this.fichier.getAbsolutePath());
                ioe.printStackTrace();
            } catch (Exception e) {
                System.out.println("Erreur inattendue");
            }
        } else {
            System.out.println("Le fichier " + this.fichier.getAbsolutePath() + " n'existe pas");
            System.exit(1);
        }
    }

    /*
     * Parcourt le fichier et retourne la liste des internautes contenus dans le fichier .csv
     * Méthode utile : getFileContent() de cette classe Parser qui contient chaque ligne du fichier sous forme d'une String
     */
    public ArrayList<Joueur> parseJoueurs() {
        ArrayList<String> lignes = this.getFileContent();
        if (lignes.size() > 1) { // la première ligne contient les titres de colonnes
            ArrayList<Joueur> joueur = new ArrayList<>();
            for (int i = 1; i < lignes.size(); i++) {
                String pseudo = this.getTextTo(lignes.get(i), ";");
                String score = this.getTextFrom(lignes.get(i), pseudo + ";");
                boolean b = joueur.add(new Joueur(pseudo, score));
            }
            return joueur;
        } else {
            System.out.println("Pas de joueur dans le fichier");
            System.exit(2);
            return null;
        }
    }

    /*
     * Parcourt le fichier .csv et retourne son contenu sous forme d'une liste de String
     * (chaque ligne du fichier correspond à une String)*/
    private ArrayList<String> getFileContent() {
        if (this.doesFileExists()) {
            ArrayList<String> l = new ArrayList<>();
            try {
                FileReader freader = new FileReader(this.fichier);
                BufferedReader inputfile = new BufferedReader(freader);
                String readLine = inputfile.readLine();
                while (readLine != null) {
                    l.add(readLine);
                    readLine = inputfile.readLine();
                }
                inputfile.close();
            } catch (IOException ioe) {
                System.out.println("Probleme pendant la lecture du fichier " + this.fichier.getAbsolutePath());
                ioe.printStackTrace();
            }
            return l;
        } else {
            System.out.println("Le fichier " + this.fichier.getAbsolutePath() + " n'existe pas");
            System.exit(1);
            return null;
        }
    }

    /*
     * Retourne la sous-chaine contenue dans text qui va du début de text jusqu'à la chaine end*/
    private String getTextTo(String text, String end) {
        String temp = "";
        int i = text.indexOf(end);
        if (i > 0) {
            temp = text.substring(0, i);
        }
        return temp;
    }

    /*
     * Retourne la sous-chaine contenue dans text qui commence après la chaine begin jusqu'à la fin de la chaine text*/
    private String getTextFrom(String text, String begin) {
        String temp = "";
        int i = text.indexOf(begin);
        if (i >= 0) {
            temp = text.substring(i + begin.length());
        }
        return temp;
    }
}

