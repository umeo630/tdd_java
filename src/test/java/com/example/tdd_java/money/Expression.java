package com.example.tdd_java.money;

public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression tenFrancs);
}
