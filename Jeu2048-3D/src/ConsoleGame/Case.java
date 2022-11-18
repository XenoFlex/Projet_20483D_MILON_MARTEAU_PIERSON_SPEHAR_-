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
    
    public Case(int abs, int ord, int v, int n) {
        this.x = abs;
        this.y = ord;
        this.valeur = v;
        this.numerogrille = n;
    }
    
    public Case(){
        
    }

   
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return this.valeur;
    }

    public int getNumerogrille() {
        return numerogrille;
    }

    public void setNumerogrille(int numerogrille) {
        this.numerogrille = numerogrille;
    }
    
    
    
}
