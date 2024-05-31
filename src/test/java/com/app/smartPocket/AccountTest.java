package com.app.smartPocket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void newAccountHasBalanceOfZero(){
        Account account = new Account();
        assertEquals(0 , account.totalBalance());
    }
    @Test
    void addExpenseSoBalanceIsMinusOne(){
        Account account = new Account();
        account.addExpense("iFood", 1);
        assertEquals(-1, account.totalBalance());
    }

    @Test
    void addIncomeSoBalanceIsOne(){
        Account account = new Account();
        account.addIncome("Salary", 1);
        assertEquals(1, account.totalBalance());
    }
}