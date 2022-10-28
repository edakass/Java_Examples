package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number : ");
        num = sc.nextInt();
        for (int i=1;i<=num;i*=4){
                System.out.println(i);
        }
        System.out.println("----------------------------------");
        for (int i=1;i<=num;i*=5){
            System.out.println(i);
        }

    }
}
