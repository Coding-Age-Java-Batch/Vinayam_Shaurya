class Book {

    // Private fields
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private boolean isAvailable;

    // Constructor
    Book(String title, String author, String isbn, int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.isAvailable = true; // Book starts as available
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Borrow book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed!");
        }
    }

    // Return book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not borrowed!");
        }
    }

    // Book Info
    public String getBookInfo() {
        return "Title: " + title +
                ", Author: " + author +
                ", ISBN: " + isbn +
                ", Pages: " + pages +
                ", Available: " + isAvailable;
    }
}

// Main class
public class BookTest {

    public static void main(String[] args) {

        Book b = new Book("Java Basics", "John Doe", "12345", 300);

        System.out.println(b.getBookInfo());

        b.borrowBook();
        b.borrowBook(); // Should fail

        b.returnBook();

        System.out.println(b.getBookInfo());
    }
}