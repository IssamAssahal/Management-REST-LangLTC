package com.langltc.pl.error;

import org.springframework.http.HttpStatus;

/**
 * @author Issam As-sahal ISA
 * @Created 10:45 PM.
 */
public abstract class ApiBaseException extends RuntimeException {

    public ApiBaseException(String message) {
        super(message);
    }

    public abstract HttpStatus getStatusCode();
}
