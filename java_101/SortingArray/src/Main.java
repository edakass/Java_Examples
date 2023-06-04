import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter array size : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++){ //dizinin boyutu kadar
            System.out.print( (i + 1) + ".element of array  : "  );
            array[i] = sc.nextInt();
        }
        System.out.println("Array : " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorting : "+ Arrays.toString(array));


    }
}
/*
Yapılacaklar

- Dışarıdan sayı almak
- Dİzi oluşturmak
- For ile dizinin boyutu kadar dönmek
 */