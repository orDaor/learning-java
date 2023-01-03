import java.util.Locale;
import java.util.Scanner;

public class ArgumentValidation {

    public static void main(String[] args) {

        // config scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        User user = new User();
        System.out.println("We are setting up your user account.");

        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
        while (true) {
            try {
                user.setUsername(scanner.nextLine());
                break;
            } catch (IllegalArgumentException ex) {
                System.out.print(ex.getMessage() + ". Pleas enter your username again: ");
            }
        }

        System.out.print("\nYour age is currently " + user.getAge() + ". Please update it here: ");
        while (true) {
            try {
                user.setAge(scanner.nextInt());
                break;
            } catch (Exception ex) {
                String exMessage = ex.getMessage();
                if (exMessage == null) {
                    exMessage = "";
                } else {
                    exMessage +=  ". ";
                }
                System.out.print(exMessage + "Pleas enter your age again again: ");
                scanner.nextLine();
            }
        }

        // print account confirmation data
        System.out.println(
                "\nYour account was created successfully:" + "\n" +
                        "\t" + "Username: " + user.getUsername() + "\n" +
                        "\t" + "Age: " + user.getAge());

        // close scanner
        scanner.close();
    }
}