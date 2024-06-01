package com.app.smartPocket.domain;

public class Account {
    private int balance = 0;

    public int totalBalance() {
        return balance;
    }

    public void addExpense(String description, int value) {
        this.balance -= value;
    }

    public void addIncome(String description, int value) {
        this.balance += value;
    }
}
