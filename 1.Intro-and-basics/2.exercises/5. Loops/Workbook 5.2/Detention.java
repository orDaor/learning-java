import java.util.Locale;
import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        //config. scanner
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        // See Learn the Part for the instructions.

        String sentenceInput = scan.nextLine();

        for (int i = 1; i <= 10; i++) {
            String sentenceOutput = i + ". " +  sentenceInput;
            System.out.println(sentenceOutput);
        }

        //close scanner
        scan.close();
    }
}
