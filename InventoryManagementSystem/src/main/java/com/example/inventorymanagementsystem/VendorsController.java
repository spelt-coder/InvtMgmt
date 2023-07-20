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
import otherTabs.Vendor;

import java.net.URL;
import java.util.ResourceBundle;

public class VendorsController implements Initializable {

    @FXML
    private VBox box_choice;

    @FXML
    private Button button_add;

    @FXML
    private Button button_delete;

    @FXML
    private TableColumn<Vendor, String> col_products;
    @FXML
    private TableColumn<Vendor, String> col_email;

    @FXML
    private TableColumn<Vendor, String> col_vendor;

    @FXML
    private TableColumn<Vendor, Integer> col_vendor_id;

    @FXML
    private TableView<Vendor> table;

    @FXML
    private TextField txt_email;

    @FXML
    private TextField txt_products;

    @FXML
    private TextField txt_vendor;
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

    ObservableList<Vendor> vendors = FXCollections.observableArrayList();
    @FXML
    private void btnInsert(ActionEvent event, InventoryManagement testIn) {
        if (!txt_vendor.getText().isEmpty() && !txt_products.getText().isEmpty() && !txt_email.getText().isEmpty()) {

            Vendor vendor = new Vendor(txt_vendor.getText(), txt_products.getText(), txt_email.getText());
            //testIn.addVendor(vendor);
            vendors.add(vendor);
        }
    }
    @FXML
    public void btnDel(ActionEvent actionEvent) {
        TableView.TableViewSelectionModel<Vendor> selectionModel = table.getSelectionModel();
        if (selectionModel.isEmpty()) {
            System.out.println("You need to select data before deleting");
            return;
        }

        ObservableList<Vendor> selectedItems = selectionModel.getSelectedItems();
        if (!selectedItems.isEmpty()) {
            for (Vendor selectedItem : selectedItems) {
                table.getItems().remove(selectedItem);
            }

        }

        selectionModel.clearSelection();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        InventoryManagement test = new InventoryManagement();

        button_add.setOnAction(e -> btnInsert(e, test));
        col_vendor_id.setCellValueFactory(new PropertyValueFactory<>("vendorID"));
        col_vendor.setCellValueFactory(new PropertyValueFactory<>("vendorName"));
        col_products.setCellValueFactory(new PropertyValueFactory<>("products"));
        col_email.setCellValueFactory(new PropertyValueFactory<>("email"));

        table.setItems(vendors);
        }



}
