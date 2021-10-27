package com.example.rrservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping(value = "/test/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> testMethod (@PathVariable String name){
        System.out.println("name " + name);
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }
}
