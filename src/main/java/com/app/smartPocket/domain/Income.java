package com.app.smartPocket.domain;

public class Income {
    private String description;
    private int value;
    public Income(String description, int value) {
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
