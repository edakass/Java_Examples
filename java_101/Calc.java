package com.company;

import java.util.Scanner;

public class Calc {

    static  int sum(int a,int b){
        int result=a+b;
        System.out.println("Result : "+result);
        System.out.println("******************");
        return result;
    }
    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Result : "+result);
        System.out.println("******************");
        return  result;
    }
    static int times(int a,int b){
        int result=a*b;
        System.out.println("Result : "+result);
        System.out.println("******************");
        return  result;
    }
    static int divided(int a,int b){
        if(b==0){
            System.out.println("The second number must be non-zero.");
            System.out.println("******************");
            return 0;
        }
        int result=a / b;
        System.out.println("Result : "+result);
        System.out.println("******************");
        return  result;
    }
    static  int power(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("******************");
        return  result;
    }
    static int mod(int a,int b){
        System.out.println("******************");
        return a % b;
    }

    static  void calc(int a,int b){
        System.out.println("Perimeter : "+(2*(a+b)));
        System.out.println("******************");
        System.out.println("Area : "+(a*b));
        System.out.println("******************");

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int select;

        String menu="1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                +"4- Dividing\n"
                +"5- Power\n"
                +"6- Factorial\n"
                +"7- Mod\n"
                +"8- Rectangular Area and Perimeter Calculation\n"
                +"0- Exit";

        System.out.println(menu);
         while (true){


             System.out.print("Please select item : ");
             select=sc.nextInt();

             if(select==0){
                 break;
             }
             System.out.println("First number : ");
             int a=sc.nextInt();
             System.out.println("Second number : ");
             int b=sc.nextInt();

             switch (select){
                 case 1:
                     sum(a,b);
                     break;

                 case  2:
                     minus(a,b);
                     break;

                 case  3:
                     times(a,b);
                     break;

                 case 4:
                     divided(a,b);
                     break;

                 case 5:
                     System.out.println("Power : "+power(a,b));
                     break;
                 case 6:
                     System.out.println("Mod : "+mod(a,b));
                     break;
                 case  7:
                     calc(a,b);
                     break;
                 default:
                     System.out.println("Invalid operation...");

             }
         }
         System.out.println("See you :)");
    }
}
