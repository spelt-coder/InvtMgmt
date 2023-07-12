package com.example.inventorymanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import otherTabs.Vendor;

import java.net.URL;
import java.util.ResourceBundle;

public class GoodsController implements Initializable{

    @FXML
    private ChoiceBox<String> choice_box;
    private String[] options = {"Beverages", "Bread/Bakery", "Canned/Jarred Goods", "Dairy Products",
            "Dry/Baking Goods", "Frozen Products", "Meat", "Farm Produce", "Home Cleaners", "Paper Goods", "Home Care"};

    @FXML
    private TableColumn<Product, String> col_buying_price;

    @FXML
    private TableColumn<Product, String> col_item;

    @FXML
    private TableColumn<Product, Integer> col_item_id;

    @FXML
    private TableColumn<Product, Integer> col_quantity;

    @FXML
    private TableColumn<Product, Integer> col_selling_price;
    @FXML
    private TableColumn<Product, Integer> col_total_price;


    @FXML
    private TableColumn<Product, String> col_vendor_id;

    @FXML
    private TableView<Product> table;

    @FXML
    private TextField txt_buying_price;

    @FXML
    private TextField txt_item;

    @FXML
    private TextField txt_quantity;

    @FXML
    private TextField txt_selling_price;

    @FXML
    private TextField txt_vendor_id;
    @FXML
    private Button button_add;
    @FXML
    private Button button_del;

    ObservableList<Product> products = FXCollections.observableArrayList();
//    ObservableList<Product> products = FXCollections.observableArrayList(
//            new Beverages(1, "Cola", 10, 1, 2),
//            new Bread(2, "Whole Wheat", 5, 2, 3),
//            new CannedGoods(3, "Beans", 8, 3, 4)
//            // Add more products here...
//    );


    @FXML
    private void btnInsert(ActionEvent event, InventoryManagement testIn){

        if(!txt_buying_price.getText().isEmpty()  && !txt_item.getText().isEmpty()
                && !txt_quantity.getText().isEmpty() && !txt_selling_price.getText().isEmpty()
        && !txt_vendor_id.getText().isEmpty())
        {
            switch(choice_box.getValue())
            {
                case("Beverages"):
                    Beverages beverage = new Beverages(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.addBeverage(beverage);
                    products.addAll(beverage);
                    break;
                case("Bread/Bakery"):
                    Bread bread = new Bread(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.addBread(bread);
                    products.addAll(bread);
                    break;
                case("Canned/Jarred Goods"):
                    CannedGoods cannedGood = new CannedGoods(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.addCannedGoods(cannedGood);
                    products.addAll(cannedGood);
                    break;
                case("Dairy Products"):
                    DairyProducts dairy = new DairyProducts(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.addDairyProducts(dairy);
                    products.addAll(dairy);
                    break;
                case("Dry/Baking Goods"):
                    DryGoods dry = new DryGoods(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.addDryGoods(dry);
                    products.addAll(dry);
                    break;
                case("Frozen Products"):
                    FrozenProducts frozenProduct = new FrozenProducts(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.addFrozenProducts(frozenProduct);
                    products.addAll(frozenProduct);
                    break;
                case("Meat"):
                    Meat meat = new Meat(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.addMeat(meat);
                    products.addAll(meat);
                    break;
                case("Farm Produce"):
                    FarmProduce produce = new FarmProduce(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.addFarmProduce(produce);
                    products.addAll(produce);
                    break;
                case("Home Cleaners"):
                    HomeCleaners cleaner = new HomeCleaners(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.addHomeCleaners(cleaner);
                    products.addAll(cleaner);
                    break;
                case("Paper Goods"):
                    PaperGoods paper = new PaperGoods(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.addPaperGoods(paper);
                    products.addAll(paper);

                    break;
                case("Home Care"):
                    HomeCare homeCare = new HomeCare(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.addHomeCare(homeCare);
                    products.addAll(homeCare);
                    break;
            }
        }
        else
        {
            System.out.println("Fields should not be empty");
        }
    }
    @FXML
    private void btnDel(ActionEvent event, InventoryManagement testIn){

        if(!txt_buying_price.getText().isEmpty()  && !txt_item.getText().isEmpty()
                && !txt_quantity.getText().isEmpty() && !txt_selling_price.getText().isEmpty()
                && !txt_vendor_id.getText().isEmpty())
        {
            switch(choice_box.getValue())
            {
                case("Beverages"):
                    Beverages beverage = new Beverages(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    products.remove(testIn.removeBeverage());
                    break;
                case("Bread/Bakery"):
                    Bread bread = new Bread(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    products.remove(testIn.removeBread());
                    break;
                case("Canned/Jarred Goods"):
                    CannedGoods cannedGood = new CannedGoods(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    products.remove(testIn.removeCannedGoods());
                    break;
                case("Dairy Products"):
                    DairyProducts dairy = new DairyProducts(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    products.remove(testIn.removeDairyProducts());
                    break;
                case("Dry/Baking Goods"):
                    DryGoods dry = new DryGoods(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    products.remove(testIn.removeDryGoods());
                    break;
                case("Frozen Products"):
                    FrozenProducts frozenProduct = new FrozenProducts(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    products.remove(testIn.removeFrozenProducts());
                    break;
                case("Meat"):
                    Meat meat = new Meat(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    products.remove(testIn.removeMeat());
                    break;
                case("Farm Produce"):
                    FarmProduce produce = new FarmProduce(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.removeFarmProduce(produce);
                    int index = products.indexOf(produce);
                    if (index != -1) {
                        products.remove(index);
                    }
                    break;
                case("Home Cleaners"):
                    HomeCleaners cleaner = new HomeCleaners(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    products.remove(testIn.removeHomeCleaners(cleaner));
                    break;
                case("Paper Goods"):
                    PaperGoods paper = new PaperGoods(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    products.remove(testIn.removePaperGoods(paper));
                    break;
                case("Home Care"):
                    HomeCare homeCare = new HomeCare(Integer.parseInt(txt_vendor_id.getText()),
                            txt_item.getText(), Integer.parseInt(txt_quantity.getText()),
                            Integer.parseInt(txt_buying_price.getText()), Integer.parseInt(txt_selling_price.getText()));
                    testIn.removeHomeCare(homeCare);
                    products.remove(homeCare);
                    break;
            }
        }
        else
        {
            System.out.println("Fields should not be empty");
        }
    }

    public InventoryManagement take(InventoryManagement mg)
    {
        return mg;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        choice_box.getItems().addAll(options);
        choice_box.setValue("Beverages");

        InventoryManagement test = new InventoryManagement();

        button_add.setOnAction(e -> btnInsert(e, test));
        button_del.setOnAction(e -> btnDel(e, test));
        col_item_id.setCellValueFactory(new PropertyValueFactory<>("itemID"));
        col_vendor_id.setCellValueFactory(new PropertyValueFactory<>("vendorID"));
        col_item.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        col_buying_price.setCellValueFactory(new PropertyValueFactory<>("buyingPrice"));
        col_selling_price.setCellValueFactory(new PropertyValueFactory<>("sellingPrice"));
        col_total_price.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));


        table.setItems(products);


    }

}
