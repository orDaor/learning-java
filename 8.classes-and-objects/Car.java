import java.util.Arrays;

public class Car {
    // properties
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
    private int kms;

    // constructor
    public Car(
            String make,
            double price,
            int year,
            String color,
            String[] parts,
            int kms) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = parts.clone();
        this.kms = kms;
    }

    // copy constructor
    public Car(Car car) {
        this.make = car.make;
        this.price = car.price;
        this.year = car.year;
        this.color = car.color;
        this.parts = car.parts.clone();
        this.kms = car.kms;
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

    public int getKms() {
        return this.kms;
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

    public void setKms(int kms) {
        this.kms = kms;
    }

    public void drive(int newKms) {
        this.kms += newKms;
    }

    public String toString() {
        return "{" + "\n" +
                "  Make: " + this.make + "\n" +
                "  Price: " + this.price + "\n" +
                "  Year: " + this.year + "\n" +
                "  Color: " + this.color + "\n" +
                "  Parts: " + Arrays.toString(this.parts) + "\n" +
                "  Kms: " + this.kms + "\n" +
                "}" + "\n";
    }

}
