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
public class Main implements Parametres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        // TODO code application logic here
      
      Cube cube = new Cube();
      boolean end = false;
        
      cube = init();
      cube.randomCase();
      cube.randomCase();
      cube.affichage();
      
      
      
      //while (!end) {
       cube.randomCase();
       System.out.println("===================");
       System.out.println("===================");
       
       System.out.println(" ");
       cube.affichage();
       
       cube.randomCase();
       System.out.println("===================");
       System.out.println("===================");
       
       System.out.println(" ");
       cube.affichage();
       
       cube.randomCase();
       System.out.println("===================");
       System.out.println("===================");
       
       System.out.println(" ");
       cube.affichage();
       
       cube.randomCase();
       System.out.println("===================");
       System.out.println("===================");
       
       System.out.println(" ");
       cube.affichage();
       
       cube.randomCase();
       System.out.println("===================");
       System.out.println("===================");
       
       System.out.println(" ");
       cube.affichage();
       
       cube.randomCase();
       System.out.println("===================");
       System.out.println("===================");
       
       System.out.println(" ");
       cube.affichage();
       
       cube.randomCase();
       System.out.println("===================");
       System.out.println("===================");
       
       System.out.println(" ");
       cube.affichage();
       
       cube.randomCase();
       System.out.println("===================");
       System.out.println("===================");
       
       System.out.println(" ");
       cube.affichage();
      
      
      
      
      
      
      
      
   
      
      
      //System.out.println(cube.getG1().getGrille()[0][0].getValeur());
      

        
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
