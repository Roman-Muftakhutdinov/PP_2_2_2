package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {


    @GetMapping("/cars")
    public String getCars (@RequestParam(value = "count",defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Skoda", "Superb", 2012));
        cars.add(new Car("Audi", "Q8", 2018));
        cars.add(new Car("Porsche","Cayenne GTS", 2014));
        cars.add(new Car("BMW", "X5", 2018));
        cars.add(new Car("Volvo", "V90",2019));

        CarServiceImpl carService = new CarServiceImpl();
//        List<Car> newList = new ArrayList<>();
//        try {
//             newList = carService.listCars(cars,count);
//            } catch (Exception e) {
//                count = 5;
//                newList = carService.listCars(cars,count);
//            }
        if (count > 5) {
            count = 5;
        }


        model.addAttribute("newList", carService.listCars(cars,count));

        return "cars";
    }


}
