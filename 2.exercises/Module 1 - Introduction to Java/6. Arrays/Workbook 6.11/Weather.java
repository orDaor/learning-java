public class Weather {
    public static void main(String[] args) {

        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsiusArray = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0 };
        double[] fahrenheitArray = celsiusToFahrenheitArray(celsiusArray);

        // print temperatures
        printTemperatures(celsiusArray, "Celsius");
        printTemperatures(fahrenheitArray, "Fahrenheit");
    }

    public static double[] celsiusToFahrenheitArray(double[] celsiusArray) {
        // new array of same length as input one
        double[] fahrenheitArray = new double[celsiusArray.length];

        // fill fahrenheit array with fahrenheit values
        for (int i = 0; i < celsiusArray.length; i++) {
            fahrenheitArray[i] = celsiusToFahrenheit(celsiusArray[i]);
        }

        // return fahrenheit array
        return fahrenheitArray;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void printTemperatures(double[] temperatureArray, String temperatureType) {
        System.out.print(temperatureType + ": ");
        for (double temperature : temperatureArray) {
            System.out.print(temperature + " ");
        }
        System.out.print("\n");
    }
}
