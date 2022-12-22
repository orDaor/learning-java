/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        // new car object
        Car Nissan = new Car();

        // initialized with null/zero values
        System.out.println("Nissan.make: " + Nissan.make);
        System.out.println("Nissan.price: " + Nissan.price);
        System.out.println("Nissan.year: " + Nissan.year);
        System.out.println("Nissan.color: " + Nissan.color);

        // set values to properties
        Nissan.make = "Nissan";
        Nissan.price = 10000;
        Nissan.year = 2008;
        Nissan.color = "Blue";

        System.out.println("\nNissan.make: " + Nissan.make);
        System.out.println("Nissan.price: " + Nissan.price);
        System.out.println("Nissan.year: " + Nissan.year);
        System.out.println("Nissan.color: " + Nissan.color);

    }

}