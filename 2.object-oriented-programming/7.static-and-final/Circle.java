//import a STATIC property of Math class
import static java.lang.Math.PI;

//import STATIC methods of the Math class ONE BY ON
// import static java.lang.Math.max;
// import static java.lang.Math.min;
// import static java.lang.Math.pow;
// import static java.lang.Math.sqrt;

//import EVERY STATIC property and method from the Math class
import static java.lang.Math.*;

//class definition
public class Circle {

    //properties
    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //getter and setters
    public double getCircumference() {
        return 2 * PI * radius; //static PI imported from Math class
    }

    public double getArea() {
        return PI * radius * radius; //static PI imported from Math class
    }

    public double getLargerRadius(double otherRadius) {
        return max(radius, otherRadius);
    }

    public double getSmallerRadius(double otherRadius) {
        return min(radius, otherRadius); //static min() imported from Math class
    }

    public double getRadiusSquared() {
        return pow(radius, 2); //static pow() imported from Math class
    }

    public double getRadiusSquareRoot() {
        return sqrt(radius); //static sqrt() imported from Math class
    }

}