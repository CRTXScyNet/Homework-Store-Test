package com.example.storetest.castomExeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class InvalidIdValueException extends RuntimeException{
    public InvalidIdValueException() {
    }

    public InvalidIdValueException(String message) {
        super(message);
    }

    public InvalidIdValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIdValueException(Throwable cause) {
        super(cause);
    }

    public InvalidIdValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
