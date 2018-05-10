package sample.chapter.nine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebviewDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        WebView webView = new WebView();
        webView.setContextMenuEnabled(true);
        webView.getEngine().load("https://stackoverflow.com/questions/tagged/javafx");

        StackPane root = new StackPane(webView);
        primaryStage.setTitle("JavaFX on SO");
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
    }
}