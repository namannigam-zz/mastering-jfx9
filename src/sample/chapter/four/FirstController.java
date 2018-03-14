package sample.chapter.four;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FirstController implements Initializable {

    @FXML
    private Button button;

    @FXML
    private TextField textField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        button.setText("hello");
    }

    @FXML
    private void buttonHandler(ActionEvent event) {
        textField.setText("hello");
    }
}