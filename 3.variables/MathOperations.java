public class MathOperations {
    public static void main(String[] args) {

        System.out.println("MATH OPS WITH NUMBERS OF SAME TYPE--------------------------------");
        //operations between numbers of given type, will return a number of that type
        //Example --> operation SUM
       
        int a = 3;
        int b = 4;

        long c = 2000000000000L;
        long d = 5000000000000L;

        double e = 2.5;
        double f = 4.5;

        System.out.println(a + b); 
        System.out.println(c + d); 
        System.out.println(e + f); 

        System.out.println("MODULUS OPERATION----------------------");
        //modulus operation involves only integers (int, long, ...) of a given ty, and will return
        //an integer of that type
        int g = 10;
        int h = 3;
        int remainder1 = g % h;
        System.out.println(remainder1); 

        long i = 10L;
        long l = 3L;
        long remainder2 = i % l;
        System.out.println(remainder2); 

        System.out.println("IN/DE-CREMENTAL OPERATORS----------------------");
        //integer number example
        int m = 1;
        m++; //2
        m++; //3
        int n = m; //3
        System.out.println(n);

        //decimal number example
        double o = 9.99;
        o--; //8.99
        o--; //7.99
        System.out.println(o);
    }
}
