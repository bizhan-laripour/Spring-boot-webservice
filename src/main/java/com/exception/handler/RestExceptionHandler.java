package com.exception.handler;

import com.exception.TncException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@ControllerAdvice
public class RestExceptionHandler {



    private final MessageSource messageSource;

    @Autowired
    public RestExceptionHandler(MessageSource messageSource){
        this.messageSource = messageSource;
    }


    @ExceptionHandler(TncException.class)
    public ResponseEntity<RestMessage> handleAuthenticationException(TncException ex){
        Locale local = new Locale("fa" , "TR");
        String source = messageSource.getMessage(ex.getMessage() ,ex.getArgs() , local);
        return  new ResponseEntity<RestMessage>(new RestMessage(source) , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
