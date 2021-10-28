package com.example.rrservice.controller;

import com.example.rrservice.model.Car;
import com.example.rrservice.model.EngineType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private KafkaTemplate<String, Car> kafkaTemplate;
    private static final String topic = "second";


    @GetMapping(value = "/test/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> testMethod (@PathVariable String name){
        EngineType engineType = new EngineType(10,10,10,10,"DIZEL");
        Car car = new Car("45dg4", engineType,"44rdg", "passat","208",new Date(), new Date(),15.0);

        System.out.println("name " + name);
        kafkaTemplate.send(topic,car);
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }

}
