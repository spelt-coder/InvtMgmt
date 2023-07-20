package com.example.inventorymanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import otherTabs.Bill;
import otherTabs.Vendor;

import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

public class BillsController implements Initializable {

    ObservableList<Bill> bills = FXCollections.observableArrayList();
    @FXML
    private VBox box_choice;
    @FXML
    private Button button_add;
    @FXML
    private Button button_delete;
    @FXML
    private TableColumn<Bill, Integer> col_amount;
    @FXML
    private TableColumn<Bill, Integer> col_bill_number;
    @FXML
    private TableColumn<Bill, String> col_date;
    @FXML
    private TableColumn<Bill, Integer> col_vendor_id;
    @FXML
    private TextField txt_amount;
    @FXML
    private TextField txt_date;
    @FXML
    private TextField txt_vendor_id;
    @FXML
    private TableView<Bill> table;
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

    @FXML
    private void btnInsert(ActionEvent event, InventoryManagement testIn) {
        if (!txt_amount.getText().isEmpty() && !txt_date.getText().isEmpty() && !txt_vendor_id.getText().isEmpty()) {


            Bill bill = new Bill(Integer.parseInt(txt_vendor_id.getText()), Integer.parseInt(txt_amount.getText()), txt_date.getText());
            bills.add(bill);
        }
    }

    @FXML
    public void btnDel(ActionEvent actionEvent) {
        TableView.TableViewSelectionModel<Bill> selectionModel = table.getSelectionModel();
        if (selectionModel.isEmpty()) {
            System.out.println("You need to select data before deleting");
            return;
        }

        ObservableList<Bill> selectedItems = selectionModel.getSelectedItems();
        if (!selectedItems.isEmpty()) {
            for (Bill selectedItem : selectedItems) {
                table.getItems().remove(selectedItem);
            }

        }

        selectionModel.clearSelection();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        InventoryManagement test = new InventoryManagement();

        button_add.setOnAction(e -> btnInsert(e, test));
        col_bill_number.setCellValueFactory(new PropertyValueFactory<>("number"));
        col_vendor_id.setCellValueFactory(new PropertyValueFactory<>("vendorID"));
        col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        col_amount.setCellValueFactory(new PropertyValueFactory<>("amount"));

        table.setItems(bills);
    }



}


