public class Variables {
    public static void main(String[] args) {
        System.out.println("SOME PRIMITIVE VALUES--------------------------------------");

        //Integer
        int apples = 6;

        //long integer
        long population = 8000000000L;

        //decimal
        double price = 5.99;

        //character
        char nameInitial = 'O';

        //string
        String fullName = "Orgher Dalipi";

        //print the variables
        System.out.println("apples: " + apples);
        System.out.println("population: " + population);
        System.out.println("price: " + price);
        System.out.println("nameInitial: " + nameInitial);
        System.out.println("fullName: " + fullName);

        System.out.println("ASSIGNING VALUE------------------------------------------");
        int passengers = 12;
        int busTickets = passengers;
        System.out.println("busTickets: " + busTickets);

        System.out.println("UPDATING VALUE------------------------------------------");
        int players = 0;
        //players = players + 5;
        players += 5;
        System.out.println("players: " + players);
        //players = players - 2;
        // players += (-2);
        players -= 2;
        System.out.println("players: " + players);

    }
}
