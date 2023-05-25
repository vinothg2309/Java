package org.example.structuralDesignPattern.decorator;

public class PizzaDecorator implements Pizza {

    protected Pizza tempPizza;

    public PizzaDecorator(Pizza pizza){
        this.tempPizza = pizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
