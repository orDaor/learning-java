import java.io.FileInputStream;
import java.util.Scanner;

// COMPILE-TIME EXCEPTIONS = checked (by the compiler) exceptions

public class CheckedExceptionExampleTwo {
    public static void main(String[] args) {
        try {
            readFile("greetings.txt");
        } catch (Exception exception) {
            System.out.println("An error occured:");
            System.out.println(exception.getMessage());
        }
    }

    //NOTE: we declare that this method might throw and exception
    //      BECAUSE FileInputStream() might throw it. Than we wrap the readfFile() call inside a TRY block
    //NOTE: another way is to wrap the FileInputStream() call inside a TRY block
    public static void readFile(String fileName) throws Exception {
        FileInputStream fis = new FileInputStream(fileName + "ops");
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine()); // read 1st line
        System.out.println(scanner.nextLine()); // read 2nd line
        scanner.close();

    }
}