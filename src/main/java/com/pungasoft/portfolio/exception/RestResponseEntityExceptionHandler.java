package com.pungasoft.portfolio.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = DataIntegrityViolationException.class)
    private ResponseEntity<ErrorMessage> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        return new ResponseEntity<>(new ErrorMessage(ex.getCause().getCause().getLocalizedMessage()), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value = PersonNotFoundException.class)
    private ResponseEntity<ErrorMessage> handlePersonNotFoundException(PersonNotFoundException ex) {
        return new ResponseEntity<> (new ErrorMessage(ex.getMessage()), HttpStatus.NOT_FOUND);
    }
}