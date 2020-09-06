package springStarter.carmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import springStarter.CarSegment;
import springStarter.carmanager.data.CarDatabase;
import springStarter.carmanager.display.CarDisplayer;

import java.util.List;
import java.util.stream.Collectors;

//@Lazy
@Component
public class CarService {

    //@Autowired
    private final CarDatabase carDatabase;
    //@Autowired
    private final CarDisplayer carDisplayer;


    public CarService(CarDatabase carDatabase,@Qualifier("carFullDataDisplayer") CarDisplayer carDisplayer) {
        this.carDatabase = carDatabase;
        this.carDisplayer = carDisplayer;
        System.out.println("tworze carservice");
    }

    public void displayCarsForSegment(CarSegment carSegment) {
        List<Car> carsForSegment = carDatabase.getAllCars().stream()
                .filter(car -> car.getCarSegment().equals(carSegment))
                .collect(Collectors.toList());

        carsForSegment.forEach(carDisplayer::displayCarData);
    }
}
