public class Main {

    public static void main(String[] args) {
        // person 1
        Person person1 = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
        person1.printFields();

        // change seat number
        person1.setSeatNumber(10);
        person1.printFields();

        // copy the object into a new different one
        Person person2 = new Person(person1);
        person2.printFields();
    }

}
