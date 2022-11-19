package Patterns;

public class Cheese extends PizzaTopping{
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return "Cheese";
    }

    @Override
    public double coast() {
        return pizza.coast() + 4.0;
    }
}
