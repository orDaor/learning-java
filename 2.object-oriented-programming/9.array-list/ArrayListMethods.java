import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class ArrayListMethods {

    public static void main(String[] args) {

        // create new (empty) array list of strings
        List<String> items = new ArrayList<>();

        // add elements
        items.add("PS5");
        items.add("Controller");
        items.add("TV");

        //print list in a row
        printList(items);

        //print item by item
        printItems(items);

        //set items
        System.out.println("Update items: ");

        items.set(0, "New PS5");
        items.set(1, "New Controller");
        items.set(2, "New TV");

        printList(items);

        //remove one item
        System.out.println("Remove item in position 1");

        items.remove(1);

        printList(items);

        //remove ALL items at once
        System.out.println("Remove all items at once:");

        items.clear();

        printList(items);

    }

    //print list in a row
    public static void printList(List<String> items) {
        System.out.println(
                "List of " + items.size() + " items: " +
                        items.toString() + "\n");
    }

    //print list, item by item
    public static void printItems(List<String> items) {
        String item_0 = items.get(0);
        String item_1 = items.get(1);
        String item_2 = items.get(2);

        System.out.println(
                "item_0 : " + item_0 + "\n" +
                        "item_1 : " + item_1 + "\n" +
                        "item_2 : " + item_2 + "\n");
    }
}