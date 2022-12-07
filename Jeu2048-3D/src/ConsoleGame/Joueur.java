/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleGame;

/**
 *
 * @author Eva
 */
public class Joueur {
    private String pseudo;     //déclaration des variables
    
    public Joueur(){         //constructeur
   
    }
    
    public Joueur (String p){         //constructeur
        this.pseudo= p;
    }

    public String getPseudo() {     //getter permettant de retourner le pseudo du joueur
        return this.pseudo;
    }

    public void setPseudo(String Pseudo) {      //setter 
        this.pseudo = pseudo;
    }

    @Override
    public String toString(){
        return this.pseudo;
    }
}