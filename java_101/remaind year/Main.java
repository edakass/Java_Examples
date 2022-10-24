package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;

        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter the year : ");

        year = sc.nextInt();

        if(year % 4 == 0){
            System.out.println("Artik yil");
        }
        else {
            System.out.println("Artik yil degil");
        }
    }
}
