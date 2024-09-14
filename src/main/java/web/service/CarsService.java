package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarsService {
   public ArrayList<Car> getAllCars();

   public List<Car> getLimitedCars(int count);

   List<Car> getCarsWithLimit(String countParam);
}
