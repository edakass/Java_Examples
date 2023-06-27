public class Main {
    // Araba moturu örneği,araba motorunu araba classının içerisine yazabiliriz
    public static void main(String[] args) {
        // Nested Class (İç içe Sınıflar)
        // -Inner Class (İç Sınıflar)
        //   - static
        //   - non-static
        // -Local Class (Yerel Sınıflar)
        // -Anonymus Class (Anonim Sınıflar)

        // non-static
       /* Out o = new Out();
        o.run(); */
       /*  Out o = new Out();
        System.out.println("-----------");
        Out.In in = o.new In();
        in.run(); */
      /*  Out o = new Out();
        Out.In inNesnesi = o.new In();
        inNesnesi.run(); */
      /*  Out o = new Out();
        Out.In inNesnesi = o.getIn();
        inNesnesi.run();*/

        // static
      //  Out.In.run();

        // Local Class
      /*  Local l = new Local();
        l.run(); */

        // -Anonymus Class (Anonim Sınıflar) (sadece o nesneye ait metot ve değişkenler oluşturulabilinir)
        Anonim a = new Anonim() { //sadece bu nesneye özel yapılmış demek,burası çalışıypr Anonim sınıfındakı run metodunun içi değil
            public int a = 20;
            @Override
            public void run() {
                System.out.println(this.a);
                System.out.println("Anonim olarak yazılmış run metodu");
                print(); //eğer ki print i yazdırmak istersen şu şekilde kullanabilriz
            }


            public void print() { // bunu yazamayız
                System.out.println("Pirnt metodu");
            }

        };
        a.run();
       // a.print(); a sınıfında üretilmiş bir print metodu yok diyor
        //nesne üzerinden print metodunu yazamayız

    }
}