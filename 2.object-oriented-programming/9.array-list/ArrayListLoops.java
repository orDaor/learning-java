import java.util.ArrayList;
import java.util.List;

public class ArrayListLoops {

    public static void main(String[] args) {

        // create new (empty) array list of strings
        List<Integer> numbers = new ArrayList<>();

        // add elements
        numbers.add(4);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        // print list in a row
        printList(numbers);

        // standard FOR loop
        System.out.print("FOR loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(
                    "Element in pos " + i + " : " + numbers.get(i));
        }

        // FOR EACH
        System.out.println("\nFOR EACH loop");
        for (Integer n : numbers) {
            System.out.println(n);
        }
    }

    // print list in a row
    public static void printList(List<Integer> items) {
        System.out.println(
                "List of " + items.size() + " items: " +
                        items.toString() + "\n");
    }

}
