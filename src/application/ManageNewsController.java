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

public class ManageNewsController {

    @FXML
    private Button addnews;

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check3;

    @FXML
    private CheckBox check4;

    @FXML
    private Text id1;

    @FXML
    private Text id2;

    @FXML
    private Text id3;

    @FXML
    private Text id4;

    @FXML
    private ImageView newsnext;

    @FXML
    private Button newsok;

    @FXML
    private RadioButton remove1;

    @FXML
    private RadioButton remove2;

    @FXML
    private RadioButton remove3;

    @FXML
    private RadioButton remove4;

    @FXML
    private TextField searchnews;

    @FXML
    void switchToNewsAdd(ActionEvent event) throws IOException {
        // Load the hhhh.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddNews.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // Get the current stage
        Scene scene = new Scene(loader.load()); // Create a new scene with the hhhh.fxml content
        stage.setScene(scene); // Set the scene to the stage
        stage.show(); // Show the stage
    }

}
