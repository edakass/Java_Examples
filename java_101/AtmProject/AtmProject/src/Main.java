import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3; // deneme hakkı
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.println("User name : ");
            userName = input.nextLine();
            System.out.println("Password : ");
            password = input.nextLine();

            if(userName.equals("edakas") && password.equals("123")){
                System.out.println("Hello, welcome to the Eda Bank !");
                do{
                    System.out.println("1-Deposit\n" +
                            "2-Withdrawal\n" +
                            "3-Question Balance\n" +
                            "4-Check Out");
                    System.out.println("Please select the action you want to do : ");
                    select = input.nextInt();
                    switch (select){
                        case 1 :
                            System.out.println("Amount of money");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Amount of money");
                            int price_ = input.nextInt();
                            if(price_ > balance){
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price_;
                            }
                            break;
                        case 3 :
                            System.out.println("Your balance : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("See you again.");
                break;
            }else {
                right--;
                System.out.println("Wrong username or password. Try again. Please");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                }else {
                    System.out.println("Your Remaining Rights: " + right);
                }
            }
        }
    }
}