package com.company;

import java.util.Scanner;

public class Sort_Numbers {

    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("First number : ");
        a = sc.nextInt();

        System.out.print("Second number : ");
        b = sc.nextInt();

        System.out.print("Third number : ");
        c = sc.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println(c + " < " + b + " < " + a);
            } else {
                System.out.println(b + " < " + c + " < " + a);
            }

        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println(c + " < " + a + " < " + b);
            } else {
                System.out.println(a + " < " + c + " < " + b);
            }

        } else if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.println(b + " < " + a + " < " + c);
            } else {
                System.out.println(a + " < " + b + " < " + c);
            }

        }

    }
}
