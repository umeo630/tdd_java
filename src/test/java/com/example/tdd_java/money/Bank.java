package com.example.tdd_java.money;

public class Bank {
    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
