package org.example.behavioralDesignPattern.chainOfResponsibility;

public class Dispense500rs implements DispenseChain{

    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.chain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() > 500){
            int num = currency.getAmount()/500;
            int remainder = currency.getAmount()%500;
            System.out.println("Dispensing "+num+" of 500 note");
            if(remainder!=0){
                this.chain.dispense(new Currency(remainder));
            }
        }else {
            this.chain.dispense(currency);
        }
    }
}
