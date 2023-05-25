package org.example.behavioralDesignPattern.command;

public class Television implements ElectronicDevice{

    private  int volume = 0;
    @Override
    public void on() {
        System.out.println("TV turned ON");
    }

    @Override
    public void off() {
        System.out.println("TV turned OFF");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV volume increased to "+ volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV volume decreased to "+ volume);
    }
}
