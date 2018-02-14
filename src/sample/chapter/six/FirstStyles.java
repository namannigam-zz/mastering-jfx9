package sample.chapter.six;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstStyles extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        Scene scene = new Scene(root, 300, 250);

        Button btnLoad = new Button("Load CSS");
        btnLoad.setOnAction((ActionEvent event) -> scene.getStylesheets()
                .add("sample/chapter/six/style.css"));

        Button btnUnload = new Button("Unoad CSS");
        btnUnload.setOnAction((ActionEvent event) -> scene.getStylesheets().clear());

        root.getChildren().addAll(btnLoad, btnUnload);
        stage.setTitle("Hello CSS!");
        stage.setScene(scene);
        stage.show();
    }
}