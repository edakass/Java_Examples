import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Harmonik ortalama
        double[] list = {1,2,3,4,5};
        double sum = 0.0;
        for(double item : list){
            sum += 1 / item;
        }
        System.out.print("Array : ");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("Harmonic Mean : " + list.length / sum);




       /* Dizisiz
        Scanner sc = new Scanner(System.in);
        System.out.println("N değerini giriniz : ");
        int n = sc.nextInt();
        // toplam olduğu için 0 dan başlatıyoruz eğer ki çarpım olsaydı 1 den başlatırdık
        double result = 0;
        // index değeri sıfırdan başlamadığı için = değerini koyduk
        for (double i = 1; i <= n;i++){
            result = result + (1.0 / i);
        }
        System.out.println(result);

        */

        /*
        // Dizideki elemanların ortalamsını bulan program
        int[] list = {1,2,3,4,5};
        double sum = 0.0;
        for(int i = 0; i < list.length; i++){
            sum += list[i];
        }

        double average = sum / list.length;
        System.out.println(average);*/

    }
}