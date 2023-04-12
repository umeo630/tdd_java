package com.example.tdd_java.money;

public class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
