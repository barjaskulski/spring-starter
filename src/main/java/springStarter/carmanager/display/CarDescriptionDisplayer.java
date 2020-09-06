package springStarter.carmanager.display;

import org.springframework.stereotype.Component;
import springStarter.carmanager.Car;

@Component
public class CarDescriptionDisplayer implements CarDisplayer{

    public void displayCarData(Car car) {
        System.out.println(car.getDescription());
    }
}
