import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {

        // matrix is an array, and its elements are arrays of integers
        int[][] matrix = new int[3][5]; // [rows][columns]

        // update some values to non-zero
        matrix[0][3] = 5;
        matrix[1][1] = 5;
        matrix[2][4] = 5;

        // print rows
        System.out.println(Arrays.toString(matrix[0])); // 1 row
        System.out.println(Arrays.toString(matrix[1])); // 2 row
        System.out.println(Arrays.toString(matrix[2])); // 3 row

        // other declaration example 3x3 array
        int[][] matrix2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        matrix2[0][0] = 0;
        matrix2[1][1] = 0;
        matrix2[2][2] = 0;

        //print rows
        System.out.println("\n" + Arrays.toString(matrix2[0]));
        System.out.println(Arrays.toString(matrix2[1]));
        System.out.println(Arrays.toString(matrix2[2]));
    }
}
