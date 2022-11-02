package com.company;

import java.util.Scanner;

public class Main {

    public static  boolean PowersOfTwo(int num){
        double number=(double) num;
        if(number % 2 == 0){
            while (number>=2.0){
                number /=2.0;
                System.out.println(number);
            }
        }else {
            return false;
        }
        return  number == 1.0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println("Lütfen sayı girniz : ");
        Scanner sc = new Scanner(System.in);
        System.out.print(PowersOfTwo(sc.nextInt()));
    }

}
