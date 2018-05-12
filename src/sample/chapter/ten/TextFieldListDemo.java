package sample.chapter.ten;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

public class TextFieldListDemo extends Application {
    @Override public void start(Stage stage) throws Exception {
        ObservableList<Integer> items = FXCollections.observableArrayList(
                100, 200, 500, 1000);

        ListView<Integer> list = new ListView<>(items);
        list.setEditable(true);
        list.setCellFactory(TextFieldListCell.forListView(new IntegerStringConverter()));

        items.addListener((ListChangeListener.Change<? extends Integer> change) -> {
            // this will write something like
            // { [500] replaced by [600] at 2 }
            System.out.println(change);
        });

        stage.setTitle("TextFieldListCell Demo");
        stage.setScene(new Scene(new StackPane(list), 200, 200));
        stage.show();
    }
}
