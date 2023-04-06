package com.example.fazekas_tamas_masodfokuegyenlet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MasodfokuEgyenletController {
    @FXML
    private TextField textInput1;
    @FXML
    private TextField textInput2;
    @FXML
    private TextField textInput3;
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    @FXML
    private Label labelEredmeny1;
    @FXML
    private Label labelEredmeny2;
    @FXML
    private Label labelX2;


    @FXML
    public void szamol(ActionEvent actionEvent) {
        if (textInput1.getText().equals("") || textInput2.getText().equals("") || textInput3.getText().equals("")){
            alert.setContentText("Minden mező kitöltése kötelező!");
            alert.show();
        } else {
            try {
                double a = Integer.parseInt(textInput1.getText());
                double b = Integer.parseInt(textInput2.getText());
                double c = Integer.parseInt(textInput3.getText());
                double D = Math.sqrt((b * b) - 4 * a * c); //D = 0 = -1, 2, -1
                double e1 = -(b + D) / (2 * a);
                double e2 = -(b - D) / (2 * a);
                String text1;
                String text2;
                if (e1 == (long) e1){
                    text1 = String.format("%d", (long)e1);
                } else {
                    text1 = String.format("%s", e1);
                }
                if (e2 == (long) e2){
                    text2 = String.format("%d", (long)e2);
                } else {
                    text2 = String.format("%s", e2);
                }
                if (D > 0){
                    labelEredmeny1.setText(text1);
                    labelX2.setText("x2 = ");
                    labelEredmeny2.setText(text2);
                } else if (D == 0) {;
                    labelEredmeny1.setText("x2 = " + text1);
                    labelX2.setText("");
                }
                if (D < 0){
                    labelEredmeny1.setText("Nem oldható meg a valós számok halmazán");
                    labelEredmeny2.setText("Nem oldható meg a valós számok halmazán");
                }
            } catch (Exception e) {
                alert.setContentText("Csak számot adhat meg!");
                alert.show();
            }
        }

    }
}