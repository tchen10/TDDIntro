package com.thoughtworks.accountbalance;

public class Account {
    private int balance = 100;

    public Integer deposit (int deposit) {
        balance += deposit;
        return balance;
    }

}