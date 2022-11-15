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
public class Cube implements Parametres {
    
    
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
    
    
    public void deplacementParticulier(int deplacement) {
        
        if (deplacement == POUSSER) {
            for (int i=0; i<TAILLE; i++) {
                for (int j=0 ; j<TAILLE; j++) {
                    if (this.g3.getGrille()[i][j].getValeur()==0 && this.g2.getGrille()[i][j].getValeur()==0)  {
                       this.g3.getGrille()[i][j].setValeur(this.g1.getGrille()[i][j].getValeur());
                       this.g1.getGrille()[i][j].setValeur(0);
                }
                else if (this.g3.getGrille()[i][j].getValeur()==0) {
                    this.g3.getGrille()[i][j].setValeur(this.g2.getGrille()[i][j].getValeur());
                    this.g2.getGrille()[i][j].setValeur(this.g1.getGrille()[i][j].getValeur());
                    this.g1.getGrille()[i][j].setValeur(0);
                }
                else if (this.g3.getGrille()[i][j].getValeur()==this.g2.getGrille()[i][j].getValeur()) {
                    this.g3.getGrille()[i][j].setValeur(this.g3.getGrille()[i][j].getValeur()*2);
                    this.g2.getGrille()[i][j].setValeur(this.g1.getGrille()[i][j].getValeur());
                    this.g1.getGrille()[i][j].setValeur(0);
                }
                else if (this.g2.getGrille()[i][j].getValeur()==this.g1.getGrille()[i][j].getValeur()) {
                    this.g2.getGrille()[i][j].setValeur(this.g2.getGrille()[i][j].getValeur()*2);
                    this.g1.getGrille()[i][j].setValeur(0);
                }
            }
            
            }    
    }
        if (deplacement == POUSSER) {
            for (int i=0; i<TAILLE; i++) {
                for (int j=0 ; j<TAILLE; j++) {
                    if (this.g1.getGrille()[i][j].getValeur()==0 && this.g2.getGrille()[i][j].getValeur()==0)  {
                       this.g1.getGrille()[i][j].setValeur(this.g3.getGrille()[i][j].getValeur());
                       this.g3.getGrille()[i][j].setValeur(0);
                }
                else if (this.g1.getGrille()[i][j].getValeur()==0) {
                    this.g1.getGrille()[i][j].setValeur(this.g2.getGrille()[i][j].getValeur());
                    this.g2.getGrille()[i][j].setValeur(this.g3.getGrille()[i][j].getValeur());
                    this.g3.getGrille()[i][j].setValeur(0);
                }
                else if (this.g1.getGrille()[i][j].getValeur()==this.g2.getGrille()[i][j].getValeur()) {
                    this.g1.getGrille()[i][j].setValeur(this.g1.getGrille()[i][j].getValeur()*2);
                    this.g2.getGrille()[i][j].setValeur(this.g3.getGrille()[i][j].getValeur());
                    this.g3.getGrille()[i][j].setValeur(0);
                }
                else if (this.g2.getGrille()[i][j].getValeur()==this.g3.getGrille()[i][j].getValeur()) {
                    this.g2.getGrille()[i][j].setValeur(this.g2.getGrille()[i][j].getValeur()*2);
                    this.g3.getGrille()[i][j].setValeur(0);
                }
            }
            
        }
        
        
    }
        
    }
    
}
    
    
    
    
    

