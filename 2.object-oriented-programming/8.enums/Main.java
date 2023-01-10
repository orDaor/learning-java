import model.Car;
import model.Car.TrafficLight;

public class Main {

    public static void main(String[] args) {
        //new car
        Car car = new Car("Nissan", 2020);

        //pass as a parameter one of the values of the TrafficLight enum, which is
        //a static member of Car class
        // car.drive(Car.TrafficLight.RED);
        TrafficLight light = null; //Car.TrafficLight.YELLOW;
        car.drive(light);
    }

}
