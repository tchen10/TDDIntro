package com.thoughtworks.accountbalance;

public class Account {
    private int balance;

    public Integer deposit (int balance, int deposit) {
        this.balance = balance;
        balance += deposit;
        return balance;
    }

    public Integer withdraw (int balance, int withdrawal) {
        this.balance = balance;
        if (balance > withdrawal) {
            balance -= withdrawal;
        }
        return balance;
    }

}