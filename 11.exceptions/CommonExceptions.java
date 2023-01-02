import java.util.Locale;
import java.util.Scanner;

public class CommonExceptions {
    public static void main(String[] args) {

        // **************ArrayIndexOutOfBounds**************//
        int[] grades = new int[] { 96, 65, 56, 86 };
        // System.out.println(grades[4]); //out of bound exception
        System.out.println(grades[3] + "\n");

        // **************NullPointerException**************//
        String[] names = new String[7];
        names[0] = "John";
        names[1] = "Jim";
        names[2] = "Joe";

        for (String name : names) {
            // check needed to avoid calling toUpperCase() on a null variable, which
            // would throw a runtime exception
            if (name != null) {
                System.out.println(name.toUpperCase());
            }
        }

        // **************InputMismatchException**************//
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int userInput = 0;
        String trashUserInput = "";

        // check what user entered, in order to prevent nextInt() to throw a rauntime exception
        // in case user enters something different than an integer
        System.out.print("Please enter a random integer: ");
        if (scanner.hasNextInt()) {
            userInput = scanner.nextInt();
            System.out.println("You entered " + userInput + "!");
        } else {
            trashUserInput = scanner.next();
            System.out.println("Entered wrong value: " + trashUserInput);
        }

        // close scanner
        scanner.close();

    }
}