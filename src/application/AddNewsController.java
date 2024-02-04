package application;


import java.io.IOException;
import java.sql.Date;

import dblayer.DBHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddNewsController {

    @FXML
    private Text added;
    
    @FXML
    private Button backbutton;

    @FXML
    private ImageView newsback;

    @FXML
    private DatePicker newsdate;

    @FXML
    private TextField newsdesc;

    @FXML
    private TextField newstitle;

    @FXML
    private Button savenews;
    
    @FXML
    void switchToNewsManage(ActionEvent event) throws IOException {
        // Load the hhhh.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddDeleteNews.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); // Get the current stage
        Scene scene = new Scene(loader.load()); // Create a new scene with the hhhh.fxml content
        stage.setScene(scene); // Set the scene to the stage
        stage.show(); // Show the stage
    }
    
    @FXML
    void saveNews(ActionEvent event) throws IOException {
    	DBHandler db=new DBHandler();
    	Date selectedDate = new Date(newsdate.getValue().toEpochDay());
    	db.saveNews(newstitle.getText(), newsdesc.getText(), selectedDate);
        added.setText("News has been successfully added");
    }
}
