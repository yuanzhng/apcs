package com.example.ja;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class HelloController {
    @FXML
    private Button btnadd;
    @FXML
    private Button btnsub;
    @FXML
    private Button btnmul;
    @FXML
    private Button btndiv;
    @FXML
    private Button btnclr;
    @FXML
    private TextField txtnum1;
    @FXML
    private TextField txtnum2;
    @FXML
    private Label lblans;

    @FXML
    protected void handleButtonAction(ActionEvent e) {
        if (e.getSource() == btnclr) {
            txtnum1.setText("");
            txtnum2.setText("");
            lblans.setText("?");
            txtnum1.requestFocus();
            return;
        }

        int num1 = Integer.parseInt(txtnum1.getText());
        int num2 = Integer.parseInt(txtnum2.getText());
        int answer = 0;
        String symbol = null;

        if (e.getSource() == btnadd) {
            symbol = "+";
            answer = num1 + num2;
        }
        else if (e.getSource() == btnsub) {
            symbol = "-";
            answer = num1 - num2;
        }
        else if (e.getSource() == btnmul) {
            symbol = "*";
            answer = num1 * num2;
        }
        else if (e.getSource() == btndiv) {
            symbol = "/";
            if (num2 != 0) {
                answer = num1 / num2;
            }
        }

        lblans.setText("" + num1 + " " + symbol + " " + num2 + " " + "=" + " " + answer);
    }
}