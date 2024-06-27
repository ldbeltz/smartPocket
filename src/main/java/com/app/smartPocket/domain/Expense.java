package com.app.smartPocket.domain;


public class Expense {
    private String description;
    private int value;
    private int installments;

    public Expense(String description, int value, int installments) {
        this.description = description;
        this.value = value;
        this.installments = Math.max(installments, 1);
    }
    public String details() {
        return """
               Description: %s
               Value: %s
               """.formatted(description, value);
    }
    public int getValue(){
        return value;
    }

    public boolean isInstallmentPayment(){
        return installments > 1;
    }

    public int installments(){
        return installments;
    }
}
