package org.example.structuralDesignPattern.decorator;

public class ChickenPizzaWithTopping extends PizzaDecorator{
    public ChickenPizzaWithTopping(Pizza pizza) {
        super(pizza);
        System.out.println("chicken with cheese topping");
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", chicken with cheese topping";
    }

    @Override
    public double getCost() {
        return super.getCost()+ 70;
    }
}
