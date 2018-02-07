package sample.chapter.three;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BindingOperation extends Application {

    public void start(Stage stage) {

        Label label = new Label();

        label.textProperty().bind(
                stage.widthProperty().asString() // property one
                        .concat(" : ")                   // concatting with a string constant
                        .concat(stage.heightProperty())  // concatting with a property 2
        );

        TextField textField = new TextField();
        Label lblLength = new Label();

        lblLength.textProperty().bind(
                textField.textProperty()
                        .length()   // this length returns IntegerBinding, not just an integer
                        .asString() // so you can keep observing it and use binding methods
        );

        HBox root = new HBox(20, textField, lblLength);
        root.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(root, 200, 100));
        stage.show();
    }
}