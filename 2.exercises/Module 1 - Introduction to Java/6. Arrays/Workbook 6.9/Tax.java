import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];

        double taxPercent = 13; //13%
        double taxCoeff = 1 + (taxPercent / 100);

        for (int i = 0; i < price.length; i++) {
            afterTax[i] = taxCoeff * price[i];
        }

        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The prices after tax are: " + Arrays.toString(afterTax));

    }
}
