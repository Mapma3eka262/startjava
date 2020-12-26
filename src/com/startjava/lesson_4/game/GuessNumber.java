package com.startjava.lesson_4.game;

import java.util.Arrays;
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
        int attempt;

        for (attempt = 0; attempt < 10; attempt++) {
            if (makeMove(playerOne, attempt) != "win") {
                if (makeMove(playerTwo, attempt) == "win") {
                    attempt = 9;
                }
            } else {
                attempt = 9;
            }
        }
        System.out.print("Игроком " + playerOne.getName() + " введены значения:");
        for (int i = 0; i < playerOne.getEnteredNumbers().length; i++) {
            System.out.print(playerOne.getEnteredNumbers()[i] + " ");
        }
        System.out.println("");
        System.out.print("Игроком " + playerTwo.getName() + " введены значения:");
        for (int i = 0; i < playerTwo.getEnteredNumbers().length; i++) {
            System.out.print(playerTwo.getEnteredNumbers()[i] + " ");
        }
        System.out.println("");
    }

    private String makeMove(Player player, int attempt)    {

        if (verification(inputNumbers(player, attempt), hiddenNumber, player, attempt) != "win")
        {
            return "lose";
        } else {
            return "win";
        }
    }

    private int inputNumbers(Player player, int attempt) {
        System.out.println("Игрок " + player.getName() + " введите число");
        int number = scan.nextInt();
        scan.nextLine();
        player.setEnteredNumber(attempt, number);
        return number;
    }

    private String verification(int number, int hiddenNumber, Player player, int attempt) {
        if (number != hiddenNumber) {
            if (number > hiddenNumber) {
                System.out.println("Число введенное игроком " + player.getName() + " больше загаданного");
                if (attempt == 9) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                }
            } else {
                System.out.println("Число введенное игроком " + player.getName() + " меньше загаданного");
                if (attempt == 9) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                }
            }
            return "lose";
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " c " + (attempt + 1) + " попытки");
            return "win";
        }
    }
}