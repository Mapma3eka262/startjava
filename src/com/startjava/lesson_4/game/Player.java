package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int[] getEnteredNumber() {
        return Arrays.copyOf(enteredNumbers,attempt + 1);
    }

    public void setEnteredNumber(int attempt, int number) {
        this.attempt = attempt;
        enteredNumbers[attempt] = number;
    }
}