package application;

import dblayer.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hhhh.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            
            // Create a new Scene with the loaded root pane
            Scene scene = new Scene(root, 1300, 730);
            
            // Set the Scene to the primary stage
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
