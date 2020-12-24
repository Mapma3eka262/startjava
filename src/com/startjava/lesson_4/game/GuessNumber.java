package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNum;
    private Random random = new Random();
    private Scanner scan = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        hiddenNum = random.nextInt(100 + 1);
        System.out.println("У вас 10 попыток");
        int attempt = 0;

        while (attempt != 10) {
            if (Try(playerOne, attempt) != "win") {
                Try(playerTwo, attempt);
            }
            else {
                attempt = 9;
            }
            attempt++;
        }

        System.out.println("Игроком " + playerOne.getName() + " введены значения:" + Arrays.toString(playerOne.getEnteredNumber()));
        System.out.println("Игроком " + playerTwo.getName() + " введены значения:" + Arrays.toString(playerTwo.getEnteredNumber()));
    }

    private String Try(Player player, int attempt)    {
        System.out.println("Игрок " + player.getName() + " введите число");
        player.setNumber(scan.nextInt());
        scan.nextLine();
        player.setEnteredNumber(attempt,player.getNumber());
        if (player.getNumber() != hiddenNum) {
            if (player.getNumber() > hiddenNum) {
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
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNum + " c " + (attempt + 1) + " попытки");
            return "win";
        }
    }
}