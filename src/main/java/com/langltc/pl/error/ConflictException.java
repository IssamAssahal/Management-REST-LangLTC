package com.langltc.pl.error;

import org.springframework.http.HttpStatus;

/**
 * @author Issam As-sahal ISA
 * @Created  10:43 PM.
 */
public class ConflictException extends ApiBaseException {

    public ConflictException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.CONFLICT;
    }
}
