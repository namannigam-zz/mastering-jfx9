package sample.chapter.four;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SmartController implements Initializable {

    public void setText(String newText) {
        textField.setText(newText);
    }

    @FXML
    private Button button;

    @FXML
    private TextField textField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        button.setText("hello");
    }

//    SmartController() throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("FirstDocument.fxml"));
//        HBox root = loader.load();
//        loader.<SmartController>getController().setText("Text from App");
//    }
}