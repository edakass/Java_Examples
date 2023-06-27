// Outer Class
public class Out {
    public int a = 5;
    public static int b = 20;

    // Inner Class
    public static class In {
        public static int a = 10;

        public static void run() {
            System.out.println("In sınıfına ait metod çalıştı");
            int a = 1;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Out.b);
           // System.out.println(this.a); // this.a derken denilmenek istenen bu sınıfa aiti getir yani 10 u getirir
           // System.out.println(Out.this.a);
           // System.out.println("Recursive alttaki");
           // Out.this.run();
        }
    }

    public void run() {
      //  In in = new In();
        //in.run(); static tanımladıgımız ıcın nesne uretmeye gerek kalmıyor
        In.run();

    }
    /* non static için örnekti
    public In getIn() {
       // In in = new In();
       // return in;
        return new In();
    }*/
}
