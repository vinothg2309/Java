package org.example.behavioralDesignPattern.mediator;

public class UserImpl extends User{

    public UserImpl(ChatMediator chatMediator, String name){
        super(chatMediator, name);
    }
    @Override
    public void sendMessage(String msg) {
        System.out.println(this.name+": Sending Message="+msg);
        chatMediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }
}
