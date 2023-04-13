package com.example.tdd_java.money;

public class Dollar extends Money  {
    Dollar (int amount, String currency) {
        super(amount, currency);
    }
    Money times(int multiplier) {
        return Money.dollar(multiplier * amount);
    }
}
