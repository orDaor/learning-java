import java.util.Scanner;
import java.util.Locale;

public class GuessGame {
    public static void main(String[] args) {
        // config scanner
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int computerNumber = getRandomIntInTheRange(1,5);
        int userNumber = scan.nextInt();

        //check if number matches
        while (computerNumber != userNumber) {
            System.out.print("Guess again: ");
            userNumber = scan.nextInt();
        }

        //number was guessed
        System.out.println("You got it! My number was " + computerNumber);

        // close scanner
        scan.close();
    }

    public static int getRandomIntInTheRange(int min, int max) { 
        return (int)(Math.random() * (max + 1 - min) + min);
    };

}
