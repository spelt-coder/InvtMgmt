package com.example.inventorymanagementsystem;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import otherTabs.IssuedGoods;
import otherTabs.Vendor;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-view.fxml"));
        stage.setTitle("Inventory Management System");
        TableView<Product> tableView = new TableView<>();
        TableColumn<Product, Integer> itemIdColumn = new TableColumn<>("Item ID");
        TableColumn<Product, Integer> vendorIdColumn = new TableColumn<>("Vendor ID");
        TableColumn<Product, String> itemNameColumn = new TableColumn<>("Item Name");
        TableColumn<Product, Integer> quantityColumn = new TableColumn<>("Quantity");
        TableColumn<Product, Integer> buyingPriceColumn = new TableColumn<>("Buying Price");
        TableColumn<Product, Integer> sellingPriceColumn = new TableColumn<>("Selling Price");
        TableColumn<Product, Integer> totalPriceColumn = new TableColumn<>("Total Price");

        // Configure cell value factories to extract property values from Product objects
        itemIdColumn.setCellValueFactory(new PropertyValueFactory<>("itemID"));
        vendorIdColumn.setCellValueFactory(new PropertyValueFactory<>("vendorID"));
        itemNameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        buyingPriceColumn.setCellValueFactory(new PropertyValueFactory<>("buyingPrice"));
        sellingPriceColumn.setCellValueFactory(new PropertyValueFactory<>("sellingPrice"));
        totalPriceColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));

        // Add columns to the TableView
        tableView.getColumns().addAll(itemIdColumn, vendorIdColumn, itemNameColumn,
                quantityColumn, buyingPriceColumn, sellingPriceColumn, totalPriceColumn);






        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}