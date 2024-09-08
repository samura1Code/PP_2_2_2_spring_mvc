package service;

import model.Car;

import java.util.ArrayList;

public class CarServiceImpl implements CarsService {
    @Override
    public ArrayList<Car> getAllCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "Black", 190));
        cars.add(new Car("BMW", "White", 180));
        cars.add(new Car("Audi", "Black", 170));
        cars.add(new Car("Ford", "Black", 190));
        cars.add(new Car("Honda", "White", 180));
        return cars;
    }


}
