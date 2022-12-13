//Scope of a variable can be at the level of a class, or at the level of a function
public class VariablesScope {

    static int variablesNumber = 1; //scope at class level

    public static void main(String[] args) {
        System.out.println(variablesNumber);
        printVariablesNumber();

    }

    public static void printVariablesNumber() {
        System.out.print(variablesNumber);
    }
}
