package com.company;

import java.util.Scanner;

public class Switch_Case_Hesap_Makinesi {

    public static void main(String[] args) {
        int number1,number2,select;

        Scanner sc=new Scanner(System.in);

        System.out.print("Please write number1 : ");
        number1=sc.nextInt();

        System.out.print("Please write number2 : ");
        number2=sc.nextInt();

        System.out.println("1-Addition(+)\n2-Subtraction(-)\n3-Multiplication(*)\n4-Dividing(:)");
        System.out.println("Your select : ");
        select=sc.nextInt();

        switch(select){
            case 1:
                System.out.print(number1+number2);
                break;
            case 2:
                System.out.print(number1-number2);
                break;
            case  3:
                System.out.print(number1*number2);
                break;
            case  4:
                if(number2==0){
                    System.out.println("not divide 0");
                    break;
                }
                System.out.print(number1/number2);
                break;
            default:
                System.out.println("Wrong choice..");

        }


    }
}
