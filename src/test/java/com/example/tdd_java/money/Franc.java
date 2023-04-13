package com.example.tdd_java.money;

public class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }
    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
