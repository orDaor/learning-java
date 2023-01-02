import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        //new Person class object
        Person person1 = new Person();

        //print person fields
        System.out.println("person1.name: " + person1.name);
        System.out.println("person1.nationality: " + person1.nationality);
        System.out.println("person1.dateOfBirth: " + person1.dateOfBirth);
        System.out.println("person1.passport: " + person1.passport);
        System.out.println("person1.seatNumber: " + person1.seatNumber);

        //update object values
        person1.name = "Orgher";
        person1.nationality = "Albanian";
        person1.dateOfBirth = "05/05/1991";
        person1.passport = new String[] {"1a", "2b", "3c"};
        person1.seatNumber = 7;

        //print person fields
        System.out.println("\nperson1.name: " + person1.name);
        System.out.println("person1.nationality: " + person1.nationality);
        System.out.println("person1.dateOfBirth: " + person1.dateOfBirth);
        System.out.println("person1.passport: " + Arrays.toString(person1.passport));
        System.out.println("person1.seatNumber: " + person1.seatNumber);

    }
}
