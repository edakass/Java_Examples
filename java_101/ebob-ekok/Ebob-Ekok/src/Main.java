import java.util.Scanner;

public class Main {
    /*
    EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
    EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
    EKOK = (n1*n2) / EBOB
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 sayıyı giriniz : ");
        int n1 = sc.nextInt();

        System.out.print("n2 sayıyı giriniz : ");
        int n2 = sc.nextInt();
        
        int ebob =1;
        int ekok = 1;
        int i=1;
        //ebob için
        while (i <= n1){
            if (n1 %i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }

        ekok = (n1 * n2 ) / ebob;

        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);

    }
}
/*
int ebob = 1;
        // ebob en buyuk sayı
        for (int i = n1 ; i >= 1; i--){
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
                break;
            }
        }
        //ekok , en kucuk katı
        for (int i = 1; i <= (n1 * n2); i++){
            if(i % n1 == 0 && i % n2 == 0){
                System.out.println(i);
                break;
            }
        }
        System.out.println("Ekok " + ((n1*n2) / ebob));
 */