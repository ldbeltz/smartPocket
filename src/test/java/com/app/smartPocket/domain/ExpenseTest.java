package com.app.smartPocket.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExpenseTest {

    @Test
    void newExpenseHasDescriptionAndValue(){

        Expense expense = new Expense("Test", 0, 1);

        assertEquals("""
                      Description: Test
                      Value: 0
                      """, expense.details());
    }

}
