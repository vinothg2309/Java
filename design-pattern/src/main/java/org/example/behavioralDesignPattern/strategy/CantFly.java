package org.example.behavioralDesignPattern.strategy;

public class CantFly implements Fly{
    @Override
    public String fly() {
        return "Can't fly";
    }
}
