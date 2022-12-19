import java.util.Arrays;

public class ArrayDefaultValues {
    public static void main(String[] args) {
        
        String[] words = new String[5];
        int[] integers = new int[5];
        long[] longs = new long[5];
        double[] doubles = new double[5];
        char[] chars = new char[5];

        //print arrays
        System.out.println("words: " + Arrays.toString(words));
        System.out.println("integers: " + Arrays.toString(integers));
        System.out.println("longs: " + Arrays.toString(longs));
        System.out.println("doubles: " + Arrays.toString(doubles));
        System.out.println("chars: " + Arrays.toString(chars));
    }
}
