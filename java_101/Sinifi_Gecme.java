package com.company;

import java.util.Scanner;

public class Sinifi_Gecme {

    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;

        double average;


        Scanner sc=new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        matematik=sc.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik=sc.nextInt();

        System.out.print("Turkce notunuzu giriniz : ");
        turkce=sc.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya=sc.nextInt();

        System.out.print("Muzik notunuzu giriniz : ");
        muzik=sc.nextInt();

        average=(matematik+fizik+turkce+kimya+muzik)/5;

        if(average<55){
            System.out.println("Sinifta kaldiniz");
        }else{
            System.out.println("Tebrikler gectiniz"+average);
        }

    }
}
