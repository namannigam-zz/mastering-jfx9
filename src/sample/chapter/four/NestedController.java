package sample.chapter.four;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class NestedController implements Initializable {

    @FXML
    private Button myBtn;

    @FXML
    void myBtnAction(ActionEvent event) {
        System.out.println("Hello from " + myBtn.getText());
    }

    public void setButtonText(String text) {
        myBtn.setText(text);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}