package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        char operation = '^';  // Мат. знак
        int firstNum = 4;     // Введите 1 число для математических операций
        int secondNum = 3;     // Введите 2 число для математических операций
        double result = 1;

        if (operation == '+') {
            System.out.println("Выбран математический знак: " + operation);
            result = firstNum + secondNum;
            System.out.println("Результат сложения чисел " + firstNum + " и " + secondNum + ": " + result);
        } else if (operation == '-') {
            System.out.println("Выбран математический знак: " + operation);
            result = firstNum - secondNum;
            System.out.println("Результат вычитания чисел " + firstNum + " и " + secondNum + ": " + result);
        } else if (operation == '*') {
            System.out.println("Выбран математический знак: " + operation);
            result = firstNum * secondNum;
            System.out.println("Результат умножения чисел " + firstNum + " и " + secondNum + ": " + result);
        } else if (operation == '/') {
            System.out.println("Выбран математический знак: " + operation);
            result = firstNum / secondNum;
            System.out.println("Результат деления чисел " + firstNum + " и " + secondNum + ": " + result);
        } else if (operation == '^') {
            System.out.println("Выбран математический знак: " + operation);
            for (int i = 0; i < secondNum; i++) {
                result *= firstNum;
            }
            System.out.println("Результат возведения числа " + firstNum + " в степень " + secondNum + ": " + result);
        } else {
            System.out.println("Выбран математический знак: " + operation);
            result = firstNum % secondNum;
            System.out.println("Остаток от деления чисел " + firstNum + " и " + secondNum + ": " + result);
        }
    }
}