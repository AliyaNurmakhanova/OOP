package Patterns;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Most excellent dark roast coffee ";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
