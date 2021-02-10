package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber;
    private Random random = new Random();
    private Scanner scan = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    private int constant = 10;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        hiddenNumber = random.nextInt(100 + 1);
        System.out.println("У вас 10 попыток");

        for (int attempt = 0; attempt < constant; attempt++) {
            if (makeMove(playerOne, attempt, constant)) {
                break;
            } else {
                if (makeMove(playerTwo, attempt, constant)) {
                    break;
                }
            }
        }

        outputNumbers(playerOne);
        outputNumbers(playerTwo);
    }

    private boolean makeMove(Player player, int attempt, int constant) {
        if (attempt == constant-1) {
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
            String compare = (number > hiddenNumber) ? " больше загаданного" : " меньше загаданного";
            System.out.println("Число введенное игроком " + player.getName() + compare);
            return false;
        } {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " c " + (attempt + 1) + " попытки");
            return true;
        }
    }

    private void outputNumbers(Player player) {
        System.out.print("Игроком " + player.getName() + " введены значения:");
        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}