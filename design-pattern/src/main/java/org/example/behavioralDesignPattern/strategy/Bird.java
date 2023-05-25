package org.example.behavioralDesignPattern.strategy;

public class Bird extends Animal{

    public Bird(){
        setSound("Squik");
        fly = new CanFly();
    }
}
