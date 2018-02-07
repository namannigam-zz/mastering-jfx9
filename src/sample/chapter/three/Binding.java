package sample.chapter.three;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Binding extends Application {

    @Override
    public void start(Stage stage) {
        Label lblWidth = new Label();
        lblWidth               // object we want to change
                .textProperty()      // property of the object to be changed
                .bind(               // bind call
                        stage             // object we want to monitor
                                .widthProperty()  // property of the monitored object
                                .asString());     // service method for type convertion as we are monitoring assigning double value
        // to string property
        stage.setScene(new Scene(new StackPane(lblWidth), 200, 150));
        stage.show();
    }
}