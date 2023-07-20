package com.example.inventorymanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import otherTabs.IssuedGoods;
import otherTabs.Vendor;

import java.net.URL;
import java.util.ResourceBundle;

public class IssuedGoodsController implements Initializable {

    @FXML
    private VBox box_choice;

    @FXML
    private Button button_add;

    @FXML
    private TableColumn<IssuedGoods, String> col_item;

    @FXML
    private TableColumn<IssuedGoods, Integer> col_item_id;

    @FXML
    private TableColumn<IssuedGoods, String> col_recipient;

    @FXML
    private TableColumn<IssuedGoods, Integer> col_sales_count;

    @FXML
    private TableView<IssuedGoods> table;

    @FXML
    private TextField txt_item;
    @FXML
    private TextField txt_item_id;

    @FXML
    private TextField txt_recipient;

    @FXML
    private TextField txt_sales_count;
    @FXML
    private Button button_exit;

    @FXML
    private void exit(ActionEvent event) {
        // Perform any necessary cleanup or save operations
        // before exiting the application

        // Close the application
        Stage stage = (Stage) button_exit.getScene().getWindow();
        stage.close();
    }
    ObservableList<IssuedGoods> issuedGoods = FXCollections.observableArrayList();
    @FXML
    private void btnInsert(ActionEvent event, InventoryManagement testIn) {
        if (!txt_item.getText().isEmpty() && !txt_sales_count.getText().isEmpty() && !txt_recipient.getText().isEmpty()) {

            IssuedGoods issued = new IssuedGoods(Integer.parseInt(txt_item_id.getText()), txt_item.getText(), Integer.parseInt(txt_sales_count.getText()), txt_recipient.getText());
            issuedGoods.add(issued);
        }
    }
    @FXML
    public void btnDel(ActionEvent actionEvent) {
        TableView.TableViewSelectionModel<IssuedGoods> selectionModel = table.getSelectionModel();
        if (selectionModel.isEmpty()) {
            System.out.println("You need to select data before deleting");
            return;
        }

        ObservableList<IssuedGoods> selectedItems = selectionModel.getSelectedItems();
        if (!selectedItems.isEmpty()) {
            for (IssuedGoods selectedItem : selectedItems) {
                table.getItems().remove(selectedItem);
            }

        }

        selectionModel.clearSelection();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        InventoryManagement test = new InventoryManagement();

        button_add.setOnAction(e -> btnInsert(e, test));
        col_item_id.setCellValueFactory(new PropertyValueFactory<>("itemID"));
        col_item.setCellValueFactory(new PropertyValueFactory<>("item"));
        col_sales_count.setCellValueFactory(new PropertyValueFactory<>("salesCount"));
        col_recipient.setCellValueFactory(new PropertyValueFactory<>("recipient"));

        table.setItems(issuedGoods);
    }




}
