package com.oleksandr;

/**
 * Ford car implementation.
 */
public class Ford implements Car {

    static final String DESCRIPTION = "This is Ford.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}