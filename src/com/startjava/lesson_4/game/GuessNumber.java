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
            System.out.println("Игрок " + playerOne.getName() + " введите число");
            playerOne.setNumber(scan.nextInt());
            playerOne.setTry(Try);
            playerOne.setEneteredNumbers(Try,playerOne.getNumber());
            if (playerOne.getNumber() != hiddenNum) {
                if (playerOne.getNumber() > hiddenNum) {
                    System.out.println("Число введенное игроком " + playerOne.getName() + " больше загаданного");
                    if (Try==9) {
                        System.out.println("У " + playerOne.getName() + " закончились попытки");
                    }
                } else {
                    System.out.println("Число введенное игроком " + playerOne.getName() + " меньше загаданного");
                    if (Try==9) {
                        System.out.println("У " + playerOne.getName() + " закончились попытки");
                    }
                }
            } else {
                System.out.println("Игрок " + playerOne.getName() + " угадал число " + hiddenNum + " c " + (Try+1) + " попытки");
                break;
            }


            System.out.println("Игрок " + playerTwo.getName() + " введите число");
            playerTwo.setNumber(scan.nextInt());
            scan.nextLine();
            playerTwo.setTry(Try);
            if (playerTwo.getNumber() != hiddenNum) {
                if (playerTwo.getNumber() > hiddenNum) {
                    System.out.println("Число введенное игроком " + playerTwo.getName() + " больше загаданного");
                    if (Try==9) {
                        System.out.println("У " + playerTwo.getName() + " закончились попытки");
                    }
                } else {
                    System.out.println("Число введенное игроком " + playerTwo.getName() + " меньше загаданного");
                    if (Try==9) {
                        System.out.println("У " + playerTwo.getName() + " закончились попытки");
                    }
                }
            } else {
                System.out.println("Игрок " + playerTwo.getName() + " угадал число " + hiddenNum + " c " + (Try+1) + " попытки");
                break;
            }
            Try++;
        }

        System.out.println("Игроком " + playerOne.getName() + " введены значения:" + playerOne.getEnteredNumbers());
        System.out.println("Игроком " + playerTwo.getName() + " введены значения:" + playerTwo.getEnteredNumbers());
    }
}