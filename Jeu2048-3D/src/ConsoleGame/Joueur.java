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
    private String pseudo; //déclaration des variables
    private String score;  
    
    public Joueur () {
        
    }
    
    public Joueur (String p, String s){         //constructeur
        this.pseudo= p;
        this.score=s;
    }

    public String getPseudo() {     //getter permettant de retourner le pseudo du joueur
        return this.pseudo;
    }

    public void setPseudo(String p) {      //setter 
        this.pseudo = p;
    }
    
    public String getScore(){        //getter permettant de retourner le score du joueur
        return this.score;
    }
    
    public void setScore(String s){     //setter
        this.score=s;
    }

    
    @Override
    public String toString(){
        return this.pseudo+";"+this.score;
    }
}