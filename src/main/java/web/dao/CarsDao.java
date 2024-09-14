package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarsDao {
    public ArrayList<Car> getAllCars();

    List<Car> getLimitedCars(int count);

    List<Car> getCarsWithLimit(String countParam);


}
