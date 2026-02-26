class Movie {

    private String title;
    private String director;
    private int year;
    private double rating;
    private boolean isRented;

    // Constructor
    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        setRating(rating);
        this.isRented = false;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    // Rent movie
    public void rentMovie() {
        if (!isRented) {
            isRented = true;
            System.out.println("Movie rented successfully.");
        } else {
            System.out.println("Movie is already rented!");
        }
    }

    // Return movie
    public void returnMovie() {
        if (isRented) {
            isRented = false;
            System.out.println("Movie returned successfully.");
        } else {
            System.out.println("Movie was not rented!");
        }
    }

    // Set rating
    public void setRating(double rating) {
        if (rating >= 1.0 && rating <= 10.0) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating! Must be between 1.0 and 10.0");
        }
    }

    // Movie status
    public String getMovieStatus() {
        return isRented ? "Rented" : "Available";
    }
}

// Main class
public class MovieTest {

    public static void main(String[] args) {

        Movie m = new Movie("Inception", "Christopher Nolan", 2010, 9.0);

        m.rentMovie();
        m.rentMovie(); // Should fail

        m.returnMovie();

        m.setRating(8.5);

        System.out.println("Movie Status: " + m.getMovieStatus());
        System.out.println("Updated Rating: " + m.getRating());
    }
}