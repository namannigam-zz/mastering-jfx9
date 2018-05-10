package sample.chapter.nine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

public class WebOverlayDemo extends Application {
    public void start(Stage stage) {
        WebView webView = new WebView();
        // name of the element shown in the overlay
        Text overlayText = new Text(5, 18, "");
        overlayText.setFont(Font.font(null, FontWeight.BOLD, 20));
        // red overlay
        Pane overlay = new Pane(overlayText);
        overlay.setStyle("-fx-background-color: rgba(255,0,0,0.5);");
        // transparent pane to hold our overlay, it covers all WebView
        Pane pane = new Pane(overlay);
        pane.setPrefSize(600, 600);

        stage.setScene(new Scene(new StackPane(webView, pane), 600, 600));

        pane.setOnMouseMoved((event) -> {
            // calling javascript to find what element is under cursor
            JSObject object = (JSObject) webView.getEngine().
                    executeScript("document.elementFromPoint(" + event.getX() + "," + event.getY() + ");");
            if (object != null) {
                // calculating element's bounds using JavaScript object
                JSObject bounds = (JSObject) object.call("getBoundingClientRect");
                // converting types from JavaScripts can be oververbose
                overlay.setTranslateX(((Number) bounds.getMember("left")).doubleValue());
                overlay.setTranslateY(((Number) bounds.getMember("top")).doubleValue());
                overlay.setMinWidth(((Number) bounds.getMember("width")).doubleValue());
                overlay.setMinHeight(((Number) bounds.getMember("height")).doubleValue());
                // finding what this element is
                overlayText.setText((String)object.getMember("tagName"));
            }
        });
        webView.getEngine().load("https://stackoverflow.com/questions/tagged/javafx");

        stage.show();
    }
}
