/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ALEX
 */
public class Jeu2048FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }

    @FXML
    private void handleButtonAction(MouseEvent event) {
        System.out.println("Clic de souris sur le bouton menu");
    }    
    
    @FXML
    public void keyPressed(KeyEvent ke) {
        System.out.println("touche appuyée");
        String touche = ke.getText();
        if (touche.compareTo("q") == 0) { // utilisateur appuie sur "q" pour envoyer la tuile vers la gauche

        } else if (touche.compareTo("d") == 0) { // utilisateur appuie sur "d" pour envoyer la tuile vers la droite

        }
    }
    
}
