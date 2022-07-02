package com.company;

import java.util.Scanner;

public class Hipoten {

    public static void main(String[] args) {
        //Kenarlar için
        int a,b;
        double c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen ilk kenar : ");
        a=sc.nextInt();
        System.out.println("Lutfen ikinci kenar : ");
        b=sc.nextInt();
        //c=a*a+b*b;
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus ise : " +c);

        /*
        Alan ve çevre için ise
        𝑢 = a+b+c
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */
       //Üçgenin çevresini bulalım
        double u,cevre,alan;
        u = (a+b+c)/2;
        cevre = (2*u);
        alan = Math.sqrt((u*((u-a)*(u-b)*(u-c))));
        System.out.print("Ucgenin Alani : "+ alan);
    }
}
