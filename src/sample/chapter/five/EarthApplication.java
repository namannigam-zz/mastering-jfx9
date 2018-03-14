package sample.chapter.five;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EarthApplication extends Application {


    @Override
    public void start(Stage primaryStage) {
        // PlanetsDemo.java
        // preparing space, Sun and Earth
        Pane root = new Pane();
        Scene scene = new Scene(root, 300, 300, Color.BLACK);
        Circle sun = new Circle(150, 150, 40, Color.YELLOW);
        Circle earth = new Circle(25, Color.BLUE);

        // orbit and path transition
        Ellipse orbit = new Ellipse(150, 150, 125, 50);
        PathTransition pt = new PathTransition(Duration.seconds(5), orbit, earth);
        pt.setInterpolator(Interpolator.LINEAR);
        pt.setCycleCount(Timeline.INDEFINITE);


        ScaleTransition st = new ScaleTransition(Duration.millis(2500), earth);
        // we need to shift scaling because out path transition
        // starts from the rightmost part of the ellipsis which
        // the middle part of our scale transition
        st.setDelay(Duration.millis(1250));
        st.setToX(0.6);
        st.setToY(0.6);
        // scale is twice shorter than path because we are using autoReverse
        st.setAutoReverse(true);
        st.setCycleCount(Timeline.INDEFINITE);

        Timeline front = new Timeline(
                new KeyFrame(Duration.millis(0), (e) -> earth.toFront()),
                new KeyFrame(Duration.millis(2500), (e) -> earth.toBack()),
                new KeyFrame(Duration.seconds(5))
        );
        front.setCycleCount(Timeline.INDEFINITE);


        ParallelTransition parallel = new ParallelTransition(pt, st, front);
        parallel.playFrom(Duration.millis(1250));

    }
}