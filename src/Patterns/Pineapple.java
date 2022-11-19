package Patterns;

public class Pineapple extends PizzaTopping{
    public Pineapple(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return "Pineapple";
    }

    @Override
    public double coast() {
        return pizza.coast() + 6.5;
    }
}
