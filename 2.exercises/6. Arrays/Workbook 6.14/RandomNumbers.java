public class RandomNumbers {
    public static void main(String[] args) {

        int[][] table = {
                { 48, 56, 56, 76, 0, 81, 51, 81, 99, 70 },
                { 38, 52, 73, 6, 10, 56, 1, 71, 47, 9 },
                { 85, 35, 47, 98, 91, 25, 69, 52, 2, 93 }
        };

        printMatrix(table);
    }

    public static int randomNumber() {
        double randomNumber = Math.random() * 100;
        return (int) randomNumber;
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
