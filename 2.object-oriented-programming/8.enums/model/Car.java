package model;

public class Car {
    // properties
    private String make;
    private int year;

    // enum property, it is STATIC by DEFAULT
    //NOTE: enum values are still STATIC & final (constants) members of the enum
    public enum TrafficLight {
        GREEN, YELLOW, RED
    };

    // constructor
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // getters and setters
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //this will as a parameter one of the 3 values of the TrafficLight enum
    public void drive(TrafficLight trafficLight) {

        switch (trafficLight) {
            case RED:
                System.out.println("STOP");
                break;
            case GREEN:
                System.out.println("DRIVE");
                break;
            case YELLOW:
                System.out.println("SLOW DOWN");
                break;
            default:
                throw new IllegalArgumentException("Bad traffic light value");
        }
    }

    // public void drive(TrafficLight trafficLight) {
    // if (trafficLight == null) throw new IllegalArgumentException("Traffic Light
    // cannot be null");
    // switch (trafficLight) {
    // case RED: System.out.println("STOP"); break;
    // case GREEN: System.out.println("DRIVE"); break;
    // case YELLOW: System.out.println("SLOW DOWN"); break;
    // }
    // }

}
