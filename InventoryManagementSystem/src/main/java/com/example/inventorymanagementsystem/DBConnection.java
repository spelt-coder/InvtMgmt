package com.example.inventorymanagementsystem;
import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
    public static Connection connectDB() {
        try {
            Config config = new Config();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/users", config.getUsername(), config.getPassword());
            return conn;
         }catch (Exception e) {
            e.printStackTrace();
            // Displaying an error alert dialog
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Connection Error");
            alert.setHeaderText(null);
            alert.setContentText(e.getMessage());
            alert.showAndWait();

            return null;
        }

    }

}
