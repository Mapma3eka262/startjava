package com.startjava.lesson_4.game;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];
    private int Try;

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

    public void setTry(int Try) {
        this.Try = Try;
        enteredNumbers[Try] = number;
    }

    public int getTry() {
        return Try;
    }

    public String getEnteredNumbers() {
        return Arrays.toString(Arrays.copyOf(enteredNumbers,Try+1));
    }

    public void setEneteredNumbers(int Try, int number) {
        this.enteredNumbers[Try] = number;
    }
}