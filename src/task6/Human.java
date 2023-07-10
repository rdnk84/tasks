package task6;

public abstract class Human implements Purpose{

    private String lastName;
    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Human(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public abstract void printInfo();
}
