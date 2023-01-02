import java.util.Locale;
import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        System.out.println("Welcome to Javagram! Sign in below\n");

        // enter username
        System.out.print("- Username: ");
        String enteredUsername = scan.nextLine();

        // enter password
        System.out.print("- Password: ");
        String enteredPassword = scan.nextLine();

        while (!username.equals(enteredUsername) ||
                !password.equals(enteredPassword)) {
            System.out.println("\nIncorrect credentials, please try again");

            // enter username
            System.out.print("- Username: ");
            enteredUsername = scan.nextLine();

            // enter password
            System.out.print("- Password: ");
            enteredPassword = scan.nextLine();
        }

        //credentials ok
        System.out.println("\nWelcome " + username + " !");

        // close scanner
        scan.close();

    }
}
