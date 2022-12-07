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
import java.io.Serializable;

/**
 *
 * @author ALEX
 */
public class Cube implements Parametres {
    
    
    private Grille g1, g2, g3;              //un cube est composé de 3 Grilles
    

    public Cube(Grille g1, Grille g2, Grille g3) {          //constructeur d'un cube
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
    
    
    
    public void deplacementParticulier(int deplacement) {   //methode de Déplacement particulier (présente dans la classe Cube car cela permet de lier les 3 grilles entre elles plus facilement)
        
        if (deplacement == POUSSER) {           //si le déplacement est "pousser" (superieur)
            for (int i=0; i<TAILLE; i++) {
                for (int j=0 ; j<TAILLE; j++) {
                    if (this.g3.getGrille()[i][j].getValeur()==0 && this.g2.getGrille()[i][j].getValeur()==0)  {   //si les valeurs de la G3=0 et G2=0 alors la valeur dans la G1 va prendre la place de la valeur en G3
                       this.g3.getGrille()[i][j].setValeur(this.g1.getGrille()[i][j].getValeur());
                       this.g1.getGrille()[i][j].setValeur(0);
                }
                else if (this.g3.getGrille()[i][j].getValeur()==0) {  //sinon si G3=0
                    if (this.g2.getGrille()[i][j].getValeur()==this.g1.getGrille()[i][j].getValeur() && this.g2.getGrille()[i][j].getValeur()!=0 && this.g1.getGrille()[i][j].getValeur()!=0) {  //si valeur de G2 = valeur de G2 et valeur de G1 et G2 =/= 0 
                       this.g3.getGrille()[i][j].setValeur(this.g2.getGrille()[i][j].getValeur()*2);
                       this.g2.getGrille()[i][j].setValeur(0);
                       this.g1.getGrille()[i][j].setValeur(0);
                   }
                   else {  //sinon si valeur de G2 et valeur de G2 ne sont pas égales 
                    this.g3.getGrille()[i][j].setValeur(this.g2.getGrille()[i][j].getValeur());
                    this.g2.getGrille()[i][j].setValeur(this.g1.getGrille()[i][j].getValeur());
                    this.g1.getGrille()[i][j].setValeur(0);
                    }
                }
                else if (this.g3.getGrille()[i][j].getValeur()==this.g2.getGrille()[i][j].getValeur()) { //sinon si valeur de G3 = valeur de G2                   
                    this.g2.getGrille()[i][j].setValeur(this.g1.getGrille()[i][j].getValeur());
                    this.g1.getGrille()[i][j].setValeur(0);
                }
                else if (this.g2.getGrille()[i][j].getValeur()==this.g1.getGrille()[i][j].getValeur()) { //sinon si valeur de G2 = valeur de G1
                    this.g2.getGrille()[i][j].setValeur(this.g2.getGrille()[i][j].getValeur()*2);
                    this.g1.getGrille()[i][j].setValeur(0);
                }
                else if  (this.g2.getGrille()[i][j].getValeur()==0 && this.g3.getGrille()[i][j].getValeur()==this.g1.getGrille()[i][j].getValeur()) { //sinon si valeur de G2 = 0 et valeur de G1 et G3 sont égales
                       this.g3.getGrille()[i][j].setValeur(this.g3.getGrille()[i][j].getValeur()*2);
                       this.g1.getGrille()[i][j].setValeur(0);
               }
               else if  (this.g2.getGrille()[i][j].getValeur()==0 && this.g3.getGrille()[i][j].getValeur()!= 0 && this.g1.getGrille()[i][j].getValeur()!=0 && this.g3.getGrille()[i][j].getValeur()!=this.g1.getGrille()[i][j].getValeur()) {   //sinon si valeur de G2 = 0 et valeur de G1 et G3 ne sont pas égales 
                       this.g2.getGrille()[i][j].setValeur(this.g1.getGrille()[i][j].getValeur());
                       this.g1.getGrille()[i][j].setValeur(0);
                       
               }
            }
            
            }    
    }
        if (deplacement == TIRER) {             //si le déplacement est "tirer" (inférieur)
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
            int[] alea = new int[3];   //tableau de 3 entier contenant un deux 2 et un 4
             alea[0]=2;                //ainsi on viendra choisir aléatoirement une valeur dans ce tableau
             alea[1]=2;                //ce qui reproduit les probabilités de 0.66 d'avoir un 2 et 0.33 d'avoir un 4
             alea[2]=4;
             int n = ra.nextInt(alea.length);   //on choisi un nombre aléatoire dans le tableau
             
             HashSet<Case> vacant = new HashSet<Case>();     //ensemble qui va contenir les cases "vacantes", c'est-à-dire égale à 0
             
             for (int i=0; i<TAILLE; i++) {   //on vient scanner toutes les cases de chaques grilles et si une case à pour valeur 0 on l'ajoute à l'ensemble
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
             
             
             if (!(vacant.isEmpty())) {             //on vérifie si l'ensemble vacant est vide ou non
                                                    //si il n'est pas vide on applique l'algorithme ci-dessous
             int m = ra.nextInt(vacant.size());     //on choisi une valeur aléatoire compris entre 0 et la taille de l'ensemble des cases vacantes
             Case ajout = new Case();;              //on introduit un nouvel élément Case qui sera la case où l'on ajoutera une valeur
             Case[] tab = new Case[vacant.size()];  //on crée un tableau de case de la taille de l'ensemble des cases vacantes
             vacant.toArray(tab);                   //on met dans le tableau les Cases présent dans l'ensemble vacant
             ajout = tab[m];                        //on attribut à ajout une case aléatoire du tableau
             

             
             if (ajout.getNumerogrille()==1){       //on vient regarder de quelle Grille appartient la Case choisi grace à l'attribut numeroGrille d'une Case
                 this.g1.getGrille()[ajout.getX()][ajout.getY()].setValeur(alea[n]);  //on set à la Case choisi une nouvelle valeur choisi aléatoirement (2 ou 4)

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
                 
                 for (int i = 0; i<TAILLE; i++) {  //on vient mettre toutes les Cases dans un HashSet
                   for (int j = 0; j<TAILLE; j++) {
                     ensemble.add(this.g1.getGrille()[i][j]);
                     ensemble.add(this.g2.getGrille()[i][j]);
                     ensemble.add(this.g3.getGrille()[i][j]);
                   }
                 }
                 
                 Iterator<Case> itera = ensemble.iterator();   //on vient itérer toutes les Cases de l'ensemble
                 
                 while (itera.hasNext() && (!stop)) {        
                     if (itera.next().getValeur()==2048) {   //on regarde si une des Cases contient la valeur 2048
                         stop = true;                        //si oui on arrete de l'algo
                     }
                    }
                 
                 return stop;                   //on renvoie true si une Case vaut 2048 sinon false
             }
             
             public boolean gameOver(Cube cube) {
                 
                 HashSet<Case> ensemble = new HashSet<Case>();
                 boolean stop = true;
                 
                 for (int i = 0; i<TAILLE; i++) {  //on vient mettre toutes les Cases dans un HashSet
                   for (int j = 0; j<TAILLE; j++) {
                     ensemble.add(this.g1.getGrille()[i][j]);
                     ensemble.add(this.g2.getGrille()[i][j]);
                     ensemble.add(this.g3.getGrille()[i][j]);
                   }
                 }
                 
                 Iterator<Case> itera = ensemble.iterator();  //on met en place un Iterator
                 Case c = new Case();    //on introduit une nouvelle case qui sera la Case "en cours d'analyse"
                 HashSet<Case> voisin=new HashSet<Case>();   //on introduit un ensemble qui correspond aux Cases voisines de la Case "en cours d'analyse"
                 
                 while (itera.hasNext() && (stop)) {
                     c=itera.next();    //on attriubut à c une Case de l'ensemble des Cases
                     voisin = c.getVoisins(cube);    //on vient récupérer l'ensemble des voisins de la Case évoqué ci-dessus
                     Case[] tab = new Case[voisin.size()];   //on vient mettre les cases voisines dans un un tableau de Cases 
                     voisin.toArray(tab); 
                     for (int i=0; i<tab.length; i++) {   //on parcours le tableau des Cases voisines de la Case "en cours d'analyse
                     if (c.getValeur()==tab[i].getValeur()) {    //si une des Cases voisines à la meme valeur que la Case "en cours d'analyse"
                       stop = false;
                        }
                     }
                 }
                 return stop;    //retourne faux si si il ya un voisin avec la meme valeur
                                 //retourne vrai si il n'y a pas de voisin avec la meme valeur
 
    }
             
}
    

    
    
    
    
    

