package sample.chapter.three;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ObservableWidthProperty extends Application {

    @Override
    public void start(Stage stage) {
        Label lblWidth = new Label();
        stage.widthProperty().addListener((o, oldVal, newVal) -> lblWidth.setText(newVal.toString()));
        stage.setScene(new Scene(new StackPane(lblWidth), 200, 150));
        stage.show();
    }
}