package springStarter.carmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springStarter.CarSegment;
import springStarter.carmanager.data.CarDatabase;
import springStarter.carmanager.display.CarDisplayer;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    @Autowired
    private CarDatabase carDatabase;
    @Autowired
    @Qualifier("carFullDataDisplayer")
    private CarDisplayer carDisplayer;


//    public CarService(CarDatabase carDatabase, CarDisplayer carDisplayer) {
//        this.carDatabase = carDatabase;
//        this.carDisplayer = carDisplayer;
//    }

    public void displayCarsForSegment(CarSegment carSegment) {
        List<Car> carsForSegment = carDatabase.getAllCars().stream()
                .filter(car -> car.getCarSegment().equals(carSegment))
                .collect(Collectors.toList());

        carsForSegment.forEach(carDisplayer::displayCarData);
    }
}
