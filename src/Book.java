class Book {

    String title;
    String author;
    double price;

    // Constructor 1 → takes title, author, and price
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Constructor 2 → takes only title and author
    // Default price = 250
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 250;
    }

    // Method to print book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // Book without price
        Book b1 = new Book("Java Essentials", "John Doe");
        b1.displayDetails();

        System.out.println();

        // Book with price
        Book b2 = new Book("Python Basics", "Smith", 500);
        b2.displayDetails();
    }
}