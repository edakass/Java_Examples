import java.util.Scanner;

public class Main {
    /*
    Armstrong sayı örneği
    N haneli bir sayının  basamaklarının n'nci üstlerinin toplamı,sayının kendisine eşitse,böyle
     sayılara armstrong sayılar denir. */
    /*
     Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int number = sc.nextInt();
        System.out.println(number);
     */
    public static void main(String[] args) {
     //   int a = 245167 , numberOfDigits = 0, numberCounter=0;
        //Basamak sayısı bulma işlemi
     /*   while(a!=0){
            a = a / 10;
            numberCounter++;
           // System.out.println(a);
        }*/
       // System.out.println(numberCounter);

        // Bir sayının son basamağını bulma işlemi
        //2451 % 10 = 1  mod alma işlemi

        //Üst alma işlemi
        int alt = 2 , üst=5;
        int result = 1;
        for(int i=1; i<=üst;i++){
            result *= alt;
        }
        System.out.println(result);
    }
}