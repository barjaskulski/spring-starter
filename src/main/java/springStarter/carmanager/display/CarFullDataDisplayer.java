package springStarter.carmanager.display;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import springStarter.carmanager.Car;

@Lazy
@Component
public class CarFullDataDisplayer implements CarDisplayer{

    public CarFullDataDisplayer(){
        System.out.println("tworze displayera");
    }

    public void displayCarData(Car car) {
        System.out.println("----------" + car.getModelName() + "----------");
        System.out.println("\tSince " + car.getIntroduced());
        System.out.println("\tPower: " + car.getPower());
        System.out.println("\tEngine: " + car.getEngine());
        System.out.println("\t" + car.getDescription());
    }
}
