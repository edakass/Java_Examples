package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Tabani giriniz: ");
        n = sc.nextInt();
        System.out.print("Ussu giriniz : ");
        k = sc.nextInt();
        int total = 1;

        for (int i=1;i<=k;i++){
            total *=n;
        }
        System.out.println("Cevap : "+total);
        /* WHILE İLE COZUMU
        while (i<=k){
            total *= n;
            i++;
        }

        System.out.println("Cevap : "+total);*/
    }
}
