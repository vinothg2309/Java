package org.example.behavioralDesignPattern.strategy;

public class CanFly implements Fly{
    @Override
    public String fly() {
        return "I can fly!!!";
    }
}
