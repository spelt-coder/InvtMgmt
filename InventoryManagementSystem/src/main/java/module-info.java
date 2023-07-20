module com.example.inventorymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;



    opens com.example.inventorymanagementsystem to javafx.fxml;
    exports com.example.inventorymanagementsystem;
    opens otherTabs to javafx.base;
}