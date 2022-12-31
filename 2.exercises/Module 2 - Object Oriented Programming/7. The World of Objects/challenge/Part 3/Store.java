public class Store {
    // properties
    Movie[] moviesList;

    // constructor
    public Store() {
        this.moviesList = new Movie[10];
    }

    // get a movie from the store
    public Movie getMovie(int index) {
        for (int i = 0; i < this.moviesList.length; i++) {
            if (i == index) {
                return new Movie(this.moviesList[i]);
            }
        }
        // index not found
        return null;
    }

    // store a movie in the store
    public void setMovie(int index, Movie movie) {
        for (int i = 0; i < this.moviesList.length; i++) {
            if (i == index) {
                this.moviesList[i] = new Movie(movie);
            }
        }
    }

    // to string
    public String toString() {
        String temp = "";
        for (Movie m : this.moviesList) {
            if (m != null) {
                temp += m.toString();
            } else {
                temp += "null" + "\n";
            }
        }
        return temp;
    }
}
