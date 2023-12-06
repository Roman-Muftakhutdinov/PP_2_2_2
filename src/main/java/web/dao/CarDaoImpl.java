package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Skoda", "Superb", 2012));
        cars.add(new Car("Audi", "Q8", 2018));
        cars.add(new Car("Porsche","Cayenne GTS", 2014));
        cars.add(new Car("BMW", "X5", 2018));
        cars.add(new Car("Volvo", "V90",2019));
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> listCars(int i) {
        if (i > 5) {
            i = 5;
        }
        return cars.subList(0, i);
    }
}
