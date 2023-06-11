import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myList = {1996, 1999, 243, 8, 12, 11, 6, 78, 20};
        Arrays.sort(myList);
        System.out.println("List : " + Arrays.toString(myList));

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int number = sc.nextInt();

        int min = 0;
        int max = 0;

        for(int i = 0; i < myList.length; i++ ) {
            if(number < myList[i]) {
                max = myList[i];
                min = myList[i-1];
                break;
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
