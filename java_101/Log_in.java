package com.company;

import java.util.Scanner;

public class Log_in {

    public static void main(String[] args) {

        String userName,password,new_username,new_pass;

        Integer reset;

        Scanner sc=new Scanner(System.in);

        System.out.print("Please enter your username : ");
        userName=sc.nextLine();

        System.out.print("Please enter your password : ");
        password=sc.nextLine();

        if(userName.equals("edakas") && password.equals("123")){
            System.out.println("Welcome..");
        }else {
            System.out.println("Wrong..");
            System.out.print("Do you want to reset? for yes 1,for no 2 -->");
            reset=sc.nextInt();
            switch (reset){
                case  1:
                    System.out.println("You said yes! ");
                    System.out.print("Please enter your new username : ");
                    new_username=sc.nextLine();

                    System.out.print("Please enter your new password");
                    new_pass=sc.nextLine();

                    if (userName==new_username && password==new_pass){
                        System.out.println("can't be the same,please try again");
                    }else {
                        System.out.println("The new password has been created.");
                    }
                    break;
                case  2:
                    System.out.println("You said no! ");
                    break;

                default:
                    System.out.println("Please select your choice");
                    break;
            }
        }

    }
}
