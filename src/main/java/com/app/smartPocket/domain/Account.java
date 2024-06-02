package com.app.smartPocket.domain;

public class Account {
    private int balance = 0;

    public int totalBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
}
