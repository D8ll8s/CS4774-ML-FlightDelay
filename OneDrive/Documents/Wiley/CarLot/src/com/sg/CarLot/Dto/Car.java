package com.sg.CarLot.Dto;


import java.math.BigDecimal;

public class Car {
    private String VIN;
    private String make;
    private String model;
    private String color;

    public String getVIN() {
        return VIN;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public long getOdometerMiles() {
        return odometerMiles;
    }

    public CarKey getKey() {
        return key;
    }

    private BigDecimal price;
    private long odometerMiles;

    private CarKey key;

    // plus getters, setters & appropriate constructors
}