import java.util.Arrays;

public class CopyAnArray {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        System.out.println(Arrays.toString(values));

        //create a new array which is a copy of the first one
        // int[] valuesCopy = Arrays.copyOf(values, values.length - 2);
        int[] valuesCopy = values.clone();

        System.out.println(Arrays.toString(valuesCopy));

        //modify first array only: second array is not modified
        values[0] = 999;
        System.out.println("\n" + Arrays.toString(values));
        System.out.println(Arrays.toString(valuesCopy));

    }
}
