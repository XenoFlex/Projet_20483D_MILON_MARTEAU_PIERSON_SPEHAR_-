/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleGame;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author ALEX
 */
public class Main implements Parametres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        // TODO code application logic here
      Scanner sc = new Scanner(System.in);
      Cube cube = new Cube();
      boolean bloque = false;
      boolean victoire = false;
      int compteur = 0;
        
      cube = init();
      cube.randomCase();
      cube.randomCase();
      cube.affichage();
      
      
      while ((!bloque) && (!victoire)) {
          
       System.out.println("Déplacer vers la Droite (d), Gauche (q), Haut (z), Bas (s), Random (w), Inferieur (f), Superieur(r) ?");
            String s = sc.nextLine();       
            s.toLowerCase();
            //si la lettre rentrée ne correspond pas aux lettres possibles, un message d'erreur s'affiche
            if (!(s.equals("d") || s.equals("droite")
                    || s.equals("q") || s.equals("gauche")
                    || s.equals("z") || s.equals("haut")
                    || s.equals("s") || s.equals("bas")
                    || s.equals("w") || s.equals("random")
                    || s.equals("f")  || s.equals("inferieur")
                    || s.equals("r")  || s.equals("superieur"))) {
                System.out.println("Vous devez écrire d pour Droite, g pour Gauche, h pour Haut, b pour Bas, f pour inférieur et r pour supérieur");
            } else {    //s'il n'y a pas d'erreur
                int direction = DROITE;
                if (s.equals("d") || s.equals("droite")) {
                    direction = DROITE;
                } else if (s.equals("q") || s.equals("gauche")) {
                    direction = GAUCHE;
                } else if (s.equals("z") || s.equals("haut")) {
                    direction = HAUT;
                } else if (s.equals("s") || s.equals("bas")){
                    direction = BAS;
                } else if (s.equals("r") || s.equals("tirer")) {
                    direction = TIRER;
                } else if (s.equals("f") || s.equals("pousser")){
                    direction = POUSSER;
                } else if (s.equals("w") || s.equals("random")){
                    Random rand = new Random();
                    int randomNum = rand.nextInt((4 - 1)+1) + 1;
                    switch(randomNum){
                        case 1:
                            direction = DROITE;
                            break;
                            
                        case 2:
                            direction = GAUCHE;
                            break;
                            
                        case 3:
                            direction = HAUT;
                            break;
                            
                        case 4:
                            direction = BAS;
                            break;
                            
                    }
                }
                if (direction==TIRER || direction==POUSSER) {
                    cube.deplacementParticulier(direction);
                    compteur++;
                } else {
                    cube.getG1().deplacementSimple(direction);
                    cube.getG2().deplacementSimple(direction);
                    cube.getG3().deplacementSimple(direction);
                    compteur++;
                }
          
                bloque=cube.gameOver(cube);     //si le jeu se retrouve bloque alors défaite et fin du while
                victoire=cube.victoire2048(); //si une valeur du cube est égale à 2048 alors le joueur a gagné et fin du while
                cube.randomCase();              
                
                System.out.println(" ");
                
                System.out.println("===================");
       
                System.out.println(" ");
                
                System.out.println("Coup numéro : "+ compteur);
                
                System.out.println(" ");

            if (direction == GAUCHE) {
                System.out.println("Direction choisi : GAUCHE ");
            }
            else if (direction == DROITE) {
                System.out.println("Direction choisi : DROITE ");
            }
            else if (direction == HAUT) {
                System.out.println("Direction choisi : HAUT ");
            }
            else if (direction == BAS) {
                System.out.println("Direction choisi : BAS ");
            }
            else if (direction == POUSSER) {
                System.out.println("Direction choisi : SUPERIEUR ");
            }
            else if (direction == TIRER) {
                System.out.println("Direction choisi : INFERIEUR ");
            }
            System.out.println(" ");
            cube.affichage();
      
    }
    }
    
    if (victoire) {
        System.out.println ("Bravo vous avez gagné ! ");
        System.out.println ("Nombre de coup total : " + compteur);
    } else if (bloque) {
        System.out.println ("Vous avez perdu ! (le jeu est bloqué");
    }
    
    }
    
    public static Cube init() {
        
      Case[][] initia1 = new Case[TAILLE][TAILLE];
      Case[][] initia2 = new Case[TAILLE][TAILLE];
      Case[][] initia3 = new Case[TAILLE][TAILLE];
      
      for(int i=0; i<TAILLE; i++) {
          for (int j=0; j<TAILLE; j++) {
               initia1[i][j] = new Case(i, j, 0, 1);
        }
      }
      
      for(int i=0; i<TAILLE; i++) {
          for (int j=0; j<TAILLE; j++) {
               initia2[i][j] = new Case(i, j, 0, 2);
        }
      }
      
      for(int i=0; i<TAILLE; i++) {
          for (int j=0; j<TAILLE; j++) {
               initia3[i][j] = new Case(i, j, 0, 3);
        }
      }
      
      Grille g1 = new Grille(); 
      Grille g2 = new Grille();
      Grille g3 = new Grille();
      
      g1.setGrille(initia1, 1);
      g2.setGrille(initia2, 2);
      g3.setGrille(initia3, 3);
      
      Cube cube = new Cube(g1, g2, g3);
      
      return cube;
        
    }
      
    
    
}
