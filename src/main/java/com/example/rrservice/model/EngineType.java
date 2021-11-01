package com.example.rrservice.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class EngineType implements Serializable {

    private int motorPower;
    private int hPower;
    private int volume;
    private int numberOfCylinders;
    private String primaryFuel;

    public EngineType() {
    }

    public EngineType(int motorPower, int hPower, int volume, int numberOfCylinders, String primaryFuel) {
        this.motorPower = motorPower;
        this.hPower = hPower;
        this.volume = volume;
        this.numberOfCylinders = numberOfCylinders;
        this.primaryFuel = primaryFuel;
    }
}
