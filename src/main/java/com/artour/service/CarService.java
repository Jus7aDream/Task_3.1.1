package com.artour.service;

import com.artour.model.Car;

import java.util.List;

public interface CarService {
    List<Car> addCars();

    List<Car> getAllCars(Integer count);
}
