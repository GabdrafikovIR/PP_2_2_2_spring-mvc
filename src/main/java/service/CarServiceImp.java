package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    private final List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add( new Car("Toyota", "LC300", 2024));
        cars.add( new Car("Honda", "Pilot", 2024));
        cars.add( new Car("Lexus", "GX460", 2024));
        cars.add( new Car("Acura", "MDX", 2024));
        cars.add( new Car("Subaru", "Forester", 2024));

    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
