/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        // new car object
        Car nissan = new Car(
                "Nissan",
                12999,
                1992,
                "Blue",
                new String[] { "Tire1, Tire2, Tire3, Tire4" });
        nissan.printFields();

        // change values
        nissan.setPrice(12345);
        nissan.setYear(2009);
        nissan.setColor("Green");
        nissan.setParts(new String[] { "NewTire1, NewTire2, NewTire3, NewTire4" });
        nissan.printFields();

        // create another car object which is a copy of nissa
        Car nissan2 = new Car(nissan);
        nissan2.printFields();
    }

}