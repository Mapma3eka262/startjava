package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int number;
    private int[] allNumber = new int[10];
    private int chance;

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

    public void setChance(int chance) {
        this.chance = chance;
        allNumber[chance] = number;
    }

    public int getChance() {
        return chance;
    }

    public int getAllNumber(int i) {
        return allNumber[i];
    }
}