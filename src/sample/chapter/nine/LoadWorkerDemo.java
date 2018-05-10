package sample.chapter.nine;

import javafx.application.Application;
import javafx.concurrent.Worker;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class LoadWorkerDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        webEngine.load("https://stackoverflow.com/questions/tagged/javafx");

        ProgressBar loadingBar = new ProgressBar(0);
        loadingBar.setMinWidth(400);

        // using binding to easily connect the worker and the progress bar
        loadingBar.progressProperty().bind(
                webEngine.getLoadWorker().progressProperty());

        webEngine.getLoadWorker().stateProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue == Worker.State.SUCCEEDED) {
                        System.out.println("Page was successfully loaded!");
                    } else if (newValue == Worker.State.FAILED) {
                        System.out.println("Page loading has failed!");
                    }
                });
//        webEngine.getLoadWorker().workDoneProperty().addListener((observable, oldValue, newValue) -> {
//            if (newValue.intValue() == 100) {
//                // page is 100% loaded
//            }
//        });

        VBox root = new VBox(5, loadingBar, webView);
        primaryStage.setTitle("JavaFX on SO");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}