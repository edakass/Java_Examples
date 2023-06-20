import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*
    * A program in Java that finds whether the word entered by the user is "palindromic".
    * If the reverse reading of a word gives the same word, that word is "Palindromic Word".
    * Example: abba , asa , kavak, kayak
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your words : ");
        String polWord = sc.nextLine().toLowerCase();
        System.out.println(polWord);

        StringBuilder rev = new StringBuilder();
        rev.append(polWord);
        String result = rev.reverse().toString().toLowerCase();

        if (polWord.equals(result)) {
            System.out.println("This is Palindrom " + result);
        } else {
            System.out.println("This is not Palindrom");
        }
    }
}