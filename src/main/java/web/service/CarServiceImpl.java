package web.service;
import web.dao.CarsDao;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarsService {

    @Autowired
    private CarsDao carsDao;

    @Autowired
    public CarServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public ArrayList<Car> getAllCars() {
        return carsDao.getAllCars();
    }

    @Override
    public List<Car> getLimitedCars(int count) {
        return carsDao.getLimitedCars(count);
    }

    @Override
    public List<Car> getCarsWithLimit(String countParam) {
        return carsDao.getCarsWithLimit(countParam);
    }


}
