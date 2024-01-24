package com.example.exceptionhandler.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.exceptionhandler.Exceptions.CustomException1;
import com.example.exceptionhandler.Exceptions.CustomException2;

@ControllerAdvice
public class ExceptionHandlerController {
    
    @ExceptionHandler(value = CustomException1.class)
    public ResponseEntity<Object> handleCustomException1(CustomException1 exception){
        //System.out.println("Exception1 Message: "+exception.getMessage()); //null as we are not setting anything
        return new ResponseEntity<Object>("From Custom Exception1 handler", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = CustomException2.class)
    public ResponseEntity<Object> handleCustomException2(CustomException2 exception){
        //System.out.println("Exception2 Message: "+exception.getMessage());
        return new ResponseEntity<Object>("From Custom Exception2 handler", HttpStatus.BAD_REQUEST);
    }
}
