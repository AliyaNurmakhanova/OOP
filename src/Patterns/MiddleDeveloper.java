package Patterns;

public class MiddleDeveloper implements Role{
    @Override
    public String desc() {
        return "middle developer.";
    }

    @Override
    public String responsibilities() {
        return "make technical decisions.";
    }
}
