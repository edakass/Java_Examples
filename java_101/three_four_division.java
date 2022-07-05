package com.company;

import java.util.Scanner;

public class three_four_division {

    public static void main(String[] args) {
        int number;

        double average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter  a number : ");
        number=sc.nextInt();

        double total=0;
        int counter=0;
        for (int i=0;i<=number;i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                total+=i;
                counter++;
            }
        }
        average=total/counter;
        System.out.println("Average : "+average);
    }
}
