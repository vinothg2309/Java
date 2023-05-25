package org.example.structuralDesignPattern.decorator;

public class PizzaMaker {

    public static void main(String[] args) {
        Pizza cheeseToppingPizza = new CheeseToppingPizza(new PlainPizza());
        System.out.println(cheeseToppingPizza.getCost()+" , Description : "+ cheeseToppingPizza.getDescription());

        Pizza chickenPizzaWithToppings = new ChickenPizzaWithTopping(new CheeseToppingPizza(new PlainPizza()));
        System.out.println(chickenPizzaWithToppings.getCost()+" , Description : "+ chickenPizzaWithToppings.getDescription());
    }
}
