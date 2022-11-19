package Patterns;

public class Employee implements Working{
    @Override
    public void work() {
        System.out.println("I work as a Java developer at Google.");
    }
}
