/**
 * Looping2DArrays
 */
public class Looping2DArrays {

    public static void main(String[] args) {
        
        //table 3 x 5
        int[][] matrix = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };

        //loop through each matrix element
        for (int i = 0; i < matrix.length; i++) { //loop rows
            //print row number info
            System.out.print("Row N." + i + " -> ");

            //print values of each row
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print(matrix[i][k] +  " ");
            }

            //new line
            System.out.print("\n");
        }

    }
}