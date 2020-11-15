package com.startjava.lesson_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private double result;

    public int calculate(String operation){
        String[] items = operation.split(" ", 3);

        switch(items[1]) {
            case "+":
                result = addExact(Integer.parseInt(items[0]), Integer.parseInt(items[2]));
                break;
            case "-":
                result = subtractExact(Integer.parseInt(items[0]), Integer.parseInt(items[2]));
                break;
            case "*":
                result = multiplyExact(Integer.parseInt(items[0]), Integer.parseInt(items[2]));
                break;
            case "/":
                result = floorDiv(Integer.parseInt(items[0]), Integer.parseInt(items[2]));
                break;
            case "^":
                result = 1;
                for (int i = 0; i < Integer.parseInt(items[2]); i++) {
                    result *= Integer.parseInt(items[0]);
                }
                break;
            case "%":
                result = floorMod(Integer.parseInt(items[0]), Integer.parseInt(items[2]));
                break;
            default:
                System.out.println("Введены некорректные данные");
        }
        return (int) result;
    }
}