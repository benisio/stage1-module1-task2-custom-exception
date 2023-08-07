package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable reason) {
        super(message);
    }
}