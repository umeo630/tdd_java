package com.example.tdd_java.money;
public class Money {
    protected int amount;
    protected String currency;
    Money times(int multiplier) {
        return new Money(multiplier * amount, currency);
    }

    Money (int amount, String  currency){
        this.amount = amount;
        this.currency = currency;
    }

    String currency(){
        return currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    public String toString() {
        return amount + " " + currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
}
