package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AdminControl {

    @FXML
    private Button logoutbutton;

    @FXML
    private Button newspanel;

    @FXML
    private Button userpanel;

    @FXML
    void switchtoLogin(ActionEvent event) throws IOException {
        // Load the hhhh.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // Get the current stage
        Scene scene = new Scene(loader.load()); // Create a new scene with the hhhh.fxml content
        stage.setScene(scene); // Set the scene to the stage
        stage.show(); // Show the stage
    }

    @FXML
    void switchtoNewsControl(ActionEvent event) throws IOException {
        // Load the hhhh.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddDeleteNews.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // Get the current stage
        Scene scene = new Scene(loader.load()); // Create a new scene with the hhhh.fxml content
        stage.setScene(scene); // Set the scene to the stage
        stage.show(); // Show the stage
    }
    
    @FXML
    void switchtoUserControl(ActionEvent event) throws IOException {
        // Load the hhhh.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddDel.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // Get the current stage
        Scene scene = new Scene(loader.load()); // Create a new scene with the hhhh.fxml content
        stage.setScene(scene); // Set the scene to the stage
        stage.show(); // Show the stage
    }
    
}
