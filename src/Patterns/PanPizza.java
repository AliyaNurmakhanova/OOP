package Patterns;

public class PanPizza implements Pizza{

    @Override
    public String description() {
        return "Pan Pizza";
    }

    @Override
    public double coast() {
        return 15.0;
    }
}
