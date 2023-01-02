import java.util.Random;
import java.util.Locale;
import java.util.Scanner;

/**
 * DiceGame
 */
public class DiceGame {

    public static void main(String[] args) {
        // configure scanner
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        // user enters/selects 3 numbers
        System.out.println("Please enter 3 numbers:");
        int firstSelectedNumber = scan.nextInt();
        int secondSelectedNumber = scan.nextInt();
        int thirdSelectedNumber = scan.nextInt();

        // check user input
        checkUserInput(firstSelectedNumber, secondSelectedNumber, thirdSelectedNumber);

        // close scanner
        scan.close();

        // sum of selected numbers
        int sumOfSelectedNumbers = firstSelectedNumber + secondSelectedNumber + thirdSelectedNumber;

        // roll the dice 3 times
        int firstDiceRoll = rollTheDice();
        int secondDiceRoll = rollTheDice();
        int thirdDiceRoll = rollTheDice();

        System.out.println("\nDice rolled 3 times:");
        System.out.println(firstDiceRoll);
        System.out.println(secondDiceRoll);
        System.out.println(thirdDiceRoll);

        // sum or dice rolls
        int sumOfDiceRolls = firstDiceRoll + secondDiceRoll + thirdDiceRoll;

        // check winner case
        boolean isWinner = isWinner(sumOfSelectedNumbers, sumOfDiceRolls);

        // print game over status
        printGameOverStatus(isWinner, sumOfSelectedNumbers, sumOfDiceRolls);
    }

    // generate random int between 1 and 6
    public static int rollTheDice() {
        // random generator
        Random randomGenerator = new Random();

        // generate rand in (1,6)
        int randomInt = randomGenerator.nextInt(6) + 1;
        return randomInt;
    }

    // get sum of 3 happened dice rolls
    public static boolean isWinner(int sumOfSelectedNumbers, int sumOfDiceRolls) {
        // winner condition 1
        boolean winnerCondition1 = sumOfDiceRolls < sumOfSelectedNumbers;

        // winner condition 2
        boolean winnerCondition2 = (sumOfSelectedNumbers - sumOfDiceRolls) < 3;

        // check whether is winner
        return winnerCondition1 && winnerCondition2;
    }

    // print game over status
    public static void printGameOverStatus(boolean isWinner, int sumOfSelectedNumbers, int sumOfDiceRolls) {
        // is winner?
        if (isWinner) {
            System.out.println("\nYou WON!");
        } else {
            System.out.println("\nYou LOST!");
        }

        // status
        System.out.println("sumOfSelectedNumbers: " + sumOfSelectedNumbers);
        System.out.println("sumOfDiceRolls: " + sumOfDiceRolls);
    }

    // user inputs must be = (1,6)
    public static void checkUserInput(int firstSelectedNumber, int secondSelectedNumber, int thirdSelectedNumber) {
        //check selected numbers range
        boolean inputOk = 
            firstSelectedNumber >= 1 && firstSelectedNumber <= 6 &&
            secondSelectedNumber >= 1 && secondSelectedNumber <= 6 &&
            thirdSelectedNumber >= 1 && thirdSelectedNumber <= 6;

        if (!inputOk) {
            System.out.println("Numbers should be in the range (1,6)");
            System.exit(0); //temrinate application
        }
    }
}
