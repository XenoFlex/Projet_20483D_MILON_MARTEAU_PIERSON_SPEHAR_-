/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleGame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author ALEX
 */
public class Cube implements Parametres {
    
    
    private Grille g1, g2, g3;
    

    public Cube(Grille g1, Grille g2, Grille g3) {
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
    }
    
    public Cube() {
        
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
    
    //public void init() {
        
      //  this.g1.init();
      //  this.g2.init();
      //  this.g3.init();
        
    // }
    
    
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
        if (deplacement == TIRER) {
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
    
    
    
    public void affichage () {
        
        
        for (int j=0; j<TAILLE; j++) {
            for (int i=0; i<TAILLE; i++) {
            
            System.out.print("[ ");
            System.out.print(this.g1.getGrille()[i][j].getValeur() + " ");
            System.out.print("]");
            }
            System.out.println("");
        }
        
        System.out.println("   ");
        
        for (int j=0; j<TAILLE; j++) {
            for (int i=0; i<TAILLE; i++) {
            
            System.out.print("[ ");
            System.out.print(this.g2.getGrille()[i][j].getValeur() + " ");
            System.out.print("]");
            }
            System.out.println("");
        }
        
        System.out.println("   ");
        
        for (int j=0; j<TAILLE; j++) {
            for (int i=0; i<TAILLE; i++) {
            
            System.out.print("[ ");
            System.out.print(this.g3.getGrille()[i][j].getValeur() + " ");
            System.out.print("]");
            }
            System.out.println("");
        }
        }
    
        public void randomCase() {
            
            Random ra = new Random();
            int[] alea = new int[3];
             alea[0]=2;
             alea[1]=2;
             alea[2]=4;
             
             
             int n = ra.nextInt(alea.length);
             HashSet<Case> vacant = new HashSet<Case>();
             int k=0;
             
             for (int i=0; i<TAILLE; i++) {
                 for(int j=0; j<TAILLE; j++) {
                       if (this.g1.getGrille()[i][j].getValeur()==0) {
                           vacant.add(this.g1.getGrille()[i][j]);
                           k++;
   
           
                       }
                       if (this.g2.getGrille()[i][j].getValeur()==0) {
                           vacant.add(this.g2.getGrille()[i][j]);
                           k++;
                      
                       }
                       if (this.g3.getGrille()[i][j].getValeur()==0) {
                           vacant.add(this.g3.getGrille()[i][j]);
                           k++;
                       }
                 } 
             }
             
             int m = ra.nextInt(vacant.size());
             Case ajout = new Case();;
             Case[] tab = new Case[vacant.size()];
             vacant.toArray(tab);
             ajout = tab[m];
             
             System.out.println(ajout.getX()+ " " + ajout.getY() + " " + ajout.getValeur() + " " + ajout.getNumerogrille());
             
             System.out.println(alea[n]);
             
             if (ajout.getNumerogrille()==1){
                 this.g1.getGrille()[ajout.getX()][ajout.getY()].setValeur(alea[n]);

            
             } else if (ajout.getNumerogrille()==2){
                 this.g2.getGrille()[ajout.getX()][ajout.getY()].setValeur(alea[n]);

             } else if (ajout.getNumerogrille()==3){
                 this.g3.getGrille()[ajout.getX()][ajout.getY()].setValeur(alea[n]);

             }
             
             
   

           
        }
    
        
        
    }
    

    
    
    
    
    

