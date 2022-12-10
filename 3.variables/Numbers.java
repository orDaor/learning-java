public class Numbers {
    public static void main(String[] args) {
        //normal integer
        int numberOfFans = 3000;
        String output1 = "I have " + numberOfFans + " fans!";
        System.out.println(output1);

        //long integer
        long globalPopulation = 8000000000L;
        String output2 = "There are " + globalPopulation + " people on earth";
        System.out.println(output2);

        long googleSearches = 5000000000L;
        String output3 = "Daily, there are " + googleSearches + " of google searches.";
        System.out.println(output3);

        //decimals
        double percentage = 45.8;
        double percentage2 = 100;
        System.out.println("The glass is " + percentage + "% empty");
        System.out.println("The glass is " + percentage2 + "% full");

        //decimals calculations: should ALWAYS use doubles
        double dividend = 25;
        double divisor = 2;
        double division = dividend / divisor;
        System.out.println("Result: " + division);
    }
}

