import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci kaçıncı sayıya kadar devam etsin");
        int elemanSayisi = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        System.out.println(n1);
        System.out.println(n2);
        for (int i=1; i<=elemanSayisi; i++){
            //burada kaydırarak işlem yapıyor
            // 0 1 1 2 3 5 8 ...
            sum = n1 + n2; // sum = 0 + 1
            n1 = n2; // 0 = 1
            n2 = sum; // 1 = 1
            // böyle böyle adım adım işlem gerçekleştiriliyor
            System.out.println(sum);


        }
    }
}