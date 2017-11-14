package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {

    public TableView<String> tableview;
    public TextField textfield;


    public void handleClick(ActionEvent actionEvent) {
        tableview.getItems().add(textfield.getText());
    }

    public void initialize() {
        TableColumn<String, String> onlyColumn = (TableColumn<String, String>) tableview.getColumns().get(0);
        if (onlyColumn.getCellValueFactory() == null) {
            onlyColumn.setCellValueFactory((param) -> new SimpleStringProperty(param.getValue()));
        }
    }
}
