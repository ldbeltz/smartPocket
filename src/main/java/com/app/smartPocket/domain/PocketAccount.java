package com.app.smartPocket.domain;

public class PocketAccount {
    private int balance = 0;

    private int debt = 0;

    public int totalBalance() {
        return balance;
    }

    public int totalDebt(){return debt;}

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void payDebt(int amount){
        this.debt -= amount;
    }

    public void insert(Expense expense) {
        debt += expense.getValue();
        withdraw(expense.getValue() / expense.installments());
        payDebt(expense.getValue() / expense.installments());
    }
    public void insert(Income income){
        deposit(income.getValue());
    }
}
