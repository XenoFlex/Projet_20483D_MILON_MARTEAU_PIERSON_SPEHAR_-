/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleGame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author ALEX
 */
public class Cube implements Parametres {
    
    
    private Grille g1, g2, g3;
    

    public Cube(Grille g1, Grille g2, Grille g3) {          //constructeur
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
    }
    
    public Cube() {
        
    }
    
    

    public Grille getG1() {         //getter
        return g1;
    }

    public void setG1(Grille g1) {      //setter
        this.g1 = g1;
    }

    public Grille getG2() {         //getter
        return g2;
    }

    public void setG2(Grille g2) {      //setter
        this.g2 = g2;
    }

    public Grille getG3() {         //getter
        return g3;
    }

    public void setG3(Grille g3) {          //setter
        this.g3 = g3;
    }
    
    //public void init() {
        
      //  this.g1.init();
      //  this.g2.init();
      //  this.g3.init();
        
    // }
    
    
    public void deplacementParticulier(int deplacement) {
        
        if (deplacement == POUSSER) {           //si le déplacement est "pousser" 
            for (int i=0; i<TAILLE; i++) {
                for (int j=0 ; j<TAILLE; j++) {
                    if (this.g3.getGrille()[i][j].getValeur()==0 && this.g2.getGrille()[i][j].getValeur()==0)  {
                       this.g3.getGrille()[i][j].setValeur(this.g1.getGrille()[i][j].getValeur());
                       this.g1.getGrille()[i][j].setValeur(0);
                }
                else if (this.g3.getGrille()[i][j].getValeur()==0) {
                    if (this.g2.getGrille()[i][j].getValeur()==this.g1.getGrille()[i][j].getValeur() && this.g2.getGrille()[i][j].getValeur()!=0 && this.g1.getGrille()[i][j].getValeur()!=0) {
                       this.g3.getGrille()[i][j].setValeur(this.g2.getGrille()[i][j].getValeur()*2);
                       this.g2.getGrille()[i][j].setValeur(0);
                       this.g1.getGrille()[i][j].setValeur(0);
                   }
                   else {
                    this.g3.getGrille()[i][j].setValeur(this.g2.getGrille()[i][j].getValeur());
                    this.g2.getGrille()[i][j].setValeur(this.g1.getGrille()[i][j].getValeur());
                    this.g1.getGrille()[i][j].setValeur(0);
                    }
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
                else if  (this.g2.getGrille()[i][j].getValeur()==0 && this.g3.getGrille()[i][j].getValeur()==this.g1.getGrille()[i][j].getValeur()) {
                       this.g3.getGrille()[i][j].setValeur(this.g3.getGrille()[i][j].getValeur()*2);
                       this.g1.getGrille()[i][j].setValeur(0);
               }
               else if  (this.g2.getGrille()[i][j].getValeur()==0 && this.g3.getGrille()[i][j].getValeur()!= 0 && this.g1.getGrille()[i][j].getValeur()!=0 && this.g3.getGrille()[i][j].getValeur()!=this.g1.getGrille()[i][j].getValeur()) {
                       this.g2.getGrille()[i][j].setValeur(this.g1.getGrille()[i][j].getValeur());
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
                    if (this.g2.getGrille()[i][j].getValeur()==this.g3.getGrille()[i][j].getValeur() && this.g2.getGrille()[i][j].getValeur()!=0 && this.g3.getGrille()[i][j].getValeur()!=0) {
                       this.g1.getGrille()[i][j].setValeur(this.g2.getGrille()[i][j].getValeur()*2);
                       this.g2.getGrille()[i][j].setValeur(0);
                       this.g3.getGrille()[i][j].setValeur(0);
                   }
                    else {
                    this.g1.getGrille()[i][j].setValeur(this.g2.getGrille()[i][j].getValeur());
                    this.g2.getGrille()[i][j].setValeur(this.g3.getGrille()[i][j].getValeur());
                    this.g3.getGrille()[i][j].setValeur(0);
                    }
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
                else if  (this.g2.getGrille()[i][j].getValeur()==0 && this.g3.getGrille()[i][j].getValeur()==this.g1.getGrille()[i][j].getValeur()) {
                       this.g1.getGrille()[i][j].setValeur(this.g3.getGrille()[i][j].getValeur()*2);
                       this.g3.getGrille()[i][j].setValeur(0);
                }
                else if  (this.g2.getGrille()[i][j].getValeur()==0 && this.g3.getGrille()[i][j].getValeur()!= 0 && this.g1.getGrille()[i][j].getValeur()!=0 && this.g3.getGrille()[i][j].getValeur()!=this.g1.getGrille()[i][j].getValeur()) {
                       this.g2.getGrille()[i][j].setValeur(this.g3.getGrille()[i][j].getValeur());
                       this.g3.getGrille()[i][j].setValeur(0);
                       
               }
            }
            
        }
        
        
    }
        
    }
    
    
    
    public void affichage () {          //permet l'affichage du cube, c'est à dire des 3 grilles
        
        //parcours de la première grille 
        for (int j=0; j<TAILLE; j++) {      
            for (int i=0; i<TAILLE; i++) {
            
            //affichage de la première grille 
            System.out.print("[ ");
            System.out.print(this.g1.getGrille()[i][j].getValeur() + " ");
            System.out.print("]");
            }
            System.out.println("");
        }
        
        System.out.println("   ");
        
        //parcours de la deuxième grille 
        for (int j=0; j<TAILLE; j++) {
            for (int i=0; i<TAILLE; i++) {
            
            // affichage de la deuxième grille 
            System.out.print("[ ");
            System.out.print(this.g2.getGrille()[i][j].getValeur() + " ");
            System.out.print("]");
            }
            System.out.println("");
        }
        
        System.out.println("   ");
        
        //parcours de la troisième grille 
        for (int j=0; j<TAILLE; j++) {
            for (int i=0; i<TAILLE; i++) {
            
            //affichage de la troisième grille
            System.out.print("[ ");
            System.out.print(this.g3.getGrille()[i][j].getValeur() + " ");
            System.out.print("]");
            }
            System.out.println("");
        }
        }
    
        public void randomCase() {              //permet de placer alétoirement une case
            
            Random ra = new Random();
            int[] alea = new int[3];
             alea[0]=2;
             alea[1]=2;
             alea[2]=4;
             int n = ra.nextInt(alea.length);
             
             HashSet<Case> vacant = new HashSet<Case>();
             
             for (int i=0; i<TAILLE; i++) {
                 for(int j=0; j<TAILLE; j++) {
                       if (this.g1.getGrille()[i][j].getValeur()==0) {
                           vacant.add(this.g1.getGrille()[i][j]);
                       }
                       if (this.g2.getGrille()[i][j].getValeur()==0) {
                           vacant.add(this.g2.getGrille()[i][j]);
                      
                       }
                       if (this.g3.getGrille()[i][j].getValeur()==0) {
                           vacant.add(this.g3.getGrille()[i][j]);
                       }
                 } 
             }
             
             System.out.println(vacant.size());
             
             if (vacant.size()!=0) {
             
             int m = ra.nextInt(vacant.size()-1);
             Case ajout = new Case();;
             Case[] tab = new Case[vacant.size()];
             vacant.toArray(tab);
             ajout = tab[m];
             
             //System.out.println(ajout.getX()+ " " + ajout.getY() + " " + ajout.getValeur() + " " + ajout.getNumerogrille());
             
             //System.out.println(alea[n]);
             
             if (ajout.getNumerogrille()==1){
                 this.g1.getGrille()[ajout.getX()][ajout.getY()].setValeur(alea[n]);

             } else if (ajout.getNumerogrille()==2){
                 this.g2.getGrille()[ajout.getX()][ajout.getY()].setValeur(alea[n]);

             } else if (ajout.getNumerogrille()==3){
                 this.g3.getGrille()[ajout.getX()][ajout.getY()].setValeur(alea[n]);

             }
             }
        }
             
             public boolean victoire2048() {
                 
                 HashSet<Case> ensemble = new HashSet<Case>();
                 boolean stop = false;
                 
                 for (int i = 0; i<TAILLE; i++) {
                   for (int j = 0; j<TAILLE; j++) {
                     ensemble.add(this.g1.getGrille()[i][j]);
                     ensemble.add(this.g2.getGrille()[i][j]);
                     ensemble.add(this.g3.getGrille()[i][j]);
                   }
                 }
                 
                 Iterator<Case> itera = ensemble.iterator();
                 
                 while (itera.hasNext() && (!stop)) {
                     if (itera.next().getValeur()==2048) {
                         stop = true;
                     }
                    }
                 
                 return stop;
             }
             
             public boolean gameOver(Cube cube) {
                 
                 HashSet<Case> ensemble = new HashSet<Case>();
                 boolean stop = true;
                 
                 for (int i = 0; i<TAILLE; i++) {
                   for (int j = 0; j<TAILLE; j++) {
                     ensemble.add(this.g1.getGrille()[i][j]);
                     ensemble.add(this.g2.getGrille()[i][j]);
                     ensemble.add(this.g3.getGrille()[i][j]);
                   }
                 }
                 
                 Iterator<Case> itera = ensemble.iterator();
                 Case c = new Case();
                 HashSet<Case> voisin= new HashSet<Case>();
                 
                 while (itera.hasNext() && (stop)) {
                     c=itera.next();
                     System.out.println(c.getNumerogrille() + " " + c.getX() + " " + c.getY() + " " +c.getValeur());
                     voisin = c.getVoisins(cube);
                     Case[] tab = new Case[voisin.size()];
                     voisin.toArray(tab); 
                     for (int i=0; i<tab.length; i++) {
                     System.out.println(tab[i].getNumerogrille() + " " + tab[i].getX() + " " + tab[i].getY() + " " +tab[i].getValeur());
                     if (c.getValeur()==tab[i].getValeur()) {
                       stop = false;
                     }
                     }
                 }
                 return true;    //retourne faux si si il ya un voisin avec la meme valeur
                                 //retourne vrai si il n'y a pas de voisin avec la meme valeur
 
    }
             
}
    

    
    
    
    
    

