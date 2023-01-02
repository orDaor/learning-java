public class LoopingArrays {
    public static void main(String[] args) {

        String oneKingdom = "Mordor";
        
        String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "Eastumbria", oneKingdom};

        int kingdomsNumber = kingdoms.length;

        System.out.println("kingdoms elements: " + kingdomsNumber);

        for (int i = 0; i < kingdomsNumber; i++) {
            System.out.println("[" + i + "] " + kingdoms[i]);
        }

    }
}
