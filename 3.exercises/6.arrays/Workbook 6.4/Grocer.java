import java.util.Locale;
import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (Workbook 6.4).

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        String[] store = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");

        String product = scan.nextLine();

        for (int i = 0; i < store.length; i++) {
            if (store[i].equals(product)) {
                System.out.println("\nWe have that in aisle: " + i);
            }

        }

        scan.close();

        // Compare your result to what's on Learn the Part.

    }
}
