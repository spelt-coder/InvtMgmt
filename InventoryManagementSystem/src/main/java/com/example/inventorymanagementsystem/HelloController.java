package com.example.inventorymanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label ClickMeLabel;

    @FXML
    protected void onHelloButtonClick() {
        ClickMeLabel.setText("");
    }
    @FXML
    protected void setClickMeLabel() {
        ClickMeLabel.setText("Yo!");
    }

}