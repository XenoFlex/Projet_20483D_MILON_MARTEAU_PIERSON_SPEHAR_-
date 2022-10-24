/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuConsole;

/**
 *
 * @author ALEX
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] g1 = new int[3][3];
        int[][] g2 =  new int[3][3];
        int[][] g3 =  new int[3][3];
        
        
        
    }
    
    public static void affichage(int[][] g) {
        
        for (int i=0;i<3;i++){
            for (int j=0; j<3; j++) {
                System.out.print(g[i][j]);
            }
            System.out.println(" ");
        }
        
    }
    
    public static void déplacementSimple (int [][] g, String direction) {
        if (direction=="gauche") {
            for (int i=0; i<3; i++) {
                if ((g[i][0]==0) && (g[i][1]==0)) {
                    g[i][0]=g[i][2];
                    g[i][2]=0;
                } else {
                    
                }
            }
        }
    }     
}
