package org.example.behavioralDesignPattern.chainOfResponsibility;

import java.util.Scanner;

public class ATMDispenseChain {

    private DispenseChain dispenseChain2000;
    public ATMDispenseChain(){
        this.dispenseChain2000 = new Dispense2000rs();
        DispenseChain dispenseChain500 = new Dispense500rs();
        DispenseChain dispenseChain100 = new Dispense100rs();

        this.dispenseChain2000.setNextChain(dispenseChain500);
        dispenseChain500.setNextChain(dispenseChain100);
    }
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true){
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 100 != 0) {
                System.out.println("Amount should be in multiple of 100s.");
                return;
            }
            // process the request
            atmDispenser.dispenseChain2000.dispense(new Currency(amount));
        }
    }
}
