package Patterns;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

//    Duck mallard = new MallardDuck();
//        mallard.performQuack();
//                mallard.performFly();
//
//                System.out.println();
//
//                Duck model = new ModelDuck();
//                model.performFly();
//                model.setFlyBehavior(new FlyRocketPowered());
//                model.performFly();
//                model.setQuackBehavior(new Squeak());
//                model.performQuack();