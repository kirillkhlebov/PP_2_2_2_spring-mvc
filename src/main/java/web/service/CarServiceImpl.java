package web.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> listOfCars = new ArrayList<>();

    @Override
    public List<Car> getSomeCars(int count) {
        if (listOfCars.isEmpty()) {
            listOfCars.add(new Car("Lada", "Kalina", 2012));
            listOfCars.add(new Car("MercedesBenz", "E class", 1999));
            listOfCars.add(new Car("Porsche", "911", 1988));
            listOfCars.add(new Car("Chevrolet", "Corvette", 1972));
            listOfCars.add(new Car("BMW", "E33", 1989));
        }

        if(count > 5) {
            return listOfCars.subList(0, 5);
        }

        return listOfCars.subList(0, count);
    }
}
