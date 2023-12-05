package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements  CarService{

    @Override
    public List<Car> listCars(List<Car> list, int i) {
        return list.subList(0, i);
    }
}
