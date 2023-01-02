public class LotteryTickets {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (workbook 6.12)
        int[] ticket1 = { 34, 43, 45, 65, 21, 54 };
        int[] ticket2 = ticket1.clone();
        ticket2[2] = 54;

        //print tickets
        printTicket(ticket1, "ticket1");
        printTicket(ticket2, "ticket2");
    }

    public static void printTicket(int[] ticket, String ticketName) {
        System.out.print(ticketName + " numbers" + ": ");
        for (int number : ticket) {
            System.out.print(number + " ");
        }
        System.out.println("\n\n");
    }
}
