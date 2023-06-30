import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    // Bizler özel bir sıra belirtmek isterken TreeSet kullanılıyor
    public static void main(String[] args) {
        //Burası sayfa sayısına göre idi
      //  TreeSet<Book> books = new TreeSet<>(new OrderPageNumberComparator()); //.reversed() tam tersi sıralama

        //karakter karşılaştırma için
      //  TreeSet<Book> books = new TreeSet<>(new OrderNameComparator());
      /*  TreeSet<Book> books = new TreeSet<>();

        books.add(new Book(1,"The Sorrows of Young Werther","Goethe",98));
        books.add(new Book(2,"The Art of Loving","Erich Fromm",133));
        books.add(new Book(3,"War and Peace","Tolstoy",1225));
        books.add(new Book(4,"Hello World","Hannah Fry",256));
        books.add(new Book(5,"The Vegetarian","Han Kang",160));

        System.out.println("-- Sort by letter --- ");
        for (Book book : books) {
            System.out.println(book.getBookName() + " " + book.getPageNumber());
        }*/

        Book book1 = new Book(1,"The Sorrows of Young Werther","Goethe",98);
        Book book2 = new Book(2,"The Art of Loving","Erich Fromm",133);
        Book book3 = new Book(3,"War and Peace","Tolstoy",1225);
        Book book4 = new Book(4,"Hello World","Hannah Fry",256);
        Book book5 = new Book(5,"The Vegetarian","Han Kang",160);

        Set<Book> bookSetName = new TreeSet<>();
        bookSetName.add(book1);
        bookSetName.add(book2);
        bookSetName.add(book3);
        bookSetName.add(book4);
        bookSetName.add(book5);

        System.out.println("-- Sort by letter --- ");
        for (Book book : bookSetName) {
            System.out.println(book.getBookName());
        }

        System.out.println("-- Sort by page --- ");
        Set<Book> bookSetByPageNumber = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        bookSetByPageNumber.add(book1);
        bookSetByPageNumber.add(book2);
        bookSetByPageNumber.add(book3);
        bookSetByPageNumber.add(book4);
        bookSetByPageNumber.add(book5);

        for (Book book : bookSetByPageNumber) {
            System.out.println(book.getBookName() + " --> " +book.getPageNumber());
        }

    }
}