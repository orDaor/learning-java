public class FizzBuzz {
    public static void main(String[] args) {

        // See Learn the Part for detailed instructions
        for (int i = 0; i <= 18; i++) {
            String result = getFizzBuzz(i);
            boolean isNone = result.equals("None");

            if (!isNone) {
                System.out.println(i + " " + result);
            }

        }
    }

    public static String getFizzBuzz(int number) {
        String result = "";

        // check if mutiple of 3 and/or 5
        boolean isMultiple_Of_3 = (number % 3) == 0;
        boolean isMultiple_Of_5 = (number % 5) == 0;

        if (isMultiple_Of_3 && !isMultiple_Of_5) {
            result = "Fizz";
        } else if (!isMultiple_Of_3 && isMultiple_Of_5) {
            result = "Buzz";
        } else if (isMultiple_Of_3 && isMultiple_Of_5) {
            result = "FizzBuzz";
        } else {
            result = "None";
        }

        return result;
    }

}
