/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import ConsoleGame.Case;
import ConsoleGame.Grille;
import static ConsoleGame.Parametres.TAILLE;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * FXML Controller class
 *
 * @author ALEX
 */
public class Jeu2048FXMLController implements Initializable {

    /*
     * Variables globales correspondant à des objets définis dans la vue (fichier .fxml)
     * Ces variables sont ajoutées à la main et portent le même nom que les fx:id dans Scene Builder
     */
    
    @FXML
    private Button Test;
    
    @FXML
    private Button godroite;
    
    @FXML
    private Button gogauche;
    
    @FXML
    private Button gobas;
    
    @FXML
    private Button gohaut;
    
    @FXML
    private GridPane Grillefx1;
    
    @FXML
    private GridPane Grillefx2;
    
    @FXML
    private GridPane Grillefx3;
    
    // variable globale pour initialiser le modèle
    private Grille grilleModele1 = new Grille();
    private Grille grilleModele2 = new Grille();
    private Grille grilleModele3 = new Grille();
    
    public void Test(ActionEvent event){
        System.out.println("Okay");
        Text text0 = new Text("0");
        /*for(int i = 0; i<3;i++){
            for(int j = 0; i<3;i++){
                text0.setTextAlignment(TextAlignment.CENTER);
                Grillefx3.add(text0, i, j);
                Grillefx3.setHalignment(text0 ,HPos.CENTER);
            }
        }*/
        text0.setTextAlignment(TextAlignment.CENTER);
        Grillefx3.setHalignment(text0 ,HPos.CENTER);
                Grillefx3.add(new Text("0"), 0, 0);
                Grillefx3.add(new Text("0"), 0, 1);
                Grillefx3.add(new Text("0"), 0, 2);
                Grillefx3.add(new Text("0"), 1, 0);
                Grillefx3.add(new Text("2"), 1, 1);
                Grillefx3.add(new Text("0"), 1, 2);
                Grillefx3.add(new Text("0"), 2, 0);
                Grillefx3.add(new Text("0"), 2, 1);
                Grillefx3.add(new Text("0"), 2, 2);
        
        /*Text text2 = new Text("2");
        text2.setTextAlignment(TextAlignment.CENTER);
        Grillefx3.add(text2, 1, 1);
        Grillefx3.setHalignment(text2, HPos.CENTER);*/
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        System.out.println("le contrôleur initialise la vue");
        // utilisation de styles pour la grille et la tuile (voir styles.css)
        
        
    }
    
  
    public void godroite(ActionEvent event){
        System.out.println("Déplacement droite");
        Grillefx3.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1 && GridPane.getRowIndex(node) == 1);
        //System.out.println(Grillefx3.getCellBounds(0, TAILLE));
    }
    
    public void gogauche(ActionEvent event){
        System.out.println("Déplacement gauche");
        
    }
    
    public void gobas(ActionEvent event){
        System.out.println("Déplacement bas");
        
    }
    
    public void gohaut(ActionEvent event){
        System.out.println("Déplacement haut");
        
    }

    

    @FXML
    private void handleButtonAction(MouseEvent event) {
        System.out.println("Clic de souris sur le bouton menu");
    }
    

    @FXML
    public void keyPressed(KeyEvent ke) throws InterruptedException {
        System.out.println("touche appuyée");
        String touche = ke.getText();
        if (touche.compareTo("q") == 0) { // utilisateur appuie sur "q" pour envoyer la tuile vers la gauche
  
        } else if (touche.compareTo("d") == 0) { // utilisateur appuie sur "d" pour envoyer la tuile vers la droite
            System.out.println("okayokay");
  
        } else if (touche.compareTo("z") == 0) { // utilisateur appuie sur "d" pour envoyer la tuile vers la droite
            
        } else if (touche.compareTo("s") == 0) { // utilisateur appuie sur "d" pour envoyer la tuile vers la droite
            
            }
        }
    }