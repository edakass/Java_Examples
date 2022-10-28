package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner sc =new Scanner(System.in);

        do{
            System.out.print("Please enter the numbers : ");
            n = sc.nextInt();
            if(n%2 == 0 && n %4 ==0){
                total +=n;
            }
        }while (n>0);

        System.out.println("Total : "+total);
    }
}
