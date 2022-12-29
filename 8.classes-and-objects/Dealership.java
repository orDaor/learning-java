public class Dealership {
    // properties
    private Car[] cars;

    // constructor
    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    // methods...

    //to string
    public String toString() {

        // build string which contains cars objects data
        String carsString = "";
        for (Car car : this.cars) {
            if (car != null) {
                carsString += car.toString();
            } else {
                carsString += "           null\n";
            }
        }

        return "{" + "\n" +
                "  Cars: [" + "\n" +
                carsString +
                "        ]" + "\n" +
                "}" + "\n";
    }
}
