package sample.chapter.four;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FirstNestedController implements Initializable {

    @FXML
    private NestedController myLabel;

    @FXML
    void btnAction(ActionEvent event) {
        myLabel.setButtonText(textField.getText());
    }

    @FXML
    private TextField textField;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}