package com.oleksandr;

/**
 * Ford implementation.
 */
public class Ford implements Car {

    static final String DESCRIPTION = "This is Ford.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}