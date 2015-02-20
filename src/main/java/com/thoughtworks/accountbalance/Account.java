package com.thoughtworks.accountbalance;

public class Account {
    private int balance;

    public Account (int balance) {
        this.balance = balance;
    }

    public void deposit (int deposit) {
        balance += deposit;
    }

    public void withdraw (int withdrawal) {
        if (balance > withdrawal) {
            balance -= withdrawal;
        }
    }

    public int getBalance() {
        return balance;
    }


}