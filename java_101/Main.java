package com.company;

import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if(number==reverseNumber){
            System.out.println("Your number is "+number +" Palindrom ");
            return true;
        }else{
            System.out.println("Your number is "+number+" Not Palindrom");
            return  false;
        }
      /*  while (temp!=0){
            System.out.println("*******************");
            System.out.println("Number : "+temp);
            lastNumber=temp%10;
            System.out.println("Last Number : "+lastNumber);
            reverseNumber=(reverseNumber*10)+lastNumber;
            System.out.println("New Number : "+reverseNumber);
            temp /=10;
            System.out.println("New temp : "+temp);

        }*/
        /*
        if(number==reverseNumber)
           return true;
        else
           return false;
            return true;
         */

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num=sc.nextInt();
        isPalindrom(num);
        //isPalindorm(247);
        // 7 * 10= 70 + 4 =74
        //74 * 10 = 740 + 2 =742
        //isPalindrom(247);
        //System.out.println(isPalindrom(247););

    }
}
