package org.example.behavioralDesignPattern.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        dog.printAnimal();
        bird.printAnimal();
    }
}
