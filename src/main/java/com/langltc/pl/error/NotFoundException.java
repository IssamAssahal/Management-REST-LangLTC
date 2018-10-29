package com.langltc.pl.error;

import org.springframework.http.HttpStatus;

/**
 * @author Issam As-sahal ISA
 * @Created  10:37 PM.
 */
public class NotFoundException extends ApiBaseException {

    public NotFoundException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.NOT_FOUND;
    }
}
