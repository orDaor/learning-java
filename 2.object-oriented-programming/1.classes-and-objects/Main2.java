public class Main2 {
    public static void main(String[] args) {

        //create cars and store them inside the dealership object
        System.out.println("Store cars in the Dealership:");
        Car nissan = new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}, 100);
        Car dodge = new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}, 200);
        Car nissan2 = new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}, 300);
        Car honda = new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}, 400);

        Car[] cars = {nissan, dodge, nissan2, honda};

        //create dealership obj with cars
        System.out.println("Init Dealership obj:");
        Dealership dealer = new Dealership(cars);
        System.out.println(dealer);
    }
}
