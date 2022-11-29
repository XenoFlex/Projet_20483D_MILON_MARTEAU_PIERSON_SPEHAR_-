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
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        System.out.println("le contrôleur initialise la vue");
        // utilisation de styles pour la grille et la tuile (voir styles.css)
        
        
    }
    
  
    public void godroite(ActionEvent event){
        System.out.println("OkayOkay");
        Text text = new Text("2");
        text.setTextAlignment(TextAlignment.CENTER);
        Grillefx2.add(text, 2, 1);
        Grillefx2.setHalignment(text, HPos.CENTER);
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