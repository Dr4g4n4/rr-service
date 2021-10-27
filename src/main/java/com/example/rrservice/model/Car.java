package com.example.rrservice.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Car {

    private String engineNumber;
    private EngineType engineType;
    private String chassisSerialNumber;
    private String brand;
    private String model;
    private Date productionDate;
    private Date firstRegistration;
    private Double mileage;

    public Car() {
    }

    public Car(String engineNumber, EngineType engineType, String chassisSerialNumber, String brand, String model, Date productionDate, Date firstRegistration, Double mileage) {
        this.engineNumber = engineNumber;
        this.engineType = engineType;
        this.chassisSerialNumber = chassisSerialNumber;
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
        this.firstRegistration = firstRegistration;
        this.mileage = mileage;
    }
}
