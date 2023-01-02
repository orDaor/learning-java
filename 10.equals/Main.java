import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 3 cities
        City paris = new City("Paris", 2161000);
        City florence = new City("Florence", 382258);
        City tirana = new City("Tirana", 200000);

        // list of cities
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Paris", 2161000));
        cities.add(new City("Florence", 382258));
        cities.add(new City("Venice", 261905));
        cities.add(new City("Versailles", 85771));
        cities.add(new City("London", 8982000));

        // check if paris, florence and tirana are contained in the list.
        // NOTE: contains() loops over the list elements, and calls equals() method
        // on each city
        System.out.println("Contains Paris: " + cities.contains(paris));
        System.out.println("Contains Florence: " + cities.contains(florence));
        System.out.println("Contains Tirana: " + cities.contains(tirana));
    }

}