// Base class
class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showDetails() {
        System.out.println("Title: " + title + " Author: " + author);
    }
}

// Derived class
class LibraryBook extends Book {

    int shelfNumber;

    LibraryBook(String title, String author, int shelfNumber) {
        super(title, author);
        this.shelfNumber = shelfNumber;
    }

    @Override
    void showDetails() {
        System.out.println("Title: " + title +
                " Author: " + author +
                " Shelf Number: " + shelfNumber);
    }
}

// Main class
public class LibraryBookTest {

    public static void main(String[] args) {

        LibraryBook lb = new LibraryBook("Java Basics", "John Smith", 5);
        lb.showDetails();
    }
}