public class User {
    //properties
    private String firstName;
    private String lastName;
    //static property with default value
    private static int userCount = 0;

    //constructor
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //increment static user counter every time a user is created
        userCount++;
    }
    //static getter for static attribute
    public static int getuserCount() {
        return userCount;
    }

    //getters and setters
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}