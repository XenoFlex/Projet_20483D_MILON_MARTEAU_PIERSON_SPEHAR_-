/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleGame;
import application.ConnexionBDD;
import application.Parser;
import java.util.Random;
import java.util.Scanner;
import java.io.Serializable;
import java.util.ArrayList;


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
      Cube cube = new Cube();             //initialisation du Cube
      Joueur joueur = new Joueur("j1", "0");
      boolean bloque = false;             // boolean répresentant si le jeu est bloqué ou non
      boolean victoire = false;           // boolean représentant si le joueur à gagné donc une case est égale à 2048
      boolean pseudovalide = false;
      int compteur = 0;                   //compteur pour le nombre de coup  
      
      cube = init();                      //initialisation du cube
      cube.randomCase();                  //ajout d'un nouvelles case (2 ou 4)
      cube.randomCase();                  //ajout d'un nouvelles case (2 ou 4)
      
      
      while (!pseudovalide) {             //le joueur inscrit son pseudonyme
      System.out.println("Quel est votre pseudo ?");
      joueur.setPseudo(sc.nextLine());
      if (joueur.getPseudo().length()<=10) {
          pseudovalide = true;
      }
      }
      
      System.out.println("");
      
      cube.affichage();                   //affichage des 3 grilles (donc du cube)
      
      
      while ((!bloque) && (!victoire)) {    //la boucle s'arrete lorsque le joueur a gagné ou perdu
          
       System.out.println("Déplacer vers la Droite (d), Gauche (q), Haut (z), Bas (s), Random (w), Inferieur (f), Superieur(r) ?");     //on demande la direction au joueur
            String s = sc.nextLine();       
            s.toLowerCase();
            //si la lettre rentrée ne correspond pas aux lettres possibles, un message d'erreur s'affiche
            if (!(s.equals("d") || s.equals("droite")
                    || s.equals("q") || s.equals("gauche")
                    || s.equals("z") || s.equals("haut")
                    || s.equals("s") || s.equals("bas")                                //ensemble de direction que peut choisir le joueur
                    || s.equals("w") || s.equals("random")
                    || s.equals("f")  || s.equals("inferieur")
                    || s.equals("r")  || s.equals("superieur"))) {
                System.out.println("Vous devez écrire d pour Droite, g pour Gauche, h pour Haut, b pour Bas, f pour inférieur et r pour supérieur");  //message d'erreur lorsque le joueur ecrit autre chose qu'une direction valide
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
                } else if (s.equals("w") || s.equals("random")){      //ajout de la possibilité pour le joueur de choisir de manière aléatoire sa la direction de son déplacement
                    Random rand = new Random();
                    int randomNum = rand.nextInt((6 - 1)+1) + 1;
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
                        case 5:
                            direction = TIRER;
                            break;
                        case 6:
                            direction = POUSSER;
                            break;
                            
                    }
                }
                if (direction==TIRER || direction==POUSSER) {   //si la direction est une direction "particulière" (POUSSER OU TIRER)
                    cube.deplacementParticulier(direction);    //methode deplacementParticulier
                    compteur++;                                 //+1 au compteur à chaque déplacement
                } else {                                        //si la direction est "simple" on applique la methode deplacementSimple à chaque grille (g1, g2, g3)
                    cube.getG1().deplacementSimple(direction);
                    cube.getG2().deplacementSimple(direction);
                    cube.getG3().deplacementSimple(direction);
                    compteur++;
                }
          
                victoire=cube.victoire2048(); //si une valeur du cube est égale à 2048 alors le joueur a gagné et fin du while
                bloque=cube.gameOver(cube);     //si le jeu se retrouve bloque alors défaite et fin du while
                
                cube.randomCase();              //ajout d'un 2 ou d'un 4 sur une case libre (donc égale à 0)
                
                System.out.println(" ");
                
                System.out.println("===================");
                
                System.out.println("JOUEUR : " + joueur.getPseudo());
       
                System.out.println(" ");
                
                System.out.println("Coup numéro : "+ compteur);   //affichage du nombre de coup
                
                System.out.println(" ");

            if (direction == GAUCHE) {                              //affichage de la direction choisi
                System.out.println("Direction choisie : GAUCHE ");
            }
            else if (direction == DROITE) {
                System.out.println("Direction choisie : DROITE ");
            }
            else if (direction == HAUT) {
                System.out.println("Direction choisie : HAUT ");
            }
            else if (direction == BAS) {
                System.out.println("Direction choisie : BAS ");
            }
            else if (direction == POUSSER) {
                System.out.println("Direction choisie : SUPERIEUR ");
            }
            else if (direction == TIRER) {
                System.out.println("Direction choisie : INFERIEUR ");
            }
            System.out.println(" ");
            cube.affichage();                                       //affichage du cube apres déplacement
      
    }
    }
    
    if (victoire) {                                         //lorsque la boucle while est fini, on vérifie si c'était pour la victoire ou si le jeu est bloqué
        System.out.println ("Bravo " + joueur.getPseudo() + "vous avez gagné ! ");
        System.out.println ("Nombre de coup total : " + compteur);
    } else if (bloque) {
        System.out.println ("Vous avez perdu "+ joueur.getPseudo()+" ! (le jeu est bloqué)");
        System.out.println ("Nombre de coup total : " + compteur);
    }
    
    }
    
    
    public static Cube init() {   //fonction d'initialisation du Cube
        
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
    
     /* public static void(args){
        String s;
        if (args.length > 0) {
            s = args[0];
        } else {
            s = "classement_joueurs.csv"; // nom du fichier .csv par défaut
        }

        // lecture et écriture dans un fichier .csv
        Parser p = new Parser(s);
        ArrayList<Joueur> joueur = p.parseJoueur(); //retourne la liste des joueurs contenus dans le fichier .csv
        System.out.println(joueur); //affiche la liste des joueurs dans la console
        Joueur i = new Joueur("eva,22");
        p.addInternaute(i); //ajoute un joueur dans le fichier .csv
        // interrogation et insertion de tuple dans la base de données
        String host = "mysql-l2sciencesco.alwaysdata.net";
        String port = "3306";
        String dbname = "l2sciencesco_films";
        String username = "199592";
        String password = "L2sco;2020.";
        ConnexionBDD c = new ConnexionBDD(host, port, dbname, username, password);

        ArrayList<String> l = c.getTuples("SELECT * FROM Internaute");
        System.out.println("Liste des joueurs deja presents dans la base :");
        System.out.println(l);

        for (Joueur joueur : joueur){ //inserer les joueurs du fichier .csv dans la base
            String query = "INSERT INTO Joueur VALUES ('"+joueur.getPseudo()+"','"+joueur.getScore()+"')";
            c.insertTuples(query);
        }*/
    }

    }
      
