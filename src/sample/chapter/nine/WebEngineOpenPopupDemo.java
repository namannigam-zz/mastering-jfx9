package sample.chapter.nine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class WebEngineOpenPopupDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        webEngine.setCreatePopupHandler((popupFeatures) -> {
            // create a new stage with new webview
            Stage stage = new Stage((StageStyle.UTILITY));
            WebView webViewPopup = new WebView();
            stage.setScene(new Scene(new StackPane(webViewPopup), 300, 300));
            stage.show();
            // return engine from the created webview
            return webViewPopup.getEngine();
        });
        webEngine.loadContent("<a href='http://www.google.com'>google</a>");

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