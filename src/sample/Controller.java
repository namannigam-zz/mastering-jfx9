package sample;

import javafx.scene.Node;
import javafx.scene.Parent;

public class Controller {

    private void traverse(Node node, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println(node.getClass());
        if (node instanceof Parent) {
            Parent parent = (Parent) node;
            parent.getChildrenUnmodifiable().forEach(n -> traverse(n, level + 1));
        }
    }
}