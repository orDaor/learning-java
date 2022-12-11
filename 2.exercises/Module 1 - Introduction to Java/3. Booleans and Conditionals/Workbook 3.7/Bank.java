import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");

        // Task 1 - Pick up the user's decision.
        String response = scan.nextLine();

        if (response.equals("yes")) {
            // Task 2 - Print this if the decision is "yes"
            System.out.println("\nGreat! In one line" +
                    "\nHow much money do you have in your savings?" +
                    "\nAnd, how much do you owe in credit card debt?");

            // Task 3 - Pick up each value
            double savings = scan.nextDouble();
            double debt = scan.nextDouble();

            // Task 4 - Pick up number of years
            System.out.println("\nHow many years have you worked for?");
            int workYears = scan.nextInt();

            // Task 5 - Pick up the user's name
            System.out.println("\nWhat is your name?");
            scan.nextLine();
            String name = scan.nextLine();

            // Task 6 - Approve the mortgage if they meet the requirements (see article)
            // - Otherwise, don't give them a mortgage.
            boolean permitMortgage = savings >= 10000 && debt < 5000 && workYears > 2;
            if (permitMortgage) {
                System.out.println("\nCongratulations " + name + ". You have been approved!");
            } else {
                System.out.println("\nSorry, you are not eligible for a mortgage.");
            }

        } else {
            // Task 2 - Print this if the decision was not "yes"
            System.out.println("\nOK. Have a nice day!");
        }

        scan.close();
    }
}
