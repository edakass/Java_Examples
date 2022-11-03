package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Animals animals = new Animals();
        System.out.println("Tiger information ");
        Tiger tiger = new Tiger();
        tiger.catVoice();
        tiger.eat();
        System.out.println("---------------------");
        System.out.println("Lion information ");
        Lion lion = new Lion();
        lion.age=11;
        lion.catVoice();
        lion.animalName="MY NAME IS LION :) ";
        lion.eat();
        lion.animalType="Cat";
        lion.getDosage();
        System.out.println("Age : " +lion.age+
                "\nName : "+lion.animalName+
                "\nType : "+ lion.animalType);
        System.out.println("---------------------");
        System.out.println("Dog information ");
        Dogs dogs = new Dogs();
        dogs.bark();
        dogs.age=15;
        System.out.println("Age : " +dogs.age);
    }
}
