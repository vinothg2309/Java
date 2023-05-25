package org.example.behavioralDesignPattern.command;

public class TVVolumeUp implements Command{

    private ElectronicDevice electronicDevice;

    public TVVolumeUp(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        this.electronicDevice.volumeUp();
    }

}
