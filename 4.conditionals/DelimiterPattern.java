import java.util.Locale;
import java.util.Scanner;

/* 
 The delimiter separates the user inpu. By deafult the delimiter for
 user input is white space. It does not matter how many white spaces are between
 the inputs.
 NOTE: if we enter  new line it is still considered white space.
 For example nextInt() follows the delimiter pattern, because it skips the delimiter (white space)
 and and then picks up the input.
 NOTE: next() follows delimiter pattern, but nextLine() does NOT (it reads overall input line by line)
 */

public class DelimiterPattern {
    public static void main(String[] args) {

        //Configure scanner
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        //input integers
        System.out.println("Enter two INT values, both on the same line:");
        int integer1 = scan.nextInt();
        int integer2 = scan.nextInt();
        System.out.println("You entered: " + integer1 + ", " + integer2);

        //input Long integers
        System.out.println("\nEnter two LONG values, both on the same line:");
        long longInteger1 = scan.nextLong();
        long longInteger2 = scan.nextLong();
        System.out.println("You entered: " + longInteger1 + ", " + longInteger2);

        //input decimals
        System.out.println("\nEnter two DOUBLE values, both on the same line:");
        double double1 = scan.nextDouble();
        double double2 = scan.nextDouble();
        System.out.println("You entered: " + double1 + ", " + double2);

        //input text
        System.out.println("\nEnter two STRING values, both on the same line:");
        String string1 = scan.next();
        String string2 = scan.next();
        System.out.println("You entered: " + string1 + ", " + string2);

        //close scanner
        scan.close();

    }
}
