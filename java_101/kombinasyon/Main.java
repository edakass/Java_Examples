package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
         */
        // 1. aşama
        System.out.println("Please enter the n and r");
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        num = sc.nextInt();
        System.out.print("r : ");
        int r = sc.nextInt();
        System.out.println("C("+ num +","+r+")");

        int total = 1;
        for(int i=1;i<=num;i++){
            total = total * i;
        }
        System.out.println(num +"(n!) => "+ total);

        //2.aşama --> r!
        int totr=1;
        for (int j=1;j<=r;j++){
            totr =totr * j;
        }
        System.out.println(num +"(r!) => "+ totr);
        //3.aşama n-r
        int minus = num - r;
        //4.aşama (n-r)!
        int minT=1;
        for (int k =1;k<=minus;k++){
            minT =minT *k;
        }
        System.out.println("(n-r)! =>" + minT);
        //5.aşama
        int sec= totr * minT;
        System.out.println("(r! * (n-r)!) =>" + minT);

        int finalend = total / sec;

        System.out.println(finalend);




      /*  //Faktoriyel
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fact : ");
        num = sc.nextInt();
        int total = 1;

        for(int i=1;i<=num;i++){
            total = total * i;
        }
        System.out.println(num +" => "+ total);
*/

    }
}
