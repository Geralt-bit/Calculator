package org.example.calc;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    Calculator calc = new Calculator();

    @FXML
    private TextField text;

    @FXML
    private void on1(){
        String val = text.getText();
        val = val + "1";
        text.setText(val);
    }

    @FXML
    private void on2(){
        String val = text.getText();
        val = val + "2";
        text.setText(val);
    }

    @FXML
    private void on3(){
        String val = text.getText();
        val = val + "3";
        text.setText(val);
    }

    @FXML
    private void on4(){
        String val = text.getText();
        val = val + "4";
        text.setText(val);
    }
    @FXML
    private void on5(){
        String val = text.getText();
        val = val + "5";
        text.setText(val);
    }
    @FXML
    private void on6(){
        String val = text.getText();
        val = val + "6";
        text.setText(val);
    }
    @FXML
    private void on7(){
        String val = text.getText();
        val = val + "7";
        text.setText(val);
    }
    @FXML
    private void on8(){
        String val = text.getText();
        val = val + "8";
        text.setText(val);
    }
    @FXML
    private void on9(){
        String val = text.getText();
        val = val + "9";
        text.setText(val);
    }
    @FXML
    private void on0(){
        String val = text.getText();
        val = val + "0";
        text.setText(val);
    }

    @FXML
    private void onDot(){
        String val = text.getText();
        val = val + ".";
        text.setText(val);
    }

    @FXML
    private void onPlus(){
        String operand1 = text.getText();
        text.setText(" ");
        calc.setOperand1(Double.parseDouble(operand1));
        calc.setOperator('+');
    }

    @FXML
    private void onMinus(){
        String operand1 = text.getText();
        text.setText(" ");
        calc.setOperand1(Double.parseDouble(operand1));
        calc.setOperator('-');
    }

    @FXML
    private void onDivision(){
        String operand1 = text.getText();
        text.setText(" ");
        calc.setOperand1(Double.parseDouble(operand1));
        calc.setOperator('/');
    }

    @FXML
    private void onMult(){
        String operand1 = text.getText();
        text.setText(" ");
        calc.setOperand1(Double.parseDouble(operand1));
        calc.setOperator('*');
    }

    @FXML
    private void onEqual() {
        String operand2Str = text.getText();
        try {
            calc.setOperand2(Double.parseDouble(operand2Str));
            calc.calculate();
            if (calc.isError()) {
                text.setText("Error: Division by Zero");
            } else {
                text.setText(String.valueOf(calc.getResult()));
            }
        } catch (NumberFormatException e) {
            text.setText("Error: Invalid Input");
        }
    }

    @FXML
    private void onClear() {
        calc.clear();
        text.setText("");
    }

    @FXML
    private void onExit() {
        javafx.application.Platform.exit();
    }

    @FXML
    private void onHelp() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Help");
        alert.setHeaderText("Calculator Instructions");
        alert.setContentText("To use this calculator:\n"
                + "1. Enter first value.\n"
                + "2. Enter operator.\n"
                + "3. Enter second value.\n"
                + "4. Click on '=' to get result.\n"
                + "5. Use 'Clear' to reset the fields and 'Exit' to close the application.");
        alert.showAndWait();
    }
}