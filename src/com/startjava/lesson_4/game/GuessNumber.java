package com.startjava.lesson_4.game;

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
        int Try = 0;

        while (Try != 10) {
            if (Try(playerOne, Try) != "win") {
                Try(playerTwo, Try);
            }
            else {
                Try = 9;
            }
            Try++;
        }

        System.out.println("Игроком " + playerOne.getName() + " введены значения:" + playerOne.getEnteredNumbers());
        System.out.println("Игроком " + playerTwo.getName() + " введены значения:" + playerTwo.getEnteredNumbers());
    }

    private String Try (Player Player, int Try)
    {
        System.out.println("Игрок " + Player.getName() + " введите число");
        Player.setNumber(scan.nextInt());
        scan.nextLine();
        Player.setTry(Try);
        Player.setEneteredNumbers(Try,Player.getNumber());
        if (Player.getNumber() != hiddenNum) {
            if (Player.getNumber() > hiddenNum) {
                System.out.println("Число введенное игроком " + Player.getName() + " больше загаданного");
                if (Try == 9) {
                    System.out.println("У " + Player.getName() + " закончились попытки");
                }
            } else {
                System.out.println("Число введенное игроком " + Player.getName() + " меньше загаданного");
                if (Try == 9) {
                    System.out.println("У " + Player.getName() + " закончились попытки");
                }
            }
            return "lose";
        } else {
            System.out.println("Игрок " + Player.getName() + " угадал число " + hiddenNum + " c " + (Try + 1) + " попытки");
            return "win";
        }
    }
}