package com.company.errorsLesson;

public class UserNotFoundException extends Exception{
    
    public UserNotFoundException(String message) {
        super(message);
    }
}
