package com.dobreadrianalia.tema1;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException(String errorMessage) {
        super(errorMessage);
    }
}
