package com.example.api.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1l;

    public ObjectNotFoundException(String message) {
        super(message);
    }
}
