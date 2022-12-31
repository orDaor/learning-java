public class Movie {
    // properties
    private String name;
    private String format;
    private double rating;

    // constructor
    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    // copy constructor
    public Movie(Movie movie) {
        this.name = movie.name;
        this.format = movie.format;
        this.rating = movie.rating;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMovie(String format) {
        this.format = format;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public String getFormat() {
        return this.format;
    }

    public double getRating() {
        return this.rating;
    }

    // to string
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "\n";
    }
}
