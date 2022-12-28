public class Main {

    public static void main(String[] args) {

        //new person
        Person person = new Person(
                "Rayan Slim",
                "Canadian",
                "11/11/1111",
                5);

        person.printFields();

        //update passport value with person data
        person.setPassport();
        person.printFields();

    }

}
