package com.example;
import javafx.beans.binding.DoubleBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * Group Name: GUI-ssica Soho
 * Group Members: Aguilar, William |Ballesteros, Kyle Philip | Dela Cruz, Yves |Mallari, Shaun Owen | Obayan, Arvin Liel | Pasamonte, Hezekiah Myrr | Rodavia, Nicko
 * Course/Section: CSS124L - BM1
 */

public class CalculatorController {

    @FXML Label calcDisplay;
    @FXML Button calcPad1;
    @FXML Button calcPad2;
    @FXML Button calcPad3;
    @FXML Button calcPad4;
    @FXML Button calcPad5;
    @FXML Button calcPad6;
    @FXML Button calcPad7;
    @FXML Button calcPad8;
    @FXML Button calcPad9;
    @FXML Button calcPad0;
    @FXML Button calcPadAdd;
    @FXML Button calcPadMinus;
    @FXML Button calcPadMultiply;
    @FXML Button calcPadDivide;
    @FXML Button calcPadDot;
    @FXML Button calcPadEquals;
    @FXML Button calcPadClear;
    @FXML Button calcPadNegative;
    @FXML Button calcPadDelete;
    @FXML Button calcPadCE;

    String storedValue = "";
    String currentValue = "0";
    String resultNumber = "";
    String tempString = "";
    boolean equalPressed = false;
    char operator = ' ';    

    @FXML
    private void handleCalcPad1() {
        if (equalPressed) {
            handleCalcPadCE();
            equalPressed = false;
        }
        if (currentValue.equals("0")) {
            currentValue = "";
        }
        currentValue += "1";
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    @FXML
    private void handleCalcPad2() {
        if (equalPressed) {
            handleCalcPadCE();
            equalPressed = false;
        }
        if (currentValue.equals("0")) {
            currentValue = "";
        }
        currentValue += "2";
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    @FXML
    private void handleCalcPad3() {
        if (equalPressed) {
            handleCalcPadCE();
            equalPressed = false;
        }
        if (currentValue.equals("0")) {
            currentValue = "";
        }
        currentValue += "3";
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    @FXML
    private void handleCalcPad4() {
        if (equalPressed) {
            handleCalcPadCE();
            equalPressed = false;
        }
        if (currentValue.equals("0")) {
            currentValue = "";
        }
        currentValue += "4";
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    @FXML
    private void handleCalcPad5() {
        if (equalPressed) {
            handleCalcPadCE();
            equalPressed = false;
        }
        if (currentValue.equals("0")) {
            currentValue = "";
        }
        currentValue += "5";
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    @FXML
    private void handleCalcPad6() {
        if (equalPressed) {
            handleCalcPadCE();
            equalPressed = false;
        }
        if (currentValue.equals("0")) {
            currentValue = "";
        }
        currentValue += "6";
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    @FXML
    private void handleCalcPad7() {
        if (equalPressed) {
            handleCalcPadCE();
            equalPressed = false;
        }
        if (currentValue.equals("0")) {
            currentValue = "";
        }
        currentValue += "7";
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    @FXML
    private void handleCalcPad8() {
        if (equalPressed) {
            handleCalcPadCE();
            equalPressed = false;
        }
        if (currentValue.equals("0")) {
            currentValue = "";
        }
        currentValue += "8";
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    @FXML
    private void handleCalcPad9() {
        if (equalPressed) {
            handleCalcPadCE();
            equalPressed = false;
        }
        if (currentValue.equals("0")) {
            currentValue = "";
        }
        currentValue += "9";
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
   }

    @FXML
    private void handleCalcPad0() {
        if (equalPressed) {
            handleCalcPadCE();
            equalPressed = false;
        }
        if (currentValue.equals("0")) {
            currentValue = "";
        }
        currentValue += "0";
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    @FXML
    private void handleCalcPadAdd() {

        if(operator == '+') {
            tempString = currentValue;
            currentValue = storedValue;
            storedValue = tempString;
        }
        
        if (storedValue != "" && operator != ' ') {
            operator = '+';
            calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
        }else if(currentValue != "") {
            operator = '+';
            storedValue = currentValue;
            currentValue = "";
            calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
            equalPressed = false;
        }
    }

    @FXML
    private void handleCalcPadMinus() {

        if(operator == '-') {
            tempString = currentValue;
            currentValue = storedValue;
            storedValue = tempString;
        }

        if (storedValue != "" && operator != ' ') {
            operator = '-';
            calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
        }else if(currentValue != "") {
            operator = '-';
            storedValue = currentValue;
            currentValue = "";
            calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
            equalPressed = false;
        }
    }

    @FXML
    private void handleCalcPadMultiply() {

        if(operator == '*') {
            tempString = currentValue;
            currentValue = storedValue;
            storedValue = tempString;
        }

        if (storedValue != "" && operator != ' ') {
            operator = '*';
            calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
        }else if(currentValue != "") {
            operator = '*';
            storedValue = currentValue;
            currentValue = "";
            calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
            equalPressed = false;
        }    }

    @FXML
    private void handleCalcPadDivide() {

        if(operator == '/') {
            tempString = currentValue;
            currentValue = storedValue;
            storedValue = tempString;
        }

        if (storedValue != "" && operator != ' ') {
            operator = '/';
            calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
        }else if(currentValue != "") {
            operator = '/';
            storedValue = currentValue;
            currentValue = "";
            calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
            equalPressed = false;
        }
    }

    @FXML
    private void handleCalcPadDot() {
        if (!currentValue.contains(".")) {
            currentValue += ".";
        }
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    //equals
    @FXML
    private void handleCalcPadEquals() {
        if (currentValue != "") {
            switch (operator) {
                case '+':
                    resultNumber = String.valueOf(Double.parseDouble(storedValue) + Double.parseDouble(currentValue));
                    currentValue = resultNumber;
                    storedValue = "";
                    calcDisplay.setText(currentValue);
                    operator = ' ';
                    break;

                case '-':
                    resultNumber = String.valueOf(Double.parseDouble(storedValue) - Double.parseDouble(currentValue));
                    currentValue = resultNumber;
                    storedValue = "";
                    calcDisplay.setText(currentValue);
                    operator = ' ';
                    break;
                    
                case '*':
                    resultNumber = String.valueOf(Double.parseDouble(storedValue) * Double.parseDouble(currentValue));
                    currentValue = resultNumber;
                    storedValue = "";
                    calcDisplay.setText(currentValue);
                    operator = ' ';
                    break;

                case '/':
                    resultNumber = String.valueOf(Double.parseDouble(storedValue) / Double.parseDouble(currentValue));
                    currentValue = resultNumber;
                    storedValue = "";
                    calcDisplay.setText(currentValue);
                    operator = ' ';
                    break;

                default:
                    break;
            }

            equalPressed = true;
        }
    }

    //clears recent entry ( C )
    @FXML
    private void handleCalcPadClear() {
        if (operator != ' ') {
            currentValue = "";
        }else{
            currentValue = "0";
        }
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    //negative ( +/- )
    @FXML
    private void handleCalcPadNegative() {
        if (currentValue != "") {
            double val = Double.parseDouble(currentValue);
            val = -val;
            if (val == (int) val) {
                currentValue = String.valueOf((int) val);
            } else {
                currentValue = String.valueOf(val);
            }
            calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
        }

    }

    //backspace ( DEL )
    @FXML
    private void handleCalcPadDelete() {
        if (currentValue.length() > 0) {
            currentValue = currentValue.substring(0, currentValue.length() - 1);
        }else if (operator != ' ') {
            operator = ' ';
        }else{
            storedValue = storedValue.substring(0, storedValue.length() - 1);
        }
        calcDisplay.setText(storedValue + " " + operator + " " + currentValue);
    }

    //clears EVERYTHING ( CE )
    @FXML
    private void handleCalcPadCE() {
        currentValue = "0";
        storedValue = "";
        operator = ' ';
        calcDisplay.setText(currentValue);
    }
}
