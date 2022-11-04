package com.company;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //Min max hesaplama
        //kullanıcıdan girilen sayı kadar sayı girilmesi
        Scanner sc =new Scanner(System.in);
        System.out.print("Kac tane sayi olsun : ");
        int sayiAdeti = sc.nextInt();

        int sayi;
        int buyukSayi = 0;
        int kucukSayi=0;

        for(int i=1;i<=sayiAdeti;i++){
            System.out.print(i+ ". Sayiyi giriniz : ");
            sayi=sc.nextInt();

            if(i==1){
                buyukSayi =sayi;
                kucukSayi =sayi;
            }else {
                if(sayi<kucukSayi){
                    kucukSayi =sayi;
                }else if(sayi>buyukSayi){
                    buyukSayi = sayi;
                }
            }
        }
        System.out.println("Buyuk sayi : "+buyukSayi);
        System.out.println("Kucuk sayi : "+kucukSayi);


    }
}
