package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Burc {

    public static void main(String[] args) {
      //about digit project
        /*
        Not: Her adımından sonra dizinin boyutunu yazır.
        1- Yan yana ve alt alta tüm rakamları yazdır
        --> Her adımından sonra dizinin boyutunu yazır.
        2- Çift ve tek rakamları yazdır.
        --> Her adımından sonra dizinin boyutunu yazır.
        3- Bu listeye 2 basamaklı ve 3 basamaklı sayı ekle
        --> Her adımından sonra dizinin boyutunu yazır.
        4- Tek basamaklıları çıkar ve geri kalanları yazdır.
        --> Her adımından sonra dizinin boyutunu yazır.
         */

        System.out.println("Liste yazilmasi");
        ArrayList<Integer> digits2 = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

        for(int i = 0; i < digits2.size(); i++)
        {
            //yan yana yazılması
            System.out.print(" "+digits2.get(i));
        }
        System.out.println();

        System.out.println("Listelenmis hali");
        for (int element: digits2) {
            System.out.println(element);
        }
        System.out.println();
        System.out.println("Size : "+digits2.size());
        System.out.println("************************");

        System.out.println("Ekleniyor ...");
        digits2.add(23);
        digits2.add(500);
        digits2.add(140);
        digits2.add(12);
        digits2.add(33);
        digits2.add(350);
        digits2.add(612);
        System.out.println("Eklenmis Hali");

        for(int i = 0; i < digits2.size(); i++)
        {
            System.out.print(" "+digits2.get(i));
        }
        System.out.println();
        System.out.println("Listelenmis hali");

        for (int element: digits2) {
            System.out.println(element);
        }
        System.out.println();
        System.out.println("Size "+digits2.size());


        System.out.println("************************");
        System.out.println();

        //tek ve çift sayıları ayirma
        ArrayList<Integer> odd_nums = new ArrayList<Integer>();
        ArrayList<Integer> even_nums = new ArrayList<Integer>();

        for(int i = 0; i < digits2.size(); i++)
        {
            if(i%2==0) even_nums.add(i);
            else odd_nums.add(i);
        }

        System.out.println("odd numbers: "+odd_nums+"\nSize : "+odd_nums.size()+"\neven numbers: "+even_nums+"\nSize :"+even_nums.size());



        System.out.println();
        System.out.println("************************");
        System.out.println();


        System.out.println("4. adim ise tek basamaklilari cikar");

        //yeni bir bir aaray list atayıp yapmam lazım
        //bence iki yöntem var ya bir tane  yeni arraylist tanımlancak ya da arraylist in remove() metodu kullancak

        ArrayList<Integer> tek_basamak = new ArrayList<Integer>();

        for(int i = 0; i < digits2.size(); i++)
        {
            if(i/10==0) tek_basamak.add(i);
            else System.out.println(" "+digits2.get(i));
        }

        System.out.println("tek basamak: "+tek_basamak);


        //Diğer yöntem ise

        System.out.println("Yeni kaldirma islemi");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,23,500,140,12,33,350,612));
        numbers.removeIf( number -> number/10 == 0 );
        System.out.println(numbers);

    }
}


