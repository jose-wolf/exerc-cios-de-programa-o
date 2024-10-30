package com.br.Exercism.java.calculatorconundrum;

public class CalculatorConundrum {

    public String calculate(int operand1,int operand2, String operation){
        if (operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        try {


            switch (operation) {
                case "+":
                    return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
                case "*":
                    return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
                case "/":
                    if (operand2 == 0) {
                        throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
                    }
                    return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                case "":
                    throw new IllegalArgumentException("Operation cannot be empty");
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        }catch (ArithmeticException e){
            throw new IllegalOperationException("Division by zero is not allowed",e);
        }


    }
}

