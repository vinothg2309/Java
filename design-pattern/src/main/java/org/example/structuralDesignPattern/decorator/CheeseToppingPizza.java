package org.example.structuralDesignPattern.decorator;

public class CheeseToppingPizza extends PizzaDecorator{
    public CheeseToppingPizza(Pizza pizza) {
        super(pizza);

        System.out.println("Adding Cheese toppings");
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",  Cheese toppings";
    }

    @Override
    public double getCost() {
        return super.getCost()+30;
    }
}
