package sample.chapter.six;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.stream.Stream;

public class PseudoClassDemo extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        ToggleGroup group = new ToggleGroup();

        Stream.of("Cats", "Dogs", "Birds", "Mices").map(RadioButton::new).forEach(rb -> {
            rb.setToggleGroup(group);
            root.getChildren().add(rb);
        });

        Scene scene = new Scene(root, 300, 250);
//        scene.getStylesheets().add(getClass().getResource("pseudo-class-demo.css").toExternalForm());
        scene.getStylesheets().add(getClass().getResource("descendant.css").toExternalForm());
        stage.setTitle("PseudoClass Demo");
        stage.setScene(scene);
        stage.show();
    }
}