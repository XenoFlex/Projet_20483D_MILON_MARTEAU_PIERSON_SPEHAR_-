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
public class Cube {
    
    
    private Grille g1, g2, g3;
    
    public Cube () {
        
    }

    public Cube(Grille g1, Grille g2, Grille g3) {
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
    }
    
    

    public Grille getG1() {
        return g1;
    }

    public void setG1(Grille g1) {
        this.g1 = g1;
    }

    public Grille getG2() {
        return g2;
    }

    public void setG2(Grille g2) {
        this.g2 = g2;
    }

    public Grille getG3() {
        return g3;
    }

    public void setG3(Grille g3) {
        this.g3 = g3;
    }
    
    
    
    
    
    
    
}
