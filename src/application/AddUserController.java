package application;

import dblayer.DBHandler;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddUserController {


    @FXML
    private Button backbutton;

    @FXML
    private ImageView newsback;

    @FXML
    private Button saveuser;

    @FXML
    private TextField useremail;

    @FXML
    private TextField username;

    @FXML
    private TextField userpass;
    
    @FXML
    private Text added;

    @FXML
    void switchToUserManage(ActionEvent event) throws IOException {
          // Load the hhhh.fxml file
          FXMLLoader loader = new FXMLLoader(getClass().getResource("AddDel.fxml"));
          Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // Get the current stage
          Scene scene = new Scene(loader.load()); // Create a new scene with the hhhh.fxml content
          stage.setScene(scene); // Set the scene to the stage
          stage.show(); // Show the stage
    }
    @FXML
    void saveUser(ActionEvent event) throws IOException {
    	DBHandler db=new DBHandler();
          db.saveStudent(useremail.getText(),userpass.getText());
          added.setText("User has been successfully added");
    }

}
