package com.sg.CarLot.service;


import com.sg.CarLot.Dto.Car;
import com.sg.CarLot.Dto.CarKey;
import com.sg.CarLot.service.exceptions.NoSuchCarException;
import com.sg.CarLot.service.exceptions.OverpaidPriceException;
import com.sg.CarLot.service.exceptions.UnderpaidPriceException;

import java.math.BigDecimal;
import java.util.List;

public interface CarLotService {

    public Car getACar(String VIN);
    public List<Car> getAllCars();
    public List<Car> getCarsByColor(String color);
    public List<Car> getCarsInBudget(BigDecimal maxPrice);
    public List<Car> getCarByMakeAndModel(String make, String model);

    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount)
            throws NoSuchCarException, NoSuchCarException;

    public CarKey sellCar(String VIN, BigDecimal cashPaid)
            throws NoSuchCarException,
            OverpaidPriceException,
            UnderpaidPriceException;
}