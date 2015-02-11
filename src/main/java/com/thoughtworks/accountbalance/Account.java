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
        balance -= withdrawal;
        return balance;
    }

}