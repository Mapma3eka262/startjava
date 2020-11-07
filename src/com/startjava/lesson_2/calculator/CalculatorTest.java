package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args){
        String again;
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        do {
            System.out.print("Введите первое число: ");
            int firstNum = sc.nextInt();
            sc.nextLine();

            System.out.print("Введите знак математической операции: ");
            char operation = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Введите второе число: ");
            int secondNum = sc.nextInt();
            sc.nextLine();

            calculator.calculate(firstNum, operation, secondNum);          

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                again = sc.nextLine();
            } while (!again.equals("yes") && !again.equals("no"));
        } while (again.equals("yes"));
    }
}