package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class TextSample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text txt = new Text("Hello, JavaFX!");
        txt.setFont(Font.font("Courier New", FontWeight.BOLD, FontPosture.ITALIC, 20));

        // gradient fill
        Stop[] stops =
                new Stop[]{new Stop(0, Color.BLACK), new Stop(1, Color.DARKGRAY), new Stop(0.5, Color.ANTIQUEWHITE)};
        LinearGradient gradient = new LinearGradient(50, 50, 250, 50, false, CycleMethod.NO_CYCLE, stops);
        txt.setFill(gradient);


        Text txt1 = new Text("Text1");
        txt1.setFont(Font.font ("Courier New", 15));
        Text txt2 = new Text("Text2");
        txt2.setFont(Font.font ("Times New Roman", 20));
        Text txt3 = new Text("Text3");
        txt3.setFont(Font.font ("Arial", 30));
        TextFlow textFlow = new TextFlow(txt1, txt2, txt3);

        StackPane root = new StackPane();
        root.getChildren().addAll(txt, textFlow);

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello FX!");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }

    public void stop() {
        System.out.println("Stopped!");
    }
}