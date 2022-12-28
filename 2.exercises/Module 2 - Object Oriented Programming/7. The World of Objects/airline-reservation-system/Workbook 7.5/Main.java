 public class Main {
  
    public static void main(String[] args) {
        //New person
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5); 
        person.printFields();
        
        if (person.applyPassport()) {
            System.out.println("\nCongrtulations " + person.getName() + "! Your passport is approved");
            //change seat number
            person.chooseSeat();
            person.printFields();
        } else {
            System.out.println("\nWe are sorry, " + person.getName() + "but your passport is not valid!");
        }
    }
  
  
}
