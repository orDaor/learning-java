/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        // new car object
        Car Nissan = new Car("Nissan", 12999, 1992, "Blue");

        System.out.println("\nNissan.make: " + Nissan.getMake());
        System.out.println("Nissan.price: " + Nissan.getPrice());
        System.out.println("Nissan.year: " + Nissan.getYear());
        System.out.println("Nissan.color: " + Nissan.getColor());

        //change values
        Nissan.setMake("Fiat");
        Nissan.setPrice(12345);
        Nissan.setYear(2009);
        Nissan.setColor("Green");

        System.out.println("\nNissan.make: " + Nissan.getMake());
        System.out.println("Nissan.price: " + Nissan.getPrice());
        System.out.println("Nissan.year: " + Nissan.getYear());
        System.out.println("Nissan.color: " + Nissan.getColor());
    }

}