package Patterns;

public class Student extends Person{
    public Student() {
        super();
        working = new Learner();
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        working = new Learner();
    }

    @Override
    public void display() {
        System.out.println("I'm a student!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
