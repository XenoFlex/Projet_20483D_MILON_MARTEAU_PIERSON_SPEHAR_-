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
public class Case {
    
    private int x, y, valeur, numerogrille;
    
    public Case(int abs, int ord, int v, int n) {       //constructeur
        this.x = abs;
        this.y = ord;
        this.valeur = v;
        this.numerogrille = n;
    }
    
    public Case(){
        
    }

   
    public int getX() {         //getter
        return this.x;
    }

    public int getY() {         //getter
        return this.y;
    }

    public void setX(int x) {       //setter
        this.x = x;
    }

    public void setY(int y) {       //setter
        this.y = y;     
    }


    public void setValeur(int valeur) {         //  setter
        this.valeur = valeur;
    }

    public int getValeur() {            //getter
        return this.valeur;
    }

    public int getNumerogrille() {          //getter
        return numerogrille;
    }

    public void setNumerogrille(int numerogrille) {     //setter
        this.numerogrille = numerogrille;
    }
    
    public Case setCase(Case c) {
        return c;
    }
    
    public HashSet<Case> getVoisins (Cube cube) {
        
        HashSet<Case> voisin = new HashSet<Case>();
        
        if (this.x==0  && this.y==0 && this.numerogrille==1) {
            voisin.add(setCase(cube.getG1().getGrille()[0][1]));
            voisin.add(setCase(cube.getG1().getGrille()[1][0]));
            voisin.add(setCase(cube.getG2().getGrille()[0][0]));
        }
        else if (this.x==1  && this.y==0 && this.numerogrille==1) {
            voisin.add(setCase(cube.getG1().getGrille()[0][0]));
            voisin.add(setCase(cube.getG1().getGrille()[2][0]));
            voisin.add(setCase(cube.getG1().getGrille()[1][1]));
            voisin.add(setCase(cube.getG2().getGrille()[1][0]));
        }
        else if (this.x==2  && this.y==0 && this.numerogrille==1) {
            voisin.add(setCase(cube.getG1().getGrille()[1][0]));
            voisin.add(setCase(cube.getG1().getGrille()[1][2]));
            voisin.add(setCase(cube.getG2().getGrille()[2][0]));
        }
        else if (this.x==0  && this.y==1 && this.numerogrille==1) {
            voisin.add(setCase(cube.getG1().getGrille()[0][0]));
            voisin.add(setCase(cube.getG1().getGrille()[1][1]));
            voisin.add(setCase(cube.getG1().getGrille()[0][2]));
            voisin.add(setCase(cube.getG2().getGrille()[0][1]));
        }
        else if (this.x==1  && this.y==1 && this.numerogrille==1) {
            voisin.add(setCase(cube.getG1().getGrille()[1][0]));
            voisin.add(setCase(cube.getG1().getGrille()[0][1]));
            voisin.add(setCase(cube.getG1().getGrille()[2][1]));
            voisin.add(setCase(cube.getG1().getGrille()[1][2]));
            voisin.add(setCase(cube.getG2().getGrille()[1][1]));
        }
        else if (this.x==2  && this.y==1 && this.numerogrille==1) {
            voisin.add(setCase(cube.getG1().getGrille()[2][0]));
            voisin.add(setCase(cube.getG1().getGrille()[2][2]));
            voisin.add(setCase(cube.getG1().getGrille()[1][1]));
            voisin.add(setCase(cube.getG2().getGrille()[2][1]));
        }
        else if (this.x==0  && this.y==2 && this.numerogrille==1) {
            voisin.add(setCase(cube.getG1().getGrille()[0][1]));
            voisin.add(setCase(cube.getG1().getGrille()[1][2]));
            voisin.add(setCase(cube.getG2().getGrille()[0][2]));
        }
        else if (this.x==1  && this.y==2 && this.numerogrille==1) {
            voisin.add(setCase(cube.getG1().getGrille()[0][2]));
            voisin.add(setCase(cube.getG1().getGrille()[2][2]));
            voisin.add(setCase(cube.getG1().getGrille()[1][1]));
            voisin.add(setCase(cube.getG2().getGrille()[1][2]));
        }
        else if (this.x==2  && this.y==2 && this.numerogrille==1) {
            voisin.add(setCase(cube.getG1().getGrille()[2][1]));
            voisin.add(setCase(cube.getG1().getGrille()[1][2]));
            voisin.add(setCase(cube.getG2().getGrille()[2][2]));
        }
        
        
        
        
        
        
        
        
        else if (this.x==0  && this.y==0 && this.numerogrille==2) {
            voisin.add(setCase(cube.getG2().getGrille()[0][1]));
            voisin.add(setCase(cube.getG2().getGrille()[1][0]));
            voisin.add(setCase(cube.getG3().getGrille()[0][0]));
            voisin.add(setCase(cube.getG1().getGrille()[0][0]));
        }
        else if (this.x==1  && this.y==0 && this.numerogrille==2) {
            voisin.add(setCase(cube.getG2().getGrille()[0][0]));
            voisin.add(setCase(cube.getG2().getGrille()[2][0]));
            voisin.add(setCase(cube.getG2().getGrille()[1][1]));
            voisin.add(setCase(cube.getG3().getGrille()[1][0]));
            voisin.add(setCase(cube.getG1().getGrille()[1][0]));
        }
        else if (this.x==2  && this.y==0 && this.numerogrille==2) {
            voisin.add(setCase(cube.getG2().getGrille()[1][0]));
            voisin.add(setCase(cube.getG2().getGrille()[1][2]));
            voisin.add(setCase(cube.getG3().getGrille()[2][0]));
            voisin.add(setCase(cube.getG1().getGrille()[2][0]));
        }
        else if (this.x==0  && this.y==1 && this.numerogrille==2) {
            voisin.add(setCase(cube.getG2().getGrille()[0][0]));
            voisin.add(setCase(cube.getG2().getGrille()[1][1]));
            voisin.add(setCase(cube.getG2().getGrille()[0][2]));
            voisin.add(setCase(cube.getG3().getGrille()[0][1]));
            voisin.add(setCase(cube.getG1().getGrille()[0][1]));
        }
        else if (this.x==1  && this.y==1 && this.numerogrille==2) {
            voisin.add(setCase(cube.getG2().getGrille()[1][0]));
            voisin.add(setCase(cube.getG2().getGrille()[0][1]));
            voisin.add(setCase(cube.getG2().getGrille()[2][1]));
            voisin.add(setCase(cube.getG2().getGrille()[1][2]));
            voisin.add(setCase(cube.getG3().getGrille()[1][1]));
            voisin.add(setCase(cube.getG1().getGrille()[1][1]));
            
        }
        else if (this.x==2  && this.y==1 && this.numerogrille==2) {
            voisin.add(setCase(cube.getG2().getGrille()[2][0]));
            voisin.add(setCase(cube.getG2().getGrille()[2][2]));
            voisin.add(setCase(cube.getG2().getGrille()[1][1]));
            voisin.add(setCase(cube.getG3().getGrille()[2][1]));
            voisin.add(setCase(cube.getG1().getGrille()[2][1]));
        }
        else if (this.x==0  && this.y==2 && this.numerogrille==2) {
            voisin.add(setCase(cube.getG2().getGrille()[0][1]));
            voisin.add(setCase(cube.getG2().getGrille()[1][2]));
            voisin.add(setCase(cube.getG3().getGrille()[0][2]));
            voisin.add(setCase(cube.getG1().getGrille()[0][2]));
        }
        else if (this.x==1  && this.y==2 && this.numerogrille==2) {
            voisin.add(setCase(cube.getG2().getGrille()[0][2]));
            voisin.add(setCase(cube.getG2().getGrille()[2][2]));
            voisin.add(setCase(cube.getG2().getGrille()[1][1]));
            voisin.add(setCase(cube.getG3().getGrille()[1][2]));
            voisin.add(setCase(cube.getG1().getGrille()[1][2]));
        }
        else if (this.x==2  && this.y==2 && this.numerogrille==2) {
            voisin.add(setCase(cube.getG2().getGrille()[2][1]));
            voisin.add(setCase(cube.getG2().getGrille()[1][2]));
            voisin.add(setCase(cube.getG3().getGrille()[2][2]));
            voisin.add(setCase(cube.getG1().getGrille()[2][2]));
        }
        
        
        
        
        
        
       
        
        else if (this.x==0  && this.y==0 && this.numerogrille==3) {
            voisin.add(setCase(cube.getG3().getGrille()[0][1]));
            voisin.add(setCase(cube.getG3().getGrille()[1][0]));
            voisin.add(setCase(cube.getG2().getGrille()[0][0]));
        }
        else if (this.x==1  && this.y==0 && this.numerogrille==3) {
            voisin.add(setCase(cube.getG3().getGrille()[0][0]));
            voisin.add(setCase(cube.getG3().getGrille()[2][0]));
            voisin.add(setCase(cube.getG3().getGrille()[1][1]));
            voisin.add(setCase(cube.getG2().getGrille()[1][0]));
        }
        else if (this.x==2  && this.y==0 && this.numerogrille==3) {
            voisin.add(setCase(cube.getG3().getGrille()[1][0]));
            voisin.add(setCase(cube.getG3().getGrille()[1][2]));
            voisin.add(setCase(cube.getG2().getGrille()[2][0]));
        }
        else if (this.x==0  && this.y==1 && this.numerogrille==3) {
            voisin.add(setCase(cube.getG3().getGrille()[0][0]));
            voisin.add(setCase(cube.getG3().getGrille()[1][1]));
            voisin.add(setCase(cube.getG3().getGrille()[0][2]));
            voisin.add(setCase(cube.getG2().getGrille()[0][1]));
        }
        else if (this.x==1  && this.y==1 && this.numerogrille==3) {
            voisin.add(setCase(cube.getG3().getGrille()[1][0]));
            voisin.add(setCase(cube.getG3().getGrille()[0][1]));
            voisin.add(setCase(cube.getG3().getGrille()[2][1]));
            voisin.add(setCase(cube.getG3().getGrille()[1][2]));
            voisin.add(setCase(cube.getG2().getGrille()[1][1]));
        }
        else if (this.x==2  && this.y==1 && this.numerogrille==3) {
            voisin.add(setCase(cube.getG3().getGrille()[2][0]));
            voisin.add(setCase(cube.getG3().getGrille()[2][2]));
            voisin.add(setCase(cube.getG3().getGrille()[1][1]));
            voisin.add(setCase(cube.getG2().getGrille()[2][1]));
        }
        else if (this.x==0  && this.y==2 && this.numerogrille==3) {
            voisin.add(setCase(cube.getG3().getGrille()[0][1]));
            voisin.add(setCase(cube.getG3().getGrille()[1][2]));
            voisin.add(setCase(cube.getG2().getGrille()[0][2]));
        }
        else if (this.x==1  && this.y==2 && this.numerogrille==3) {
            voisin.add(setCase(cube.getG3().getGrille()[0][2]));
            voisin.add(setCase(cube.getG3().getGrille()[2][2]));
            voisin.add(setCase(cube.getG3().getGrille()[1][1]));
            voisin.add(setCase(cube.getG2().getGrille()[1][2]));
        }
        else if (this.x==2  && this.y==2 && this.numerogrille==3) {
            voisin.add(setCase(cube.getG3().getGrille()[2][1]));
            voisin.add(setCase(cube.getG3().getGrille()[1][2]));
            voisin.add(setCase(cube.getG2().getGrille()[2][2]));
        }
        
        
        return voisin;
               
    }
    
    
    
}
