package Patterns;

public class Tomatoes extends PizzaTopping{
    public Tomatoes(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return "Tomatoes";
    }

    @Override
    public double coast() {
        return pizza.coast() + 2.0;
    }
}
