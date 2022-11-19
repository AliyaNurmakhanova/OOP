package Patterns;

public class Mushrooms extends PizzaTopping{
    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return "Mushrooms";
    }

    @Override
    public double coast() {
        return pizza.coast() + 7.0;
    }
}
