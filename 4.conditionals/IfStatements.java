public class IfStatements {
    public static void main(String[] args) {
        int grade = 65;

        if (grade > 80.0) {
           System.out.println("You passed the exam"); 
        } else if (grade > 60) {
            System.out.println("You can do better");
        } else {
            System.out.println("You failed bitch!");
        }
    }
}
