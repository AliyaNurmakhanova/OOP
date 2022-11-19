package Patterns;

public class JuniorDeveloper implements Role{
    @Override
    public String desc() {
        return "junior developer.";
    }

    @Override
    public String responsibilities() {
        return "write code.";
    }
}
