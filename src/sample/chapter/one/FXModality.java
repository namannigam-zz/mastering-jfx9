package sample.chapter.one;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXModality extends Application {

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group(), 300, 250);
        stage.setTitle("Main Window");
        stage.setScene(scene);
        stage.show();

        Stage stage2 = new Stage();
        stage2.setTitle("I don't block anything");
        stage2.initModality(Modality.NONE);
        stage2.setFullScreen(true);
        stage2.show();

        Stage stage3 = new Stage();
        stage3.setTitle("I block everything");
        stage3.initModality(Modality.APPLICATION_MODAL);
        stage3.show();

        Stage stage4 = new Stage();
        stage4.setTitle("I block only clicks to main window");
        stage4.initOwner(stage);
        stage4.initModality(Modality.WINDOW_MODAL);
        stage4.show();
    }
}