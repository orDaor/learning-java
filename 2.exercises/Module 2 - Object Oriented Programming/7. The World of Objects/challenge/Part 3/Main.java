import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String[] args) {
        Movie[] movies = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        for (int i = 0; i < movies.length; i++) {
            store.setMovie(i, movies[i]);
        }

        printStore();
        userInput();
        
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        String status = "continue";
        while (status.equals("continue")) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            int userIntegerInput = scanner.nextInt();
            //index out of range, choose another one
            if (userIntegerInput < 0 || userIntegerInput > 9) {
                continue;
            }
            //index ok, get movie with this index
            Movie selectedMovie = store.moviesList[userIntegerInput];
            
            //ask user to set the rating for this movei
            System.out.print("Set a new rating for " + selectedMovie.getName() + ": ");
            double userRatingInput = scanner.nextDouble();

            //update rating of the selected movie
            selectedMovie.setRating(userRatingInput);

            //print the updated movie list in the store
            printStore();

            //Want to change another rating
            System.out.print("To change another rating type 'continue' + enter:");
            status = scanner.next();
        }
        scanner.close();
    }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

}