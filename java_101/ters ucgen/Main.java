package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç satir olsun : ");
        int yildizSayisi=sc.nextInt() ;
        int i,j,k;
        for (i=yildizSayisi; 0<i; i--) {
            for (j = i; j < yildizSayisi; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
