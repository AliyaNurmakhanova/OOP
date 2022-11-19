package Patterns;

public class SeniorDeveloper implements Role{
    @Override
    public String desc() {
        return "senior developer.";
    }

    @Override
    public String responsibilities() {
        return "manage his/her own team.";
    }
}
