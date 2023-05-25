package org.example.structuralDesignPattern.adapter;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle..");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Rectangle..");
    }

    @Override
    public String description() {
        return "Inside Rectangle";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
