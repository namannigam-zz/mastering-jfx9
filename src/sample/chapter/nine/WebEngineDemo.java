package sample.chapter.nine;

import javafx.application.Application;
import javafx.concurrent.Worker;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class WebEngineDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        webEngine.setOnAlert((event) -> {
            Stage stage = new Stage((StageStyle.UTILITY));
            stage.setScene(new Scene(new StackPane(new Label(event.getData())), 100, 80));
            stage.show();
        });
        webEngine.loadContent("<input type=button onclick=\"window.alert('hi')\" value='Click Me!'>");

        ProgressBar loadingBar = new ProgressBar(0);
        loadingBar.setMinWidth(400);

        // using binding to easily connect the worker and the progress bar
        loadingBar.progressProperty().bind(
                webEngine.getLoadWorker().progressProperty());

        VBox root = new VBox(5, loadingBar, webView);
        primaryStage.setTitle("JavaFX on SO");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();


    }
}