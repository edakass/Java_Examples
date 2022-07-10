package com.company;

import java.util.Scanner;

public class Rec {

    static  int pow(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }

        return  result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Tabani giriniz : ");
        int a=sc.nextInt();
        System.out.println("Us degerini giriniz : ");
        int b=sc.nextInt();

        System.out.println("Sonuc :" +pow(a,b));
    }
}
