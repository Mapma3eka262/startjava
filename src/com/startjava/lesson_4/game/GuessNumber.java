package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber;
    private Random random = new Random();
    private Scanner scan = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        hiddenNumber = random.nextInt(100 + 1);
        System.out.println("У вас 10 попыток");

        for (int attempt = 0; attempt < 10; attempt++) {
            if (!makeMove(playerOne, attempt)) {
                if (makeMove(playerTwo, attempt)) {
                    break;
                }
            } else {
                break;
            }
        }

        outputNumbers(playerOne);
        outputNumbers(playerTwo);
    }

    private boolean makeMove(Player player, int attempt) {
        if (attempt == 9) {
            System.out.println("У " + player.getName() + " последняя попытка");
        }
        int number = inputNumber(player, attempt);
        return compareNumber(number, player, attempt);
    }

    private int inputNumber(Player player, int attempt) {
        System.out.println("Игрок " + player.getName() + " введите число");
        int number = scan.nextInt();
        scan.nextLine();
        player.setEnteredNumber(attempt, number);
        return number;
    }

    private boolean compareNumber(int number, Player player, int attempt) {
        if (number != hiddenNumber) {
            if (number > hiddenNumber) {
                System.out.println("Число введенное игроком " + player.getName() + " больше загаданного");
            } else {
                System.out.println("Число введенное игроком " + player.getName() + " меньше загаданного");
            }
            return false;
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " c " + (attempt + 1) + " попытки");
            return true;
        }
    }

    private void outputNumbers(Player player) {
        System.out.print("Игроком " + player.getName() + " введены значения:");
        for (int num : player.getEnteredNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}