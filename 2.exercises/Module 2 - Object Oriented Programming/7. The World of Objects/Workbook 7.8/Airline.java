public class Airline {
    // attributes
    Person[] people; // array that stores Person objects...

    // constructor (1)
    public Airline() {
        this.people = new Person[11];
    }

    // methods...

    // get a specific person from the airline
    public Person getPerson(int index) {
        for (int i = 0; i < this.people.length; i++) {
            if (i == index) {
                return new Person(this.people[i]);
            }
        }
        // no person found with the given index
        return null;
    }

    // insert a person inside of the array of people of this airline.
    // NOTE: if the person.seatNumber = N, then this person has to occupy position
    // N-1 of the array
    public Person setPerson(Person person) {
        for (int i = 0; i < this.people.length; i++) {
            if (i == person.getSeatNumber() - 1) {
                this.people[i] = new Person(person);
                // return pointer to the entered person
                return this.people[i];
            }
        }
        // no place found for this person
        return null;
    }

}
