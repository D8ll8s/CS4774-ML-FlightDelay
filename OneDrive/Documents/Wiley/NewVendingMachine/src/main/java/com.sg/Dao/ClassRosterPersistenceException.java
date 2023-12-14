package com.sg.Dao;

import java.io.FileNotFoundException;

public class ClassRosterPersistenceException extends Exception{

    public ClassRosterPersistenceException(String message) {
        super(message);
    }

    public ClassRosterPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

}