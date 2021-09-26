package com.peyman.exceptionhandling;

public class CustomException extends Throwable {
    private String message;

    public CustomException(String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
