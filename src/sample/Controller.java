package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label labela;

    public void hello(ActionEvent actionEvent) {
        labela.setText("Hello World");
    }
}
