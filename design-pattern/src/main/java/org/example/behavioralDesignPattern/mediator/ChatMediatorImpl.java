package org.example.behavioralDesignPattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

    private List<User> users;

    public ChatMediatorImpl(){
        this.users=new ArrayList<>();
    }
    @Override
    public void sendMessage(String msg, User user) {
        users.stream().filter(u -> u!=user).forEach(user1 -> user1.receiveMessage(msg));
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
