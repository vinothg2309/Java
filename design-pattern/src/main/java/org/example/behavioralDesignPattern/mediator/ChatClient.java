package org.example.behavioralDesignPattern.mediator;

public class ChatClient {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Vinoth");
        User user2 = new UserImpl(mediator, "Kiruba");
        User user3 = new UserImpl(mediator, "krithin");
        User user4 = new UserImpl(mediator, "Ken");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.sendMessage("Hi All");
    }
}
