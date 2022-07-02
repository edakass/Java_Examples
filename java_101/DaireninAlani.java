package com.company;

import java.util.Scanner;

public class DaireninAlani {

    public static void main(String[] args) {
        int r;
        double pi=3.14;

        Scanner sc=new Scanner(System.in);

        System.out.println("Dairenin yari çapini giriniz : ");
        r=sc.nextInt();

        double alan=pi * r *r;
        double cevre=2 * pi * r;

        System.out.println("Dairenin alani : "+alan);
        System.out.println("Dairenin cevresi " + cevre);

        int a;
        System.out.println("Dairenin Diliminin Acisi : ");
        a=sc.nextInt();

        double diliminin_alani=(pi * (r*r) * a) / 360;

        System.out.println("Dairenin Diliminin Alani : "+diliminin_alani);


    }
}
