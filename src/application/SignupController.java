package application;

import java.io.IOException;

import javafx.scene.text.Text;
import dblayer.DBHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SignupController {

    @FXML
    private Text added;
    
    @FXML
    private ImageView signupback;

    @FXML
    private Button signupbutton;

    @FXML
    private TextArea signupemail;

    @FXML
    private TextArea signupid;

    @FXML
    private Hyperlink signuplogin;

    @FXML
    private PasswordField signuppassword;

    @FXML
    private AnchorPane root; 

    @FXML
    void saveStudent(ActionEvent event) throws IOException {
    	DBHandler db=new DBHandler();
        db.saveStudent(signupemail.getText(),signuppassword.getText());
        added.setText("User has been successfully added");
  }
    
    @FXML
    void switchToLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml")); // Load the Signup.fxml file
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // Get the current stage
        Scene scene = new Scene(root); // Create a new scene with the Signup.fxml content
        stage.setScene(scene); // Set the scene to the stage
        stage.show(); // Show the stage
    }
}
