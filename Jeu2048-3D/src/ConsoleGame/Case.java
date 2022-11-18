/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleGame;

/**
 *
 * @author ALEX
 */
public class Case {
    
    private int x, y, valeur, numerogrille;
    
    public Case(int abs, int ord, int v, int n) {       //constructeur
        this.x = abs;
        this.y = ord;
        this.valeur = v;
        this.numerogrille = n;
    }
    
    public Case(){
        
    }

   
    public int getX() {         //getter
        return this.x;
    }

    public int getY() {         //getter
        return this.y;
    }

    public void setX(int x) {       //setter
        this.x = x;
    }

    public void setY(int y) {       //setter
        this.y = y;     
    }


    public void setValeur(int valeur) {         //  setter
        this.valeur = valeur;
    }

    public int getValeur() {            //getter
        return this.valeur;
    }

    public int getNumerogrille() {          //getter
        return numerogrille;
    }

    public void setNumerogrille(int numerogrille) {     //setter
        this.numerogrille = numerogrille;
    }
    
    
    
}
