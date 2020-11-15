package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args){
        String again;
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        do {
            System.out.print("Введите математическое выражение: ");
            String operation = sc.nextLine();
            System.out.println("Результат: " + calculator.calculate(operation));

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                again = sc.nextLine();
            } while (!again.equals("yes") && !again.equals("no"));
        } while (again.equals("yes"));
    }
}