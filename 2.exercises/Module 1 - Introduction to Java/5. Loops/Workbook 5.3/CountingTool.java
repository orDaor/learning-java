import java.util.Locale;
import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        // See Learn the Part for the instructions.
        System.out.print("Choose a number to count to: ");
        int maxCount = scan.nextInt();

        for (int i = 0; i <= maxCount; i++) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}
