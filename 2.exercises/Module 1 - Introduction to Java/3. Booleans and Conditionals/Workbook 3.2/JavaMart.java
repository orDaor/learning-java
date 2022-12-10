public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

 
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
        if (wallet >= toyCar) {
            System.out.println("Sure");
            wallet -= toyCar;
            System.out.println("wallet left: " + wallet);
        } else {
            System.out.println("Nope, I only have " + wallet + "$");
        }
        
        
        double nike = 95.99;
        System.out.println("\nCan I get these nike shoes?");
        if (wallet >= nike) {
            System.out.println("Sure");
            wallet -= toyCar;
            System.out.println("wallet left: " + wallet);
        } else {
            System.out.println("Nope, I only have " + wallet + "$");
        }

    }
}
