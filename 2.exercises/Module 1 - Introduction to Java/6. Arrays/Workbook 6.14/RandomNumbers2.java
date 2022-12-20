public class RandomNumbers2 {
    public static void main(String[] args) {

        //create and initialize matrix with zeros
        int[][] table = new int[100][10];

        //fill matrix with random integers
        fillMatrixWithRandomNumbers(table);

        //print matrix values
        printMatrix(table);
    }

    public static int randomNumber() {
        double randomNumber = Math.random() * 100;
        return (int) randomNumber;
    }

    public static void fillMatrixWithRandomNumbers(int[][] matrix) {
        // loop through each matrix element
        for (int i = 0; i < matrix.length; i++) { // loop rows
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[i][k] = randomNumber();
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        // loop through each matrix element
        for (int i = 0; i < matrix.length; i++) { // loop rows
            // print row number info
            System.out.print("Row N." + i + " -> ");

            // print values of each row
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }

            // new line
            System.out.print("\n");
        }
    }

}
