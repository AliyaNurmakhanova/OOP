package Patterns;

public class Programmer extends Person{
    public Programmer() {
        super();
        working = new Employee();
    }

    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
        working = new Employee();
    }

    @Override
    public void display() {
        System.out.println("I'm a programmer!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
