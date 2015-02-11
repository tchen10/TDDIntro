package com.thoughtworks.accountbalance;

public class Account {
    private int balance;

    public Account (int balance) {
        this.balance = balance;
    }

    public Integer deposit (int deposit) {
        balance += deposit;
        return balance;
    }

    public Integer withdraw (int withdrawal) {
        if (balance > withdrawal) {
            balance -= withdrawal;
        }
        return balance;
    }

}