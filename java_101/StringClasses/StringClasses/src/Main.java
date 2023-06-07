import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "edakas";
        System.out.println(str.charAt(2));
        System.out.println();
        // Belirtilen indisteki karakterin unicode nı verır
        char a = 98;
        System.out.println(a);
        System.out.println();

        //compareTo()
        String edakas = "edaKAs";
        System.out.println(str.compareTo(edakas));
        System.out.println();

        //buyuk kucuk harf duyarlılıgını kaldırmak ıcın ıse
        System.out.println(str.compareToIgnoreCase(edakas));
        System.out.println();

        // concat() bir string sonuna ekleme yapma ıcın
        System.out.println(str.concat(" with java"));

        //contains()
        System.out.println(str.contains("ka"));

        //indexOf()
        System.out.println(str.indexOf('e'));

        //isEmpty()
        System.out.println(str.isEmpty());
        /* null ıle empty arasınddakı fark şu şekılde
        Null demek su sekılde
        String str; yani bir değer tanımlanmamış olması demek
        String str = ""; ıse empty
         */

        //lastIndexOf()
        System.out.println(str.lastIndexOf("s"));

        //length()
        System.out.println(str.length());

        //replace()
        System.out.println(str.replace("a","b"));

        //replaceFirst()
        System.out.println(str.replaceFirst("a","b"));

        //replaceAll()
        System.out.println(str.replaceAll("a","b"));

        //split()
        String ek = "edakas99";
        String[] sp = ek.split("a");
        System.out.println(Arrays.toString(sp));

        //startsWıth()
        System.out.println(str.startsWith("ed"));

        //substring()
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,3));

        //tolOwerCase()
        String ek1 = "EDAKAS199";
        System.out.println(str.toLowerCase());

        //toUpprCase()
        String ek2 = "edakas199";
        System.out.println(str.toUpperCase());

        //trim() , en sagındakı ve en solundakı boslukları sılıyor
        String ek3 = "   edakas199  ";
        System.out.println(str.trim());

        //valueOf()
        
    }
}