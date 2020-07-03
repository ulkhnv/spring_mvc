package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("toyota","camry",100));
        cars.add(new Car("toyota","corolla",200));
        cars.add(new Car("toyota","supra",300));
        return cars;
    }
}
