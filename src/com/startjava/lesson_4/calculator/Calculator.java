package com.startjava.lesson_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private double result;

    public double calculate(String expression) {
        String[] items = expression.split(" ", 3);
        int firstNumber = Integer.parseInt(items[0]);
        int secondNumber = Integer.parseInt(items[2]);

        switch(items[1]) {
            case "+":
                return addExact(firstNumber, secondNumber);
            case "-":
                return  subtractExact(firstNumber, secondNumber);
            case "*":
                return  multiplyExact(firstNumber, secondNumber);
            case "/":
                return  floorDiv(firstNumber, secondNumber);
            case "^":
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                return result;
            case "%":
                return floorMod(firstNumber, secondNumber);
            default:
                System.out.println("Введены некорректные данные");
        }
        return 0;
    }
}