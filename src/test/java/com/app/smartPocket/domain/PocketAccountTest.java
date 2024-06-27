package com.app.smartPocket.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class PocketAccountTest {
    @Test
    void newAccountHasBalanceOfZero(){
        PocketAccount pocketAccount = new PocketAccount();
        assertEquals(0 , pocketAccount.totalBalance());
    }
    @Test
    void withdrawAmountSoBalanceIsMinusOne(){
        PocketAccount pocketAccount = new PocketAccount();

        pocketAccount.withdraw(1);
        assertEquals(-1, pocketAccount.totalBalance());
    }
    @Test
    void depositAmountSoBalanceIsOne(){
        PocketAccount pocketAccount = new PocketAccount();

        pocketAccount.deposit(1);
        assertEquals(1, pocketAccount.totalBalance());
    }
    @Test
    void withDrawSoBalanceIsMinusTwo(){
        PocketAccount pocketAccount = new PocketAccount();

        pocketAccount.withdraw(1);
        pocketAccount.withdraw(1);

        assertEquals(-2, pocketAccount.totalBalance());
    }
    @Test
    void depositSoBalanceIsTwo(){
        PocketAccount pocketAccount = new PocketAccount();

        pocketAccount.deposit(1);
        pocketAccount.deposit(1);

        assertEquals(2, pocketAccount.totalBalance());
    }
    @Test
    void insertExpenseSoBalanceShouldBeDiscounted(){
        PocketAccount pocketAccount = new PocketAccount();
        Expense expense = new Expense("Test", 3, 1);

        pocketAccount.insert(expense);

        assertEquals(-3, pocketAccount.totalBalance());
    }
    @Test
    void insertIncomeSoBalanceShouldBeAdded(){
        PocketAccount pocketAccount = new PocketAccount();
        Income income = new Income("Test", 3);

        pocketAccount.insert(income);

        assertEquals(3, pocketAccount.totalBalance());
    }

    @Test
    void insertExpenseWithInstalmentSoBalanceIsDiscountedOnInstallmentValue() {
        PocketAccount pocketAccount = new PocketAccount();
        Expense expense = new Expense("Dress", 100, 5);

        pocketAccount.insert(expense);

        assertThat(pocketAccount.totalBalance())
                .isEqualTo(-20);
    }
    @Test
    void newExpenseWithInstallmentLessThenOneShouldBeRegisteredAsOne(){
        Expense expense1 = new Expense("Test", 100, 0);
        Expense expense2 = new Expense("Test", 100, -1);
        assertThat(expense1.installments())
                .isEqualTo(1);
        assertThat(expense2.installments())
                .isEqualTo(1);
    }

    @Test
    void insertExpenseWithInstallmentSoDebtIsValueOfExpenseWithOneInstalmentDiscounted() {
        PocketAccount pocketAccount = new PocketAccount();
        Expense expense = new Expense("Dress", 100, 5);

        pocketAccount.insert(expense);

        assertThat(pocketAccount.totalDebt())
                .isEqualTo(80);
    }

    @Test
    void insertMoreThenOneExpenseWithInstallmentShouldAddDebtAmount() {
        PocketAccount pocketAccount = new PocketAccount();
        Expense expense1 = new Expense("Dress", 100, 5);
        Expense expense2 = new Expense("Dress", 100, 5);
        pocketAccount.insert(expense1);
        pocketAccount.insert(expense2);

        assertThat(pocketAccount.totalDebt())
                .isEqualTo(160);
    }
}