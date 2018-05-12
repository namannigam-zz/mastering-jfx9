package sample.chapter.ten;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class ToDoItem {
    final String name;
    final BooleanProperty isDone = new SimpleBooleanProperty(false);

    public ToDoItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + (isDone.get() ? " DONE" : "");
    }
}
