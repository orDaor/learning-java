import java.util.Scanner;
import java.util.Locale;

public class Dealership {
    public static void main(String[] args) {
        
        //scanner
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        // buy or sell a cae
        System.out.println("Enter 'a' to buy a car, or 'b' to sell it:");
        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("\nYou chose option 'a'");
                break;

            case "b":
                System.out.println("You chose option 'b'");
                break;
        
            default:
                System.out.println("Invalid option");
                break;
        }

        //close scanner
        scan.close();
    }
}
