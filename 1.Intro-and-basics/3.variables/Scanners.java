//import Scanner from "java.util" package
import java.util.Locale;
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        //questions counter
        int questionsCounter = 0;
        
        //Scanner object contains methods which allow to get user inputs
        //NOTE: this scanner receives input from the system (System.in)
        Scanner scan = new Scanner(System.in);
        
        //this tells the scanner to user English locale, so that
        //it the method nextDouble() does not crash with decimal "." notation
        scan.useLocale(Locale.ENGLISH); 

        //STRING INPUT
        //nextLine() waits for user to enter a String value and to type enter. Then checks if this input
        //is actually a string value, and if ok, it assigns the String value to userName String variable
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        questionsCounter++;

        System.out.println("\nHow much money do you spend on coffee?");
        Double coffeExpanse = scan.nextDouble();
        questionsCounter++;

        System.out.println("\nHow much money do you spend on fastfood?");
        double fastFoodExpanse = scan.nextDouble();
        questionsCounter++;

        System.out.println("\nHow old are you?");
        int userAge = scan.nextInt();
        questionsCounter++;

        //output user inputs
        System.out.println("\nThank you for answearing all " + questionsCounter + " questions!");

        System.out.println("\nuserName: " + userName);
        System.out.println("coffeExpanse: " + coffeExpanse);
        System.out.println("fastFoodExpanse: " + fastFoodExpanse);
        System.out.println("userAge: " + userAge);

        //close scanner process, to avoid memory leak
        scan.close();

    }
}
