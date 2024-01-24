package com.example.exceptionhandler.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exceptionhandler.Exceptions.CustomException1;
import com.example.exceptionhandler.Exceptions.CustomException2;

@RestController
public class MyController {

    @GetMapping("/exception1")
    public ResponseEntity<Object> getData1() {
        throw new CustomException1();
    }

    @GetMapping("/exception2")
    public ResponseEntity<Object> getData2() {
        throw new CustomException2();
    }
    
}
