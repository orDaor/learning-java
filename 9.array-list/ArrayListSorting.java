import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

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

        //sort items
        System.out.println("Sort items:");
        Collections.sort(numbers);

        printList(numbers);
    }

    // print list in a row
    public static void printList(List<Integer> items) {
        System.out.println(
                "List of " + items.size() + " items: " +
                        items.toString() + "\n");
    }

}
