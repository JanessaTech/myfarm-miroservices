package com.myfarm.core.user.exception;

public class UserProfileException extends Exception {
    public UserProfileException(String msg){
        super(msg);
    }
    public UserProfileException(String msg, Throwable throwable){
        super(msg, throwable);
    }
}
