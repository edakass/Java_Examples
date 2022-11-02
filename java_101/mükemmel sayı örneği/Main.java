package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //mÜKEMMEL sAYI öRNEĞİ KENDİSİ HARİCİ BÖLENLERİNİ TOPLAMI O SAYIYA
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int number = sc.nextInt();
        int total=0;

        for (int i =1;i<number;i++){
            if(number % i == 0){
                total +=i;
            }
        }
        if(number == total){
            System.out.println(number+ " Mükemmel sayıdır");
        }else{
            System.out.println(number+" Mükemmel sayı değildir");
        }
    }

}
