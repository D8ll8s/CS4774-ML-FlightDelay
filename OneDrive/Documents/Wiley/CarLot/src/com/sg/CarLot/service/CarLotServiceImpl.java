package com.sg.CarLot.service;

import com.sg.CarLot.Dao.CarLotDAOImpl;
import com.sg.CarLot.Dto.Car;
import com.sg.CarLot.Dto.CarKey;
import com.sg.CarLot.service.exceptions.NoSuchCarException;
import com.sg.CarLot.service.exceptions.OverpaidPriceException;
import com.sg.CarLot.service.exceptions.UnderpaidPriceException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarLotServiceImpl implements CarLotService{



    CarLotDAOImpl dao = new CarLotDAOImpl();

    @Override
    public Car getACar(String VIN) {
        return dao.getCar(VIN);
    }

    @Override
    public List<Car> getAllCars() {
        return dao.getCars();
    }

    @Override
    public List<Car> getCarsByColor(String color) {
        List<Car> myList = new ArrayList<>();
        myList = dao.getCars();

        List<Car> result = new ArrayList<>();

        for (Car i : myList){
            if (i.getColor().equalsIgnoreCase(color)){
                result.add(i);
            }
        }
        return result;

    }

    @Override
    public List<Car> getCarsInBudget(BigDecimal maxPrice) {
        return null;
    }

    @Override
    public List<Car> getCarByMakeAndModel(String make, String model) {
        return null;
    }

    @Override
    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount) throws NoSuchCarException {
        return null;
    }

    @Override
    public CarKey sellCar(String VIN, BigDecimal cashPaid) throws NoSuchCarException, OverpaidPriceException, UnderpaidPriceException {
        return null;
    }
}
