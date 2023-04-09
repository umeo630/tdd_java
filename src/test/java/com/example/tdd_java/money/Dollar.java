package com.example.tdd_java.money;

public class Dollar {
    int amount;
    Dollar (int amount) {
        this.amount = amount;
    }
    void times(int multiplier) {
        amount *= multiplier;
    }
}
