package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getAllCars() {
        cars.add(new Car(1974, "PORSCHE TURBO 3.0", 911));
        cars.add(new Car(1977, "PORSCHE TURBO 3.3", 930));
        cars.add(new Car(1990, "PORSCHE TURBO", 964));
        cars.add(new Car(1995, "PORSCHE TURBO", 993));
        cars.add(new Car(2000, "PORSCHE TURBO", 996));
        cars.add(new Car(2006, "PORSCHE TURBO", 997));
        cars.add(new Car(2016, "PORSCHE TURBO", 991));
        return cars;
    }

    public List<Car> carsCount(List<Car> cars, int number) {
        if (number == 0 || number > 7) return cars;
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}
