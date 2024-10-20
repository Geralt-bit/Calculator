package org.example.calc;

public class Calculator {
    private double operand1;
    private double operand2;
    private char operator;
    private double result;
    private boolean isError;


    public boolean isError(){
        return isError;
    }

    public void clear() {
        operand1 = 0;
        operand2 = 0;
        operator = ' ';
        result = 0;
        isError = false;
    }

    public void setOperand1(double operand1){
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2){
        this.operand2 = operand2;
    }

    public void setOperator(char operator){
        this.operator = operator;
    }

    public double getResult(){
        return result;
    }


    public void calculate() {
        isError = false;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    isError = true;
                    result = Double.NaN;
                } else {
                    result = operand1 / operand2;
                }
                break;
            default:
                isError = true;
                result = Double.NaN;
                break;
        }
    }
}
