package sample.chapter.ten;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ChoiceBoxListCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ChoiceBoxListCellDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        ObservableList<String> values = FXCollections.observableArrayList(
                "Red", "Blue", "Yellow", "Green");

        ObservableList<String> items = FXCollections.observableArrayList(
                "Gray", "Gray", "Gray", "Gray");

        ListView<String> list = new ListView<>(items);
        list.setEditable(true);
        list.setCellFactory(ChoiceBoxListCell.forListView(values));

        primaryStage.setTitle("ChoiceBoxListCellDemo Demo");
        primaryStage.setScene(new Scene(new StackPane(list), 200, 200));
        primaryStage.show();
    }
}