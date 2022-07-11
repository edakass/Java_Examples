package com.company;

import java.util.Scanner;

public class Burc {

    public static void main(String[] args) {
        String ay;
        int day;
        Scanner sc = new Scanner(System.in);

        System.out.print("Hangi ayda dogdunuz?");
        ay = sc.nextLine();
        System.out.print("Hangi gun dogdunuz?");
        day = sc.nextInt();

        if (ay.equals("OCAK") && day >= 1 && day <= 21) {
            System.out.println("Burcunuz Oglak");
        } else if (ay.equals("OCAK") && day >= 22 && day <= 31) {
            System.out.println("Burcunuz Kova");
        }
        if (ay.equals("SUBAT") && day >= 1 && day <= 19) {
            System.out.println("Burcunuz Kova");
        } else if (ay.equals("SUBAT") && day >= 20 && day <= 29) {
            System.out.println("Burcunuz Balik");
        }
        if (ay.equals("MART") && day >= 1 && day <= 20) {
            System.out.println("Burcunuz Balik");
        } else if (ay.equals("MART") && day >= 21 && day <= 30) {
            System.out.println("Burcunuz Koc");
        }
        if (ay.equals("NİSAN") && day >= 1 && day <= 20) {
            System.out.println("Burcunuz Koc");
        } else if (ay.equals("NİSAN") && day >= 21 && day <= 30) {
            System.out.println("Burcunuz Boga");
        }
        if (ay.equals("MAYIS") && day >= 1 && day <= 21) {
            System.out.println("Burcunuz Boga");
        } else if (ay.equals("MAYIS") && day >= 22 && day <= 30) {
            System.out.println("Burcunuz Ikizler");
        }
        if (ay.equals("HAZIRAN") && day >= 1 && day <= 22) {
            System.out.println("Burcunuz Ikizler");
        } else if (ay.equals("HAZIRAN") && day >= 23 && day <= 30) {
            System.out.println("Burcunuz Yengec");
        }
        if (ay.equals("TEMMUZ") && day >= 1 && day <= 22) {
            System.out.println("Burcunuz Yengec");
        } else if (ay.equals("TEMMUZ") && day >= 23 && day <= 30) {
            System.out.println("Burcunuz Aslan");
        }
        if (ay.equals("AGUSTOS") && day >= 1 && day <= 22) {
            System.out.println("Burcunuz Aslan");
        } else if (ay.equals("AGUSTOS") && day >= 23 && day <= 30) {
            System.out.println("Burcunuz Basak");
        }
        if (ay.equals("EYLUL") && day >= 1 && day <= 22) {
            System.out.println("Burcunuz Basak");
        } else if (ay.equals("EYLUL") && day >= 23 && day <= 30) {
            System.out.println("Burcunuz Terazi");
        }
        if (ay.equals("EKIM") && day >= 1 && day <= 22) {
            System.out.println("Burcunuz Terazi");
        } else if (ay.equals("EKIM") && day >= 23 && day <= 30) {
            System.out.println("Burcunuz Akrep");
        }
        if (ay.equals("KASIM") && day >= 1 && day <= 21) {
            System.out.println("Burcunuz Akrep");
        } else if (ay.equals("KASIM") && day >= 22 && day <= 30) {
            System.out.println("Burcunuz Yay");
        }
        if (ay.equals("ARALIK") && day >= 1 && day <= 21) {
            System.out.println("Burcunuz Yay");
        } else if (ay.equals("ARALIK") && day >= 22 && day <= 30) {
            System.out.println("Burcunuz Oglak");
        }

    }
}
