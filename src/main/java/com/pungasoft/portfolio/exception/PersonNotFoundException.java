package com.pungasoft.portfolio.exception;

public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException() {
        super("Person not found");
    }
}
