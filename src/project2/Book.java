package project2;

public class Book {

    private String title;
    private int pages;

    public Book(String title, int pages) {
        if (title == null || title.isEmpty()) {
            throw new RuntimeException();
        }
        this.title = title;
        if (pages <= 0) {
            throw new RuntimeException();
        }
        this.pages = pages;
    }

    public void print() {
        System.out.println(title + " " + pages);
    }
}
