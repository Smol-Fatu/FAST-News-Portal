package application;

import java.io.IOException;

import dblayer.DBHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private ImageView loginback;

    @FXML
    private Button loginbutton;

    @FXML
    private TextArea loginemail;

    @FXML
    private PasswordField loginpassword;
    
    @FXML
    void switchtoSignup(ActionEvent event) throws IOException {
        // Load the hhhh.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Signup.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // Get the current stage
        Scene scene = new Scene(loader.load()); // Create a new scene with the hhhh.fxml content
        stage.setScene(scene); // Set the scene to the stage
        stage.show(); // Show the stage
    }

    @FXML
    void switchToPortals(ActionEvent event) throws IOException {
        DBHandler db=new DBHandler();
        if( db.searchAdmin(loginemail.getText(), loginpassword.getText())==1) {
			  System.out.println(loginemail.getText());
      // Load the hhhh.fxml file
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("adminpanel.fxml"));
	        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // Get the current stage
	        Scene scene = new Scene(loader.load()); // Create a new scene with the hhhh.fxml content
	        stage.setScene(scene); // Set the scene to the stage
	        stage.show(); // Show the stage
	    }
        else if( db.searchStudent(loginemail.getText(), loginpassword.getText())==1) {
			  System.out.println(loginemail.getText());
        // Load the hhhh.fxml file
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("hhhh.fxml"));
	        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // Get the current stage
	        Scene scene = new Scene(loader.load()); // Create a new scene with the hhhh.fxml content
	        stage.setScene(scene); // Set the scene to the stage
	        stage.show(); // Show the stage
	    }
        else
        	System.out.println("Not found");
    }
}
