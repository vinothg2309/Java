package org.example.behavioralDesignPattern.chainOfResponsibility;

public class Dispense2000rs implements DispenseChain{

    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.chain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() > 2000){
            int num = currency.getAmount()/2000;
            int remainder = currency.getAmount()%2000;
            System.out.println("Dispensing "+num+" of 2000 note");
            if(remainder!=0){
                this.chain.dispense(new Currency(remainder));
            }
        }else {
            this.chain.dispense(currency);
        }
    }
}
