package com.sg.CarLot.service.exceptions;

public class OverpaidPriceException extends Exception {

    public OverpaidPriceException(String message) {
        super(message);
    }

    public OverpaidPriceException(String message, Throwable cause) {
        super(message, cause);
    }
}
