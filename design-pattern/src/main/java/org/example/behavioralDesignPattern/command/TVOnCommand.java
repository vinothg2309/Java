package org.example.behavioralDesignPattern.command;

public class TVOnCommand implements Command{

    private ElectronicDevice electronicDevice;

    public TVOnCommand(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        this.electronicDevice.on();
    }
}
