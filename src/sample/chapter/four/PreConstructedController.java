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

public class PreConstructedController implements Initializable {

    private final String newText;

    public PreConstructedController(String newText) {
        this.newText = newText;
    }

    @FXML
    private Button button;

    @FXML
    private TextField textField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        button.setText(newText);
    }

//    PreConstructedController() throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("FirstDocument.fxml"));
//        PreConstructedController pc = new PreConstructedController("new text");
//        loader.setController(pc);
//        HBox root = loader.load();
//    }
}