module com.example.inventorymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inventorymanagementsystem to javafx.fxml;
    exports com.example.inventorymanagementsystem;
}