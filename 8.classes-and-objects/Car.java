import java.util.Arrays;

public class Car {
    // properties
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    // constructor
    public Car(
            String make,
            double price,
            int year,
            String color,
            String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = parts.clone();
    }

    // copy constructor
    public Car(Car car) {
        this.make = car.make;
        this.price = car.price;
        this.year = car.year;
        this.color = car.color;
        this.parts = car.parts.clone();
    }

    // getter methods
    public String getMake() {
        return this.make;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }

    public String[] getParts() {
        return this.parts.clone();
    }

    // setters methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts) {
        this.parts = parts.clone();
    }

    public void printFields() {
        System.out.println("\nMake: " + this.make);
        System.out.println("Price: " + this.price);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
        System.out.println("Parts: " + Arrays.toString(this.parts));
    }
}
