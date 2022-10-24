package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int distance;
        int age;
        int typeOfTrip =0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please write the distance : ");
        distance=sc.nextInt();
        System.out.print("Please write your age : ");
        age= sc.nextInt();
        System.out.print("Please write the type of trip (1 => One Way, 2 => Round Trip) : ");
        typeOfTrip = sc.nextInt();

        if(distance <=0 || age <= 0 || typeOfTrip <1 || typeOfTrip>2)
            System.out.println("Wrong answers");
        else{
            distance *= 0.10;
            if(age<12)
                distance *=0.5;
            else if( age>12 && age<=24){
                distance *=0.9;
            }else if(age >= 65)
                distance *=0.3;

            if (typeOfTrip == 1 )
                System.out.println("Amount : " +distance + "TL");
            else
                System.out.println("Amount : "+distance + "TL");
        }
    }
}
