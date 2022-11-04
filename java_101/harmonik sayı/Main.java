package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //Harmonik sayılar
        // 1+(1/2)+(1/3)...+(1/n)
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz : ");
        int number = sc.nextInt();
        double result =0.0;
        for(int i=1;i<=number;i++){
            result += (1.0/i);
        }
        System.out.print(result);
    }
}
