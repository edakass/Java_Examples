public class Book implements Comparable<Book>{
    private int id;
    private String bookName;
    private String authorName;
    private int pageNumber;

    @Override  //isme göre sıralama için
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.getBookName());
    }

 /*   @Override  //isme göre sıralama için
    public int compareTo(Book o) {
        return this.getPageNumber() - o.getPageNumber();
    }*/
    public Book(int id, String bookName, String authorName, int pageNumber) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
