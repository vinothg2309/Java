package org.example.behavioralDesignPattern.strategy;

public class Dog extends Animal{

    public Dog(){
        setSound("Bark");
        fly = new CantFly();
    }
}
