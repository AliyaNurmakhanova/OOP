package Patterns;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .25 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }
}
