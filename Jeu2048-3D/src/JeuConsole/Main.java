/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuConsole;

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
      Grille g = new Grille();
      Grille g2 = new Grille();
      Grille g3 = new Grille();
        boolean b = g.nouvelleCase();
        boolean bb = g2.nouvelleCase();
        boolean bbb = g3.nouvelleCase();
        b = g.nouvelleCase();
        bb = g2.nouvelleCase();
        bbb = g3.nouvelleCase();
        System.out.println(g);
        System.out.println(g2);
        System.out.println(g3);
        
        Scanner sc = new Scanner(System.in);
        /*System.out.println("X:");
        int x= sc.nextInt();
        System.out.println("Y:");
        int y= sc.nextInt();
        System.out.println("Valeur:");
        int valeur= sc.nextInt();
        Case c = new Case(x,y,valeur);
        g.getGrille().remove(c);
        System.out.println(g);*/
        
        while (!g.partieFinie()) {
            System.out.println("Déplacer vers la Droite (d), Gauche (q), Haut (z), ou Bas (s) ?");
            //rajouter f pour étages inférieurs et r pour les étapes supérieurs
            String s = sc.nextLine();
            s.toLowerCase();
            if (!(s.equals("d") || s.equals("droite")
                    || s.equals("q") || s.equals("gauche")
                    || s.equals("z") || s.equals("haut")
                    || s.equals("s") || s.equals("bas"))) {
                System.out.println("Vous devez écrire d pour Droite, q pour Gauche, z pour Haut ou s pour Bas");
            } else {
                int direction;
                if (s.equals("d") || s.equals("droite")) {
                    direction = DROITE;
                } else if (s.equals("q") || s.equals("gauche")) {
                    direction = GAUCHE;
                } else if (s.equals("z") || s.equals("haut")) {
                    direction = HAUT;
                } else {
                    direction = BAS;
                }
                boolean b2 = g.lanceurDeplacerCases(direction);
                boolean b3 = g2.lanceurDeplacerCases(direction);
                boolean b4 = g3.lanceurDeplacerCases(direction);
                if (b2 && b3 && b4) {
                    b = g.nouvelleCase();
                    bb = g2.nouvelleCase();
                    bbb = g3.nouvelleCase();
                    if (!(b && bb && bbb)) {
                        g.gameOver();
                        g2.gameOver();
                        g3.gameOver();
                    }
                }
                System.out.println(g);
                System.out.println(g2);
                System.out.println(g3);
                
                if ((g.getValeurMax()>=OBJECTIF) || (g2.getValeurMax()>OBJECTIF) || (g3.getValeurMax()>=OBJECTIF)) {
                    g.victory();
                        }
            }
        }
        g.gameOver();
        /*
        // Bout de code pour tester manuellement si une grille contient une case ou pas
        Scanner sc = new Scanner(System.in);
        System.out.println("x :");
        int x = sc.nextInt();
        System.out.println("y :");
        int y = sc.nextInt();
        Case c = new Case(x, y, 2);
        Case c2 = new Case(x, y, 4);
        System.out.println("test1=" + g.getGrille().contains(c));
        System.out.println("test2=" + g.getGrille().contains(c2));
         */
    } 
}
        
