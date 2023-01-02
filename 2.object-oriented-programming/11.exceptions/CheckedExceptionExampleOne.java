import java.io.FileInputStream;
import java.util.Scanner;

// COMPILE-TIME EXCEPTIONS = checked (by the compiler) exceptions

public class CheckedExceptionExampleOne {
    public static void main(String[] args) {
        try {
            // this object represents a connection to the specified file
            // in the project foler, allowing to read/write from it
            FileInputStream fis = new FileInputStream("greetingsE.txt");

            // read from the file?
            Scanner scanner = new Scanner(fis);

            //read first line of file?
            System.out.println(scanner.nextLine());
            System.out.println(scanner.nextLine());

            //close scanner
            scanner.close();
        } catch (Exception exception) {
            System.out.println("An error occured:");
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("This runs no matter what");
        }

        // NOTE: if we do NOT wrap the FileInputStream() code inside a TRY block, we'll get compilation
        // error, because the compiler know this code can generate an exception (if the file
        // does not exist for example), and it wanst us to handle it

        //NOTE: the compiler know this because FileInputStream() is defined as a method that can throw an exception
    }

}