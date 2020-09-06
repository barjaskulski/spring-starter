package springStarter.carmanager.data;

import springStarter.carmanager.Car;

import java.util.Collection;

public interface CarDatabase {
    Collection<Car> getAllCars();
}
