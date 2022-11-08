/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleGame;

import java.util.HashSet;

/**
 *
 * @author ALEX
 */
public class Grille {
    
    private Case[][] grille;
    private int valeurMax = 0;
    
    
    public Case[][] getGrille() {
        return grille;
    }

    public void setGrille(Case[][] grille) {
        this.grille = grille;
    }

    
    
    
    public int getValeurMax() {
        return valeurMax;
    }

    public void setValeurMax(int valeurMax) {
        this.valeurMax = valeurMax;
    }
    
    
    
}
