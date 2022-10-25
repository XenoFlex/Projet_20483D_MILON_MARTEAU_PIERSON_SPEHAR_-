/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ALEX
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
      // Localisation du fichier FXML.
      final URL url = getClass().getResource("Jeu2048FXML.fxml");
      // Création du loader.
      final FXMLLoader fxmlLoader = new FXMLLoader(url);
      // Chargement du FXML.
      final AnchorPane root = (AnchorPane) fxmlLoader.load();
      // Création de la scène.
      final Scene scene = new Scene(root, 300, 250);
      primaryStage.setScene(scene);
    } catch (IOException ex) {
      System.err.println("Erreur au chargement: " + ex);
    }
    primaryStage.setTitle("C'est le 2048");
    primaryStage.show();
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
