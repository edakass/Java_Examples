package com.company;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        double kg,cm,bmi;
        Scanner sc=new Scanner(System.in);

        System.out.println("Kiloyu giriniz : ");
        kg=sc.nextDouble();

        System.out.println("Boyu giriniz : ");
        cm=sc.nextDouble();

        bmi=(kg/(cm*cm)) * 10000;

        System.out.println("Bmi : "+bmi);


    }
}
