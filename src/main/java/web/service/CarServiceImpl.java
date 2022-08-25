package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements  CarService {
//    private final CarDao carDao;
//
//    public CarServiceImpl(CarDao carDao) {
//        this.carDao = carDao;
//    }

    CarDaoImpl carDao = new CarDaoImpl();

    public List<Car> getCarList(int i) {
        if (i <= 0) {
            return carDao.getCars();
        }
        return carDao.getCars().stream().limit(i).toList();
    }
}