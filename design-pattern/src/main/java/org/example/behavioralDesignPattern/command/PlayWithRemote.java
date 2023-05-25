package org.example.behavioralDesignPattern.command;

public class PlayWithRemote {

    public static void main(String[] args) {
        ElectronicDevice electronicDevice = new Television();
        Command tvOn = new TVOnCommand(electronicDevice);
        tvOn.execute();
        Command tvOff = new TVOffCommand(electronicDevice);
        tvOff.execute();
        Command tvVolUp = new TVVolumeUp(electronicDevice);
        tvVolUp.execute();
        Command tvVolDown = new TVVolumeDown(electronicDevice);
        tvVolDown.execute();
    }
}
