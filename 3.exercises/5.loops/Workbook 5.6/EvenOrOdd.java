public class EvenOrOdd {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 19; i++) {
            //chek if "i" is odd or even
            String evenOrOdd = "even or odd?";
            boolean isEven = (i % 2) == 0;

            if (isEven) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }

            System.out.println(i + " - " + evenOrOdd);
        }

    }
}
