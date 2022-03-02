package com.nttn.bmiapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;



public class PrimaryController {
    @FXML private TextField txtWeight;
    @FXML private TextField txtHeight;
    @FXML private Label lbResult;
    
    public void bmiHandler(ActionEvent event){
        double height = Double.parseDouble(this.txtHeight.getText());
        double weight = Double.parseDouble(txtWeight.getText());
        double bmi = weight / Math.pow(height, 2);
        
        if (bmi < 18.5) {
            this.lbResult.setText("Gay do I");
        } else if (bmi < 25) {
            this.lbResult.setText("Binh thuong");
        } else {
            this.lbResult.setTextFill(Color.RED);
            this.lbResult.setText("Thua can");
        }
    }
}
