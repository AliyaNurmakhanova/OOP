package Patterns;

public class Actor extends Person{
    public Actor() {
        super();
        working = new Employee();
    }

    public Actor(String firstName, String lastName) {
        super(firstName, lastName);
        working = new Employee();
    }

    @Override
    public void display() {
        System.out.println("I'm a actor!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
