public class Weather {
    public static void main(String[] args) {
        //temp F
        double noon_F = 77; 
        double evening_F = 61; 
        double midnight_F = 55; 

        //temp C
        double noon_C = fahrenheitToCelsius(noon_F);
        double evening_C = fahrenheitToCelsius(evening_F);
        double midnight_C = fahrenheitToCelsius(midnight_F);

        //print tem
        printTemperatures(noon_F, noon_C);
        printTemperatures(evening_F, evening_C);
        printTemperatures(midnight_F, midnight_C);
    }

    // Task 1: Make a function here to convert F to C
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Task 2: Make a function here to print temperature values in F & C
    public static void printTemperatures(double fahrenheit, double celsius) {
        System.err.println("F: " + fahrenheit);
        System.out.println("C: " + celsius + "\n");
    }

}