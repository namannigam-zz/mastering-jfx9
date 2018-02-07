package sample.chapter.three;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BindingException extends Application {

    @Override
    public void start(Stage stage) {
        Label lblWidth1 = new Label();
        Label lblWidth2 = new Label();

        lblWidth1.textProperty().bind(stage.widthProperty().asString());
        lblWidth1.setText("Hi"); // exception

        lblWidth2.textProperty().bindBidirectional(lblWidth1.textProperty());
        lblWidth2.setText("hi"); // this works fine

        // can combine both types of binding
        lblWidth1.textProperty().bind(stage.widthProperty().asString());
        lblWidth2.textProperty().bindBidirectional(lblWidth1.textProperty());


        stage.setScene(new Scene(new StackPane(lblWidth1), 200, 150));
        stage.show();
    }
}