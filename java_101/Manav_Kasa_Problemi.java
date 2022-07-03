package com.company;

import java.util.Scanner;

public class Manav_Kasa_Problemi {

    public static void main(String[] args) {
        //Değişkenleri tanımladım
        double armut,elma,domates,muz,patlican;

        //Scanner sınıfımız tanımlandı
        Scanner sc=new Scanner(System.in);

        //Kullanıcıdan değerleri alacağımız kısım
        System.out.print("Armut kac kilo olsun ? ");
        armut=sc.nextDouble();
        //Değerimizi aldıktan sonra bize en sonda kilosuyla fiyatının çarpılmış kısmı
        armut=armut*2.14;

        System.out.print("Elma kac kilo olsun ? ");
        elma=sc.nextDouble();
        elma=elma*3.67;

        System.out.print("Domates kac kilo olsun ? ");
        domates=sc.nextDouble();
        domates=domates*=1.11;

        System.out.print("Muz kac kilo olsun ? ");
        muz=sc.nextDouble();
        muz=muz*0.95;

        System.out.print("Patlican kac kilo olsun ? ");
        patlican=sc.nextDouble();
        patlican=patlican*5.00;

        double toplam_tutar;
        toplam_tutar=armut+elma+domates+muz+patlican;

        System.out.println("Toplam tutar : "+toplam_tutar +" TL") ;
    }
}
