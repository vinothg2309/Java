package org.example.behavioralDesignPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationSubject implements Subject{

    List<Observer> observers;
    private String message;

    public NotificationSubject(){
        observers = new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observerToBeRemoved) {
        int index = observers.indexOf(observerToBeRemoved);
        System.out.println("Index : "+ index);
        observers.remove(observerToBeRemoved);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(message);
        }
    }

    public void updateMessage(String message){
        this.message = message;
        notifyObservers();
    }
}
