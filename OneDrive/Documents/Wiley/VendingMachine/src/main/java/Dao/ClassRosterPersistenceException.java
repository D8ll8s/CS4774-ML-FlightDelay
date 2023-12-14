package Dao;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;


@Component
public class ClassRosterPersistenceException extends Exception{

    public ClassRosterPersistenceException(String message) {
        super(message);
    }

    public ClassRosterPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

}