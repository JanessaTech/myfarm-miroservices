package com.myfarm.core.user.exception;

public class UserRoleException extends Exception {
    public UserRoleException(String msg){
        super(msg);
    }
    public UserRoleException(String msg, Throwable throwable){
        super(msg, throwable);
    }
}
