package org.example.behavioralDesignPattern.observer;

public class ObserverTest {

    public static void main(String[] args) {
        Observer mailNotification = new NotificationObserver(NotificationType.MAIL);
        Observer whatsappNotification = new NotificationObserver(NotificationType.WHATSAPP);
        Observer mobileNotification = new NotificationObserver(NotificationType.MOBILE);

        // Register
        Subject notificationSubject = new NotificationSubject();
        notificationSubject.register(mailNotification);
        notificationSubject.register(whatsappNotification);
        notificationSubject.register(mobileNotification);

        notificationSubject.updateMessage("Test Msg");

        //Unregister
        notificationSubject.unregister(whatsappNotification);
        System.out.println("After unregistering whatsappNotification");
        notificationSubject.updateMessage("Unregistered Whatspp");

        //Unregister
        notificationSubject.unregister(mailNotification);
        System.out.println("After unregistering mailNotification");
        notificationSubject.updateMessage("Unregistered Mail");

    }
}
