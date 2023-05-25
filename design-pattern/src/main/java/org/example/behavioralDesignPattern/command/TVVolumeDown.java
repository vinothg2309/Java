package org.example.behavioralDesignPattern.command;

public class TVVolumeDown implements Command{
    private ElectronicDevice electronicDevice;

    public TVVolumeDown(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        this.electronicDevice.volumeDown();
    }
}
