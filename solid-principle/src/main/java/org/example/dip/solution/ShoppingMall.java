package org.example.dip.solution;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
         BankCard debitCard=new DebitCard();
         BankCard creditCard=new CreditCard();

        ShoppingMall shoppingMall=new ShoppingMall(creditCard);
        shoppingMall.doPurchaseSomething(5000);
    }

}
