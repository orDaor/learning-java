
/**
 * Main
 */
public class Main1 {

    public static void main(String[] args) {

        // new car object
        System.out.println("New car obj:");

        Car nissan = new Car(
                "Nissan",
                12999,
                1992,
                "Blue",
                new String[] { "Tire1, Tire2, Tire3, Tire4" },
                789);
        System.out.println(nissan);

        // change values
        System.out.println("Update values except make:");
        nissan.setPrice(12345);
        nissan.setYear(2009);
        nissan.setColor("Green");
        nissan.setParts(new String[] { "NewTire1, NewTire2, NewTire3, NewTire4" });
        nissan.setKms(999);
        System.out.println(nissan);

        // create another car object which is a copy of nissan
        System.out.println("Copy of the car obj:");
        Car nissan2 = new Car(nissan);
        System.out.println(nissan2);

        // drives of 1000 kms more
        System.out.println("Car drives 1000 kms more:");
        nissan2.drive(1000);
        System.out.println(nissan2);
    }

}