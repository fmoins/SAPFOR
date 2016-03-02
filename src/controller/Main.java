/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;

/**
 *
 * @author Christophe
 */

public class Main extends Application {

    private Stage primaryStage;
<<<<<<< HEAD
    private AnchorPane rootLayout;
=======
    private BorderPane rootLayout;
>>>>>>> 20030e3aeaf8551b0bf5fc4dfbfe30a4b2b4ab03

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("SAPFOR");
<<<<<<< HEAD
        initRootLayout();
     //   showSample();
=======

        initRootLayout();

        showSample();
>>>>>>> 20030e3aeaf8551b0bf5fc4dfbfe30a4b2b4ab03
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
<<<<<<< HEAD
            loader.setLocation(Main.class.getResource("../view/Connexion.fxml"));
            rootLayout = (AnchorPane) loader.load();
=======
            loader.setLocation(Main.class.getResource("../view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
>>>>>>> 20030e3aeaf8551b0bf5fc4dfbfe30a4b2b4ab03

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
<<<<<<< HEAD
  /*  public void showSample() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../view/UserView.fxml"));
=======
    public void showSample() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../view/Connexion.fxml"));
>>>>>>> 20030e3aeaf8551b0bf5fc4dfbfe30a4b2b4ab03
            AnchorPane Connexion = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(Connexion);
        } catch (IOException e) {
            e.printStackTrace();
        }
<<<<<<< HEAD
    }*/
=======
    }
>>>>>>> 20030e3aeaf8551b0bf5fc4dfbfe30a4b2b4ab03

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
    

