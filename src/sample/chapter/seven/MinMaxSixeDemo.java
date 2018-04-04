package sample.chapter.seven;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MinMaxSixeDemo extends Application {
    @Override
    public void start(Stage stage) {
        Button btnNoMin = new Button("I have no min width");

        Button btnMin = new Button("I have min width");
        btnMin.setMinWidth(100);

        Button btnMax = new Button("I have limited max width");
        btnMax.setMaxWidth(140);

        Button btnBig = new Button("I have large max width");
        btnBig.setMaxWidth(1000);

        Button btnBig2 = new Button("me too");
        btnBig2.setMaxWidth(1000);
    }
}