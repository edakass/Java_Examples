import java.util.Scanner;

public class Main {
    /*
    Armstrong sayı örneği
    N haneli bir sayının  basamaklarının n'nci üstlerinin toplamı,sayının kendisine eşitse,böyle
     sayılara armstrong sayılar denir. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("your input " + number);
            int temp = number;
            int mod = 0;
            int sum = 0;

            int count = 0;
            while (temp != 0) {
                temp = temp / 10;
                ++count;
            }
            for (int i = 0; i < count; i++) {
                mod = number % 10;
                number = number / 10;
                sum += mod;
            }
            System.out.println(sum);

        } else {
            System.out.println("This is not number");

        }
    }
}