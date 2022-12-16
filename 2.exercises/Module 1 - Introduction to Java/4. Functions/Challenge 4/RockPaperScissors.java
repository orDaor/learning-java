import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // config. scanner
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        // wants to play the game?
        System.out.println("Let's play Rock Paper Scissors");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors\n");
        System.out.println("Are you ready? Write 'yes' if you are");

        // Task 1: See if the user wants to play.
        String response = scan.nextLine();

        /*
         * Task 2: Set up the game
         * 
         * 
         * • if the answer is yes:
         * – print: Great!
         * – print: rock - paper - scissors, shoot!
         * – pick up user's choice.
         * – get the computer choice (can only be done after task 3).
         * – get the result (can only be done after task 4)
         * – print everything (can only be done after task 5).
         * 
         * • else:
         * – print: Darn, some other time...!
         */
        // I don't want to play, stop game
        if (!response.equals("yes")) {
            System.out.println("Darn, some other time...!");
            System.exit(0);
        }

        // start game
        System.out.println("\nGreat!");
        System.out.println("rock - paper - scissors, shoot!");

        // user choise
        String userChoise = scan.nextLine();

        // computer choise
        String computerChoise = computerChoice();

        // if choises are not ok stop here
        if (!areChoisesOk(userChoise, computerChoise)) {
            System.out.println("\nAn error occured");
            System.out.println("userChoise: " + userChoise);
            System.out.println("computerChoise: " + computerChoise);
            System.exit(0);
        }

        // calculate game over result
        String result = result(userChoise, computerChoise);

        // print game over result
        printResult(userChoise, computerChoise, result);

        // close scanner
        scan.close();
    }

    // Task 3 – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and
     * scissors
     * 
     * @return a choice (String).
     * 
     *         Inside the function:
     *         1. Picks a random number between 0 and 2.
     *         2. if 0: returns the choice 'rock'
     *         if 1: returns the choice 'paper'
     *         if 2: returns the choice 'scissors'
     */

    public static String computerChoice() {
        // get random number in (0, 1, 2)
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(3);

        if (randomInt == 0) {
            return "rock";
        } else if (randomInt == 1) {
            return "paper";
        } else if (randomInt == 2) {
            return "scissors";
        } else {
            return "Error";
        }
    }

    // Task 4 – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     * 
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @return result (String)
     * 
     *         Inside the function:
     * 
     *         1. result is "You win!" if:
     *
     *         You: "rock" Computer: "scissors"
     *         You: "paper" Computer: "rock"
     *         You: "scissors" Computer: "paper"
     *
     *         2. result is "You lose" if:
     * 
     *         Computer: "rock" You: "scissors"
     *         Computer: "paper" You: "rock"
     *         Computer: "scissors" You: "paper"
     *
     *         3. Otherwise, the result is "You lose!":
     * 
     * 
     *         4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */

    public static String result(String userChoise, String computerChoice) {
        String result = "";

        // user winner cases
        boolean userIsWinnerCase_1 = userChoise.equals("rock") && computerChoice.equals("scissors");
        boolean userIsWinnerCase_2 = userChoise.equals("paper") && computerChoice.equals("rock");
        boolean userIsWinnerCase_3 = userChoise.equals("scissors") && computerChoice.equals("paper");

        // user winner cases
        boolean computerIsWinnerCase_1 = computerChoice.equals("rock") && userChoise.equals("scissors");
        boolean computerIsWinnerCase_2 = computerChoice.equals("paper") && userChoise.equals("rock");
        boolean computerIsWinnerCase_3 = computerChoice.equals("scissors") && userChoise.equals("paper");

        // draw cases
        boolean drawCase_1 = computerChoice.equals("rock") && userChoise.equals("rock");
        boolean drawCase_2 = computerChoice.equals("paper") && userChoise.equals("paper");
        boolean drawCase_3 = computerChoice.equals("scissors") && userChoise.equals("scissors");

        if (userIsWinnerCase_1 || userIsWinnerCase_2 || userIsWinnerCase_3) {
            // user wins
            result = "You Win!";

        } else if (computerIsWinnerCase_1 || computerIsWinnerCase_2 || computerIsWinnerCase_3) {
            // computer wins
            result = "You lose!";
        } else if (drawCase_1 || drawCase_2 || drawCase_3) {
            // draw
            result = "It's a draw";
        } else {
            // error
            result = "Error";
        }
        return result;
    }

    // Task 5 – Write a function that prints your choice, the computer's, and the
    // result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice,
     * result)
     * 
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @param result         (String)
     * 
     *                       Inside the function:
     * 
     *                       1. prints everything:
     *                       – prints: You chose: <your choice>
     *                       – prints: The computer chose: <computer choice>
     *                       – prints: <result>
     */

    public static void printResult(String userChoise, String computerChoice, String result) {
        System.out.println("\nYou chose: " + userChoise);
        System.out.println("Computer chose: " + computerChoice);
        System.out.println(result);
    }

    // optional: check user anc computer choises
    public static boolean areChoisesOk(String userChoise, String computerChoise) {
        // user input is ok
        boolean userChoiseOk = (userChoise.equals("rock")) ||
                (userChoise.equals("scissors")) ||
                (userChoise.equals("paper"));

        boolean computerChoiseOk = (computerChoise.equals("rock")) ||
                (computerChoise.equals("scissors")) ||
                (computerChoise.equals("paper"));

        // System.out.println("\nuserChoiseOk: " + userChoiseOk);
        // System.out.println("computerChoiseOk: " + computerChoiseOk);

        if (userChoiseOk && computerChoiseOk) {
            return true;
        } else {
            return false;
        }
    }
}
