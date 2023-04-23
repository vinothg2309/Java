package org.example.dip;

public class ShoppingMall {

    private CreditCard creditCard;

    public ShoppingMall(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void doPurchaseSomething(long amount){
        creditCard.doTransaction(amount);
    }

    public static void main(String[] args) {
         DebitCard debitCard=new DebitCard();
         CreditCard creditCard=new CreditCard();

        ShoppingMall shoppingMall=new ShoppingMall(creditCard);
        shoppingMall.doPurchaseSomething(5000);
    }

}
