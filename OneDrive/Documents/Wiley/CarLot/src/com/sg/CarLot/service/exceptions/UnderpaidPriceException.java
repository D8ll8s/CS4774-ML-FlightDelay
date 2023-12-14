package com.sg.CarLot.service.exceptions;

public class UnderpaidPriceException extends Exception {
    public UnderpaidPriceException(String message) {
        super(message);
    }

    public UnderpaidPriceException(String message, Throwable cause) {
        super(message, cause);
    }
}
