package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private TextField txtName;

    @FXML
    private Button btnSubmit;

    @FXML
    private Label lblName;

    @FXML
    public void showName(MouseEvent mouseEvent) {
        String name;
        name = txtName.getText();
        lblName.setText("Hello, " + name + ".");
    }
}
