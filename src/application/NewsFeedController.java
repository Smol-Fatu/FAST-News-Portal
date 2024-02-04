package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class NewsFeedController {
int postcount=0;
    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private ImageView image5;

    @FXML
    private ImageView mainimage;

    @FXML
    private Text maintext;

    @FXML
    private Text maintitle;

    @FXML
    private Text text1;

    @FXML
    private Text text2;

    @FXML
    private Text title1;

    @FXML
    private Text title2;

    @FXML
    private Text title3;

    @FXML
    private Text title4;

    @FXML
    private Text title5;
    
    @FXML 
    private TextArea commentTextArea;
    
    @FXML 
    private Button submitCommentButton;

    @FXML 
    private Text comments;

    @FXML
    private Text likesLabel;
    

    @FXML
    private Button likebutton;
    
    @FXML
    private void submitComment(ActionEvent event) {
        String comment = commentTextArea.getText();
        commentTextArea.clear();
        comments.setText(comment);
    }

    @FXML 
    private void likePost(ActionEvent event) {
    	postcount++;
        likesLabel.setText(Integer.toString(postcount));
    }
}
