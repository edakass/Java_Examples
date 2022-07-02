package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Değişkenleri oluştur
        int mat,muzik,turkce,fizik,kimya,tarih;

        //Scanner sınıfımız tanımlandı
        Scanner sc=new Scanner(System.in);

        //Kullanıcıdan değerleri alacağımız kısım
        System.out.println("Matematik notunuzu giriniz : ");
        mat=sc.nextInt();

        System.out.println("Muzik notunuzu girniniz : ");
        muzik=sc.nextInt();

        System.out.println("Turkce notunuzu giriniz : ");
        turkce=sc.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik=sc.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya=sc.nextInt();

        System.out.println("Tarih notunuzu giriniz : ");
        tarih=sc.nextInt();

        //Ortalama için
        int toplam =(mat + muzik + turkce + fizik + kimya + tarih);
        double sonuc=toplam / 6.0;
        System.out.println("Ortalama : "+sonuc);

        //Kaldi veya geçme durumu
        String string=(sonuc >= 60) ? "Tebrikler !! Sınıfı Gectiniz." : "Kaldiniz. Calismayi Birakmayiniz ...";
        System.out.println(string);
    }
}
