package org.example.behavioralDesignPattern.strategy;

public class Animal {

    private String sound;

    protected Fly fly;

    public void printAnimal(){
        System.out.println("Sound : "+ sound +" ,Fly : "+fly.fly());
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
