package sample.chapter.four;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class MyControl extends HBox {

    @FXML
    private TextField textField;

    @FXML
    private Label label;

    MyControl(String text) throws IOException {
        // here we initialize our HBox
        setAlignment(Pos.CENTER);
        setSpacing(5);

        // loading FXML and using current object as it's root and controller
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MyControl.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();

        // now we already can use @FXML initialized controls
        textField.setText(text);
        label.setText("Message: ");
    }
}