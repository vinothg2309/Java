package org.example.behavioralDesignPattern.chainOfResponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain dispenseChain);

    void dispense(Currency currency);

}
