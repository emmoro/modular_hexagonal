package com.br.elton.designer.patterns.rest.handler;

import com.br.elton.designer.patterns.domain.exceptions.CPFException;
import com.br.elton.designer.patterns.domain.model.ErrorModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> errorException(Exception ex, WebRequest request) {
        LOGGER.error(ex.getMessage(), ex);

        return buildErrorResponse(ex,
                ex.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR,
                request);
    }

    @ExceptionHandler(CPFException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> cpfException(Exception ex, WebRequest request) {
        LOGGER.error(ex.getMessage(), ex);

        return buildErrorResponse(ex,
                ex.getMessage(),
                HttpStatus.UNPROCESSABLE_ENTITY,
                request);
    }

    private ResponseEntity<Object> buildErrorResponse(Exception e, String message,
                                                      HttpStatus httpStatus, WebRequest request) {
        ErrorModel errorResponse = new ErrorModel(httpStatus.value(), message);
        return ResponseEntity.status(httpStatus).body(errorResponse);
    }

}
