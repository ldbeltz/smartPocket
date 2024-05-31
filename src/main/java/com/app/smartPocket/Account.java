package com.app.smartPocket;

public class Account {
    private int balance;

    public int totalBalance() {
        return balance;
    }

    public void addExpense(String description, int value) {
        this.balance =- value;
    }

    public void addIncome(String description, int value) {
        this.balance =+ value;
    }
}
