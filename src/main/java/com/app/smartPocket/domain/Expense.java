package com.app.smartPocket.domain;


public class Expense {
    private String description;
    private int value;

    public Expense(String description, int value) {
        this.description = description;
        this.value = value;
    }
    public String details() {
        return """
               Description: %s
               Value: %s
               """.formatted(description, value);
    }
}
