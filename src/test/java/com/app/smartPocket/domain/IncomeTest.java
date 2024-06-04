package com.app.smartPocket.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IncomeTest {
    @Test
    void newIncomeHasDescriptionAndValue(){
        Income income = new Income("Teste", 0);

        assertEquals("""
                      Description: Teste
                      Value: 0
                      """, income.details());
    }
}
