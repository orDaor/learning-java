public class Employee {
    // properties
    private String name;
    private int age;
    // static constant (final) properties
    // NOTE: in general when we define a variable with "final" we give it a value
    // that van not be changes
    // NOTE: we do not need getters for constants (final) because their value can not change
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 65;

    // constructor
    public Employee(String name, int age) {
        setAge(age);
        setName(name);
    }

    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("INVALID NAME");
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        // if (age < Employee.getMinAge() || age > Employee.getMaxAge()) //varian with getters
        if (age < MIN_AGE || age > MAX_AGE)

            throw new IllegalArgumentException("INVALID AGE");
        this.age = age;
    }

}