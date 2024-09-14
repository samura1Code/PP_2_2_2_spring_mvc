package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsDaoImpl implements CarsDao {

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

    @Override
    public List<Car> getLimitedCars(int count) {
        List<Car> cars = getAllCars();
        return cars.subList(0, Math.min(count, cars.size()));
    }


    @Override
    public List<Car> getCarsWithLimit(String countParam) {
        List<Car> cars = getAllCars();
        if (countParam != null) {
            int countInt = Integer.parseInt(countParam);
            return getLimitedCars(countInt);
        }
        return cars;
    }


}
