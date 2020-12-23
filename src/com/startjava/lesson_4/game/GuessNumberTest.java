package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String again;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("Введите имя первого игрока");
            Player playerOne = new Player(scan.nextLine());
            System.out.println("Введите имя второго игрока");
            Player playerTwo = new Player(scan.nextLine());
            
            GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
            guessNumber.start();

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                again = scan.nextLine();
            } while (!again.equals("yes") && !again.equals("no"));
        } while (again.equals("yes"));
    }
}