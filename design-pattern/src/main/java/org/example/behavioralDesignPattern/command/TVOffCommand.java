package org.example.behavioralDesignPattern.command;

public class TVOffCommand implements Command{

    private ElectronicDevice electronicDevice;
    public TVOffCommand(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        this.electronicDevice.off();
    }
}
