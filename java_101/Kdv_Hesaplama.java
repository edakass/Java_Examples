package com.company;

import java.util.Scanner;

public class Kdv_Hesaplama {
    public static void main(String[] args) {
	 double fiyat;
     double kdv=0.18;
     System.out.print("Lutfen fiyati giriniz : ");
        Scanner sc = new Scanner(System.in);
        fiyat=sc.nextDouble();
        if(fiyat >=1000){
            kdv=0.8;
        }
        //Kdv li için ise

        double kdvli_sonuc=fiyat*kdv;
        System.out.println("Kdv " +kdvli_sonuc);
        //Toplam kdvli sonuç için ise
        double kdvli_fiyat=fiyat+kdvli_sonuc;
        System.out.println("Kdvli fiyat " + kdvli_fiyat);

        System.out.println("KDV Orani: " + kdv);
    }
}
