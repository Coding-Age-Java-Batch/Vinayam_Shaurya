class LibraryBook {

    String title;
    String author;
    boolean isAvailable;

    // Set book details
    public void setDetails(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Borrow book
    public void borrowBook() {
        if(isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Return book
    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }

    // Display status
    public void displayStatus() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }
}

public class LibraryBookDemo {

    public static void main(String[] args) {

        LibraryBook book = new LibraryBook();

        // Set details
        book.setDetails("Java Basics", "James Gosling");

        // Display initial status
        book.displayStatus();

        // Borrow book
        book.borrowBook();
        book.displayStatus();

        // Return book
        book.returnBook();
        book.displayStatus();
    }
}