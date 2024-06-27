package com.app.smartPocket.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class IncomeTest {
    @Test
    void newIncomeHasDescriptionAndValue(){
        Income income = new Income("Teste", 0);

        assertThat(income.details())
                .isEqualTo("""
                      Description: Teste
                      Value: 0
                      """);
    }
}
