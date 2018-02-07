package sample.chapter.three;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.ObjectBinding;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class CustomBindings extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Click me");

        StackPane root = new StackPane();
        root.setBackground(Background.EMPTY);
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        ObjectBinding<Paint> objectBinding = new ObjectBinding<>() {
            {
                bind(btn.pressedProperty());
            }

            @Override
            protected Paint computeValue() {
                return btn.isPressed() ? Color.RED : Color.GREEN;
            }
        };

//        Bindings.createObjectBinding(
//                ()-> btn.isPressed() ? Color.RED : Color.GREEN, // computeValue logic
//                btn.pressedProperty()                           // list of observed values
//        );


        scene.fillProperty().bind(objectBinding);

//        scene.fillProperty().bind(
//                Bindings.when(btn.pressedProperty())
//                        .then(Color.RED)
//                        .otherwise(Color.GREEN));

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}