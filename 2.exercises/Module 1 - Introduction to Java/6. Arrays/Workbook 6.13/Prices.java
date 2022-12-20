import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        
        //matrix 3x5
        double[][] table = new double[3][5];
        
        //print matrix, values are initialized with zeros
        System.out.println(Arrays.toString(table[0]));
        System.out.println(Arrays.toString(table[1]));
        System.out.println(Arrays.toString(table[2]));

        //1st row
        table[0][0] = 1;
        table[0][1] = 2;
        table[0][2] = 3;
        table[0][3] = 4;
        table[0][4] = 5;

        //2nd row
        table[1][0] = 6;
        table[1][1] = 7;
        table[1][2] = 8;
        table[1][3] = 9;
        table[1][4] = 10;

        //3rd row
        table[2][0] = 11;
        table[2][1] = 12;
        table[2][2] = 13;
        table[2][3] = 14;
        table[2][4] = 15;

        //print matrix
        System.out.println("\n" + Arrays.toString(table[0]));
        System.out.println(Arrays.toString(table[1]));
        System.out.println(Arrays.toString(table[2]));
    }
}
