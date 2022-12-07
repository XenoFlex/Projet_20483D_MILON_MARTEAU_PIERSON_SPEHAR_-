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
import javafx.scene.Parent;
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
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/application/Jeu2048FXML.fxml"));
        //FXMLDocumentController controller = new FXMLDocumentController();//avec les éventuels paramètres s'il y en a, mais si vous avez laissé le constructeur par défaut il n'y aura pas de paramètre
        //FXMLLoader loader = new FXMLLoader();
        //loader.setLocation(getClass().getResource("/application/FXMLDocument.fxml"));
        //loader.setController(controller);
        //Parent root = loader.load();
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
