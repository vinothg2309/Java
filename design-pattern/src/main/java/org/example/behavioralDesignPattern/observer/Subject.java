package org.example.behavioralDesignPattern.observer;


public interface Subject {

    public void register(Observer observer);

    public void unregister(Observer observer);

    public void notifyObservers();

    public void updateMessage(String message);

}
