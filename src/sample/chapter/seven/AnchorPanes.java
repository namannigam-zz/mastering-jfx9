package sample.chapter.seven;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPanes extends Application {

    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        TextField addressAtTop = new TextField("www.stackoverflow.com");
        AnchorPane.setTopAnchor(addressAtTop, 10.);
        AnchorPane.setLeftAnchor(addressAtTop, 10.);
        AnchorPane.setRightAnchor(addressAtTop, 10.);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle(root.getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}