package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXApplication extends Application {

    @Override
    public void init() {
        System.out.println("Started!");
    }

    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        stage.setTitle("Hello World");
//        stage.setScene(new Scene(root, 300, 275));
//        stage.show();

        Scene scene = new Scene(new Group(), 300, 250);
        stage.setTitle("Hello World!!!!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
//        Application.launch(FXApplication.class, args);

    }

    public void stop() {
        System.out.println("Stopped!");
    }
}