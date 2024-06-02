package com.app.smartPocket.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void newAccountHasBalanceOfZero(){
        Account account = new Account();
        assertEquals(0 , account.totalBalance());
    }
    @Test
    void withdrawAmountSoBalanceIsMinusOne(){
        Account account = new Account();

        account.withdraw(1);
        assertEquals(-1, account.totalBalance());
    }
    @Test
    void depositAmountSoBalanceIsOne(){
        Account account = new Account();

        account.deposit(1);
        assertEquals(1, account.totalBalance());
    }
    @Test
    void withDrawSoBalanceIsMinusTwo(){
        Account account = new Account();

        account.withdraw(1);
        account.withdraw(1);

        assertEquals(-2, account.totalBalance());
    }
    @Test
    void depositSoBalanceIsTwo(){
        Account account = new Account();

        account.deposit(1);
        account.deposit(1);

        assertEquals(2, account.totalBalance());
    }
}