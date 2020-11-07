package com.startjava.lesson_2.wolf;

public class WolfTest {
    public static void main(String[] args) { 
        Wolf wildWolf = new Wolf();
          
        wildWolf.setSex("Кобель");
        System.out.println("Пол: " + wildWolf.getSex());

        wildWolf.setNickname("Ghost");
        System.out.println("Кличка: " + wildWolf.getNickname());

        wildWolf.setWeight(40.5f);
        System.out.println("Вес: " + wildWolf.getWeight());
        
        wildWolf.setAge(13);
        if (wildWolf.getAge() < 8 && wildWolf.getAge() > 0) {
            System.out.println("Возраст: " + wildWolf.getAge());
        } 
        wildWolf.setColor("Серый");
        System.out.println("Окрас: " + wildWolf.getColor());
        wildWolf.move();
        wildWolf.sit();
        wildWolf.run();
        System.out.println(wildWolf.howl());
        System.out.println(wildWolf.hunt());
    }
}