package sample.chapter.six;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SelectorsEq extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        // JavaFX
        Button button = new Button();
        button.getStyleClass().add("blue-style");


        // JavaFX
        Button btn = new Button("hi");
        btn.setId("myButton");
    }
}
