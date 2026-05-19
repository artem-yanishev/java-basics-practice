package project2;

public class BookFactory {

    public static Book create(String title, int pages) {
        try {
            Book book = new Book(title, pages);
            return book;
        } catch (Exception e) {
            return null;
        }
    }
}
