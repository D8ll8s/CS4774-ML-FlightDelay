package com.sg.CarLot.Dao;

import com.sg.CarLot.Dto.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarLotDAOImpl implements CarLotDAO {


    Map<String,Car> map = new HashMap<>();

    @Override
    public Car addCar(String VIN, Car car) {
        return map.put(VIN,car);
    }

    @Override
    public Car getCar(String VIN) {
        return map.get(VIN);
    }

    @Override
    public List<Car> getCars() {
        List<Car> myCarList = new ArrayList<>(map.values());
        return myCarList;
    }

    @Override
    public void editCar(String VIN, Car car) {
        map.remove(VIN);
        map.put(VIN,car);
    }

    @Override
    public Car removeCar(String VIN) {
        return map.remove(VIN);
    }
}
