package org.example.behavioralDesignPattern.observer;

public class NotificationObserver implements Observer{

    private NotificationType notificationType = null;

    public NotificationObserver(NotificationType notificationType){
       this.notificationType = notificationType;
    }
    @Override
    public void update(String msg) {
        System.out.println("Sending"+msg+" via " + this.notificationType.name());
    }
}
