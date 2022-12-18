public class Grocer {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (Workbook 6.3).

        String[] products = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };

        String item = "candy";

        System.out.println("\nDo you sell " + item);

        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(item)) {
                System.out.println("\nWe have that in aisle: " + i);
            }
        }

    }
}
