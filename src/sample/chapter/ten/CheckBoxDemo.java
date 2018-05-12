package sample.chapter.ten;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class CheckBoxDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
//        ObservableList<ToDoItem> items = FXCollections.observableArrayList(
//                new ToDoItem("Sign a Contract"), new ToDoItem("Fail Deadline"),
//                new ToDoItem("Blame Yourself"), new ToDoItem("Suffer"));

        ObservableList<ToDoItem> items = FXCollections.observableArrayList(
                (ToDoItem item) -> new Observable[]{item.isDone});

        items.addAll(
                new ToDoItem("Sign a Contract"), new ToDoItem("Fail Deadline"),
                new ToDoItem("Blame Yourself"), new ToDoItem("Suffer"));

        ListView<ToDoItem> list = new ListView<>(items);
        list.setEditable(true);
//        list.setCellFactory(CheckBoxListCell.forListView(item -> item.isDone));
        list.setCellFactory(CheckBoxListCell.forListView(
                item -> item.isDone,
                new StringConverter<ToDoItem>() {
                    @Override
                    public String toString(ToDoItem item) {
                        return item.name;
                    }

                    @Override
                    public ToDoItem fromString(String string) {
                        throw new UnsupportedOperationException("We don't need this.");
                    }
                }
        ));

        // is not called on checkbox click because only ToDoItem internal field was changed
        items.addListener((ListChangeListener.Change<? extends ToDoItem> change) -> {
            // let's print everything here, because default Change output is not smart enough
            items.forEach(System.out::println);
        });

        primaryStage.setTitle("ChoiceBoxListCellDemo Demo");
        primaryStage.setScene(new Scene(new StackPane(list), 200, 200));
        primaryStage.show();
    }
}