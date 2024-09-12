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

    @FXML Label subDisplay;
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

    String currentNumber = "";
    String storedNumber = "";
    String resultNumber = "";
    char operator = ' ';
    boolean equalsUsed = false;

    @FXML
    private void handleCalcPad1() {
        currentNumber += "1";
        calcDisplay.setText(currentNumber);

    }

    @FXML
    private void handleCalcPad2() {
        currentNumber += "2";
        calcDisplay.setText(currentNumber);
    }

    @FXML
    private void handleCalcPad3() {
        currentNumber += "3";
        calcDisplay.setText(currentNumber);
    }

    @FXML
    private void handleCalcPad4() {
        currentNumber += "4";
        calcDisplay.setText(currentNumber);
    }

    @FXML
    private void handleCalcPad5() {
        currentNumber += "5";
        calcDisplay.setText(currentNumber);
    }

    @FXML
    private void handleCalcPad6() {
        currentNumber += "6";
        calcDisplay.setText(currentNumber);
    }

    @FXML
    private void handleCalcPad7() {
        currentNumber += "7";
        calcDisplay.setText(currentNumber);
    }

    @FXML
    private void handleCalcPad8() {
        currentNumber += "8";
        calcDisplay.setText(currentNumber);
    }

    @FXML
    private void handleCalcPad9() {
        currentNumber += "9";
        calcDisplay.setText(currentNumber);
    }

    @FXML
    private void handleCalcPad0() {
        currentNumber += "0";
        calcDisplay.setText(currentNumber);
    }

    @FXML
    private void handleCalcPadAdd() {

        if (currentNumber.length() > 0 && storedNumber.length() > 0) {
            handleCalcPadEquals();
            currentNumber = "";
            calcDisplay.setText(currentNumber);
        }
        
        operator = '+';

        if(currentNumber.length() > 0) {
            storedNumber = currentNumber;
            currentNumber = "";
            calcDisplay.setText(currentNumber);
        }

        subDisplay.setText(storedNumber + " + ");

    }

    @FXML
    private void handleCalcPadMinus() {


        if (currentNumber.length() > 0 && storedNumber.length() > 0) {
            handleCalcPadEquals();
            currentNumber = "";
            calcDisplay.setText(currentNumber);
        }

        operator = '-';

        if(currentNumber.length() > 0) {
            storedNumber = currentNumber;
            currentNumber = "";
            calcDisplay.setText(currentNumber);
        }

        subDisplay.setText(storedNumber + " - ");
    }

    @FXML
    private void handleCalcPadMultiply() {

        if (currentNumber.length() > 0 && storedNumber.length() > 0) {
            handleCalcPadEquals();
            currentNumber = "";
            calcDisplay.setText(currentNumber);
        }
        
        operator = '*';

        if(currentNumber.length() > 0) {
            storedNumber = currentNumber;
            currentNumber = "";
            calcDisplay.setText(currentNumber);
        }

        subDisplay.setText(storedNumber + " * ");

    }

    @FXML
    private void handleCalcPadDivide() {
        
        if (currentNumber.length() > 0 && storedNumber.length() > 0) {
            handleCalcPadEquals();
            currentNumber = "";
            calcDisplay.setText(currentNumber);
        }

        operator = '/';

        if(currentNumber.length() > 0) {
            storedNumber = currentNumber;
            currentNumber = "";
            calcDisplay.setText(currentNumber);
        }

        subDisplay.setText(storedNumber + " / ");

    }

    @FXML
    private void handleCalcPadDot() {
        if (equalsUsed == true) {
            equalsUsed = false;
            handleCalcPadClear();
        }

        if (!currentNumber.contains(".")) {
            currentNumber = currentNumber.concat(".");
            calcDisplay.setText(currentNumber);
        }
    }

    @FXML
    private void handleCalcPadEquals() {
        if (storedNumber.length() > 0) {
            switch (operator) {
                case '+':
                    resultNumber = String.valueOf(Double.parseDouble(storedNumber) + Double.parseDouble(currentNumber));
                    break;
                case '-':
                    resultNumber = String.valueOf(Double.parseDouble(storedNumber) - Double.parseDouble(currentNumber));
                    break;
                case '*':
                    resultNumber = String.valueOf(Double.parseDouble(storedNumber) * Double.parseDouble(currentNumber));
                    break;
                case '/':
                    resultNumber = String.valueOf(Double.parseDouble(storedNumber) / Double.parseDouble(currentNumber));
                    break;
                default:
                    break;
            }

            subDisplay.setText(storedNumber + " " + operator + " " + currentNumber + " = ");

            if (resultNumber.endsWith(".0")) {
                resultNumber = resultNumber.substring(0, resultNumber.length() - 2);
            }
            
            calcDisplay.setText(resultNumber);
            storedNumber = resultNumber;
            resultNumber = "";
            equalsUsed = true;
        }
    }

    //clears everything ( C )
    @FXML
    private void handleCalcPadClear() {
        currentNumber = "";
        storedNumber = "";
        resultNumber = "";
        operator = ' ';
        calcDisplay.setText("0");
        subDisplay.setText("");
    }

    @FXML
    private void handleCalcPadNegative() {
        if (equalsUsed == true) {
            equalsUsed = false;
            handleCalcPadClear();
        }

        if (!currentNumber.startsWith("-")) {
            currentNumber = "-" + currentNumber;
        } else {
            currentNumber = currentNumber.substring(1);
        }
        calcDisplay.setText(currentNumber);
    }

    //backspace ( DEL )
    @FXML
    private void handleCalcPadDelete() {
        if (currentNumber.length() > 0) {
            currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
        }
        calcDisplay.setText(currentNumber);
    }

    //clears recent entry ( CE )
    @FXML
    private void handleCalcPadCE() {
        equalsUsedClear(equalsUsed);
        currentNumber = "";
        calcDisplay.setText("0");
    }

    private void equalsUsedClear(boolean equalsUsed) {
        if (equalsUsed == true) {
            equalsUsed = false;
            handleCalcPadClear();
        }
    }
}
