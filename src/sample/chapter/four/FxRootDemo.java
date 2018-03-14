package sample.chapter.four;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FxRootDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(
                new MyControl("Hello, World"));
        Scene scene = new Scene(stackPane, 300, 80);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}