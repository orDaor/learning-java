public class SwitchStatements {
    public static void main(String[] args) {

        char letter = 'J';

        switch (letter) {
            case 'A':
                System.out.println("Selected letter is: A");
                break;

            case 'B':
                System.out.println("Selected letter is: B");
                break;

            case 'C':
                System.out.println("Selected letter is: C");
                break;

            default:
                System.out.println("Selected letter is: undefined");
        }

        System.out.println("Verification finished!");

    }
}
