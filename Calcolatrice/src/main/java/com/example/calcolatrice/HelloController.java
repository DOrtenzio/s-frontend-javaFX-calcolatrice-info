package com.example.calcolatrice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label risultatoCalc;
    @FXML
    private TextField valore1;
    @FXML
    private TextField valore2;


    @FXML
    protected void onPiu() {
        int v1=Integer.parseInt(valore1.getText());
        int v2=Integer.parseInt(valore2.getText());
        risultatoCalc.setText(String.valueOf(v1+v2));
    }
    @FXML
    protected void onMeno() {
        int v1=Integer.parseInt(valore1.getText());
        int v2=Integer.parseInt(valore2.getText());
        risultatoCalc.setText(String.valueOf(v1-v2));
    }
    @FXML
    protected void onPer() {
        int v1=Integer.parseInt(valore1.getText());
        int v2=Integer.parseInt(valore2.getText());
        risultatoCalc.setText(String.valueOf(v1*v2));
    }
    @FXML
    protected void onDiviso() {
        int v1=Integer.parseInt(valore1.getText());
        int v2=Integer.parseInt(valore2.getText());
        if (v1==0 && v2==0)
            risultatoCalc.setText("Indeterminato");
        else if (v2==0)
            risultatoCalc.setText("Impossibile");
        else
            risultatoCalc.setText(String.valueOf(v1/v2));

    }
}
