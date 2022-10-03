package com.example.GlobalExceptioHandling.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class GlobalHandler {

    @ExceptionHandler({})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage exception(ResourceNotFoundException ex, WebRequest request){
        ErrorMessage errorMessage = new ErrorMessage(
          HttpStatus.NOT_FOUND.value(),
          new Date(),
                ex.getMessage(),
                request.getDescription(false)
        );
        return  errorMessage;
    }

}
