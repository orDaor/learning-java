import java.util.Random;

public class Doubles {
    public static void main(String[] args) {

        // roll 2 dices
        int dice1 = rollTheDice();
        int dice2 = rollTheDice();

        printDiceRolls(dice1, dice2);

        while (dice1 != dice2) {
            dice1 = rollTheDice();
            dice2 = rollTheDice();
            printDiceRolls(dice1, dice2);
        }

        System.out.println("\nYou rolled doubles!");
    }

    // generate random int between 1 and 6
    public static int rollTheDice() {
        // random generator
        Random randomGenerator = new Random();

        // generate rand in (1,6)
        int randomInt = randomGenerator.nextInt(6) + 1;
        return randomInt;
    }

    // print the dice rolls
    public static void printDiceRolls(int dice1, int dice2) {
        System.out.println("\nDice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
    }

}
