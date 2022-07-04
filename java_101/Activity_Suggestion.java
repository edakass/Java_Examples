package com.company;

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class Activity_Suggestion {

    public static void main(String[] args) {
        int heat;

        Scanner sc=new Scanner(System.in);

        System.out.print("Please enter a temperature value: ");
        heat=sc.nextInt();


        String activity_suggestion = (heat < 5) ? "You can ski..."
                : ((5 <= heat && heat < 15) ? "You can go to the cinema..."
                : ((15 <= heat && heat <= 25) ? "You can go picnic..."
                : "You can go swimming..."));

        System.out.println(activity_suggestion);


        /*if(heat<5){
            System.out.println("You can ski...");
        }else if(heat>=5 && heat<=25){
            if(heat<=15){
                System.out.println("You can go to the cinema...");
            }
            if(heat>=10){
                System.out.println("You can go picnic...");
            }
        }else{
            System.out.println("You can go swimming...");
        }*/

    }
}
