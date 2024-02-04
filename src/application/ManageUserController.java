package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ManageUserController {

    @FXML
    private Button adduser;

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check3;

    @FXML
    private CheckBox check4;

    @FXML
    private Text name1;

    @FXML
    private Text name2;

    @FXML
    private Text name3;

    @FXML
    private Text name4;

    @FXML
    private RadioButton remove1;

    @FXML
    private RadioButton remove2;

    @FXML
    private RadioButton remove3;

    @FXML
    private RadioButton remove4;

    @FXML
    private Button role1;

    @FXML
    private Button role2;

    @FXML
    private Button role3;

    @FXML
    private Button role4;

    @FXML
    private TextField searchuser;

    @FXML
    private ImageView usernext;

    @FXML
    private Button userok;

    @FXML
    void switchtoAddUser(ActionEvent event) throws IOException {
        // Load the hhhh.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddUser.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // Get the current stage
        Scene scene = new Scene(loader.load()); // Create a new scene with the hhhh.fxml content
        stage.setScene(scene); // Set the scene to the stage
        stage.show(); // Show the stage
    }
}
