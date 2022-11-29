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
public class Grille implements Parametres{
    
    private Case[][] grille;        //une Grille est composé d'un tableau 2D de Cases et de son numéro (1, 2 ou 3)
    private int numero;
    
    public Grille () {
        this.grille = new Case[TAILLE][TAILLE];
    }
    
    public Case[][] getGrille() {
        return grille;
    }

    public void setGrille(Case[][] grille, int n) {
        this.grille = grille;
        this.numero = n;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    public void deplacementSimple(int deplacement) {    //methode de deplacement simple (HAUT, BAS, GAUCHE, DROITE)
        if (deplacement == HAUT) {
            for (int i=0; i<TAILLE ; i++) {                                        
               if (this.grille[i][0].getValeur()==0 && this.grille[i][1].getValeur()==0) {
                   this.grille[i][0].setValeur(this.grille[i][2].getValeur());
                   this.grille[i][2].setValeur(0);
               }
               else if (this.grille[i][0].getValeur()==0) {
                   if (this.grille[i][1].getValeur()==this.grille[i][2].getValeur() && this.grille[i][1].getValeur()!=0 && this.grille[i][2].getValeur()!=0) {
                       this.grille[i][0].setValeur(this.grille[i][1].getValeur()*2);
                       this.grille[i][1].setValeur(0);
                       this.grille[i][2].setValeur(0);
                   }
                   else {
                   this.grille[i][0].setValeur(this.grille[i][1].getValeur());
                   this.grille[i][1].setValeur(this.grille[i][2].getValeur());
                   this.grille[i][2].setValeur(0);
                   }
               }
               else if (this.grille[i][0].getValeur()==this.grille[i][1].getValeur()) {
                   this.grille[i][0].setValeur(this.grille[i][0].getValeur()*2);
                   this.grille[i][1].setValeur(this.grille[i][2].getValeur());
                   this.grille[i][2].setValeur(0);
               }
               else if  (this.grille[i][1].getValeur()==this.grille[i][2].getValeur()) {
                       this.grille[i][1].setValeur(this.grille[i][1].getValeur()*2);
                       this.grille[i][2].setValeur(0);
               }
               else if  (this.grille[i][1].getValeur()==0 && this.grille[i][0].getValeur()== this.grille[i][2].getValeur()) {
                       this.grille[i][0].setValeur(this.grille[i][2].getValeur()*2);
                       this.grille[i][2].setValeur(0);
               }
               else if  (this.grille[i][1].getValeur()==0 && this.grille[i][0].getValeur()!= 0 && this.grille[i][2].getValeur()!=0 && this.grille[i][0].getValeur()!=this.grille[i][2].getValeur()) {
                       this.grille[i][1].setValeur(this.grille[i][2].getValeur());
                       this.grille[i][2].setValeur(0);
                       
               }
               
        }
      }
      if (deplacement == BAS) {
            for (int i=0; i<TAILLE ; i++) {
               if (this.grille[i][2].getValeur()==0 && this.grille[i][1].getValeur()==0) {
                   this.grille[i][2].setValeur(this.grille[i][0].getValeur());
                   this.grille[i][0].setValeur(0);
               }
               else if (this.grille[i][2].getValeur()==0) {
                   if (this.grille[i][1].getValeur()==this.grille[i][0].getValeur() && this.grille[i][1].getValeur()!=0 && this.grille[i][0].getValeur()!=0) {
                       this.grille[i][2].setValeur(this.grille[i][1].getValeur()*2);
                       this.grille[i][1].setValeur(0);
                       this.grille[i][0].setValeur(0);
                   }
                   else {
                   this.grille[i][2].setValeur(this.grille[i][1].getValeur());
                   this.grille[i][1].setValeur(this.grille[i][0].getValeur());
                   this.grille[i][0].setValeur(0);
                   }
               }
               else if (this.grille[i][2].getValeur()==this.grille[i][1].getValeur()) {
                   this.grille[i][2].setValeur(this.grille[i][2].getValeur()*2);
                   this.grille[i][1].setValeur(this.grille[i][0].getValeur());
                   this.grille[i][0].setValeur(0);
               }
               else if  (this.grille[i][1].getValeur()==this.grille[i][0].getValeur()) {
                       this.grille[i][1].setValeur(this.grille[i][1].getValeur()*2);
                       this.grille[i][0].setValeur(0);
               }
               else if  (this.grille[i][1].getValeur()==0 && this.grille[i][2].getValeur()== this.grille[i][0].getValeur()) {
                       this.grille[i][2].setValeur(this.grille[i][0].getValeur()*2);
                       this.grille[i][0].setValeur(0);
               }
               else if  (this.grille[i][1].getValeur()==0 && this.grille[i][2].getValeur()!= 0 && this.grille[i][0].getValeur()!=0 && this.grille[i][2].getValeur()!=this.grille[i][0].getValeur()) {
                       this.grille[i][1].setValeur(this.grille[i][0].getValeur());
                       this.grille[i][0].setValeur(0);
                       
               }
               
        }
    }
      if (deplacement == DROITE) {
            for (int i=0; i<TAILLE ; i++) {
               if (this.grille[2][i].getValeur()==0 && this.grille[1][i].getValeur()==0) {
                   this.grille[2][i].setValeur(this.grille[0][i].getValeur());
                   this.grille[0][i].setValeur(0);
               }
               else if (this.grille[2][i].getValeur()==0) {
                   if (this.grille[1][i].getValeur()==this.grille[0][i].getValeur() && this.grille[1][i].getValeur()!=0 && this.grille[0][i].getValeur()!=0) {
                       this.grille[2][i].setValeur(this.grille[1][i].getValeur()*2);
                       this.grille[1][i].setValeur(0);
                       this.grille[0][i].setValeur(0);
                   }
                   else {
                   this.grille[2][i].setValeur(this.grille[1][i].getValeur());
                   this.grille[1][i].setValeur(this.grille[0][i].getValeur());
                   this.grille[0][i].setValeur(0);
                   }
               }
               else if (this.grille[2][i].getValeur()==this.grille[1][i].getValeur()) {
                   this.grille[2][i].setValeur(this.grille[2][i].getValeur()*2);
                   this.grille[1][i].setValeur(this.grille[0][i].getValeur());
                   this.grille[0][i].setValeur(0);
               }
               else if  (this.grille[1][i].getValeur()==this.grille[0][i].getValeur()) {
                       this.grille[1][i].setValeur(this.grille[1][i].getValeur()*2);
                       this.grille[0][i].setValeur(0);
               }
               else if  (this.grille[1][i].getValeur()==0 && this.grille[2][i].getValeur()== this.grille[0][i].getValeur()) {
                       this.grille[2][i].setValeur(this.grille[0][i].getValeur()*2);
                       this.grille[0][i].setValeur(0);
               }
               else if  (this.grille[1][i].getValeur()==0 && this.grille[2][i].getValeur()!= 0 && this.grille[0][i].getValeur()!=0 && this.grille[2][i].getValeur()!=this.grille[0][i].getValeur()) {
                       this.grille[1][i].setValeur(this.grille[0][i].getValeur());
                       this.grille[0][i].setValeur(0);
                       
               }
               
        }
        
    }
      if (deplacement == GAUCHE) {
            for (int i=0; i<TAILLE ; i++) {
               if (this.grille[0][i].getValeur()==0 && this.grille[1][i].getValeur()==0) {
                   this.grille[0][i].setValeur(this.grille[0][i].getValeur());
                   this.grille[2][i].setValeur(0);
               }
               else if (this.grille[0][i].getValeur()==0) {
                   if (this.grille[1][i].getValeur()==this.grille[2][i].getValeur() && this.grille[2][i].getValeur()!=0 && this.grille[1][i].getValeur()!=0) {
                       this.grille[0][i].setValeur(this.grille[1][i].getValeur()*2);
                       this.grille[1][i].setValeur(0);
                       this.grille[2][i].setValeur(0);
                   }
                   else {
                   this.grille[0][i].setValeur(this.grille[1][i].getValeur());
                   this.grille[1][i].setValeur(this.grille[2][i].getValeur());
                   this.grille[2][i].setValeur(0);
                   }
               }
               else if (this.grille[0][i].getValeur()==this.grille[1][i].getValeur()) {
                   this.grille[0][i].setValeur(this.grille[0][i].getValeur()*2);
                   this.grille[1][i].setValeur(this.grille[2][i].getValeur());
                   this.grille[2][i].setValeur(0);
               }
               else if  (this.grille[1][i].getValeur()==this.grille[2][i].getValeur()) {
                       this.grille[1][i].setValeur(this.grille[1][i].getValeur()*2);
                       this.grille[2][i].setValeur(0);
               }
                else if  (this.grille[1][i].getValeur()==0 && this.grille[0][i].getValeur()== this.grille[2][i].getValeur()) {
                       this.grille[0][i].setValeur(this.grille[2][i].getValeur()*2);
                       this.grille[2][i].setValeur(0);
               }
               else if  (this.grille[1][i].getValeur()==0 && this.grille[0][i].getValeur()!= 0 && this.grille[2][i].getValeur()!=0 && this.grille[0][i].getValeur()!=this.grille[2][i].getValeur()) {
                       this.grille[1][i].setValeur(this.grille[2][i].getValeur());
                       this.grille[2][i].setValeur(0);     
               }
               
        }
        
    }
        
    }
    
    
    }

