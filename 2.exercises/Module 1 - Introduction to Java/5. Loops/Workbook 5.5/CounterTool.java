import java.util.Locale;
import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        // config. scanner
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        System.out.println("I hear you like to count by threes");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        // See detailed instructions on Learn the Part.
        System.out.print("\n1. Count from: ");
        int start = scan.nextInt();

        System.out.print("2. Count to: ");
        int end = scan.nextInt();

        System.out.print("3. Count step: ");
        int step = scan.nextInt();

        for ( int i = start; i <= end; i += step) {
            System.out.print(i + " ");
        }

        // close scanner
        scan.close();
    }
}
