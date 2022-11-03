package com.company;

public class Main {

    public static void main(String[] args) {
        int sayac = 0; //sayacımızı yazdırdık
        for (int sayi = 2; sayi <= 100; sayi++) { //2 den başlayıp 100 2e kadar olan sayıları arttırıyoruz.
            int kontrol = 0; // kontrole 0 dedik eğer ki 1 olursa asal sayı  olmadığı anlamına geliyor
            for (int i = 2; i < sayi; i++) { //burada ise diyelim 7,7 ye kadar olan sayıları alacak teker teker
                if (sayi % i == 0) { // eğer ki 7  i = 3,4,5,6 bölünüm değerleri 0 gelirse ifin içine giremediği için
                    //aşağıdaki ifle kontrol ediliyor,ve asal olduğu anlaşılıp yazdırılıyor
                    kontrol = 1;
                    break;
                }
            }

            if (kontrol == 0) {
                System.out.print(sayi + " ");
                sayac++;
            }
        }
    }
}
