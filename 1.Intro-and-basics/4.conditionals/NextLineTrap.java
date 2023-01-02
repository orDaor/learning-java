import java.util.Locale;
import java.util.Scanner;

public class NextLineTrap {
    public static void main(String[] args) {
        
        //config scanner
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        //next line trap
        System.out.println("Enter a INT value:");
        int number = scan.nextInt();
        System.out.println("You entered: " + number);

        //next line trap
        System.out.println("\nEnter some text:");
        scan.nextLine();
        String text = scan.nextLine();
        System.out.println("You entered: " + text);

        //close scanner
        scan.close();

    }
}
