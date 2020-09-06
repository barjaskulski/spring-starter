package springStarter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springStarter.carmanager.CarService;

public class CarManagerApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarManagerConfiguration.class);
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
//
//        CarDatabase carDatabase = new FordDatabase();
//        CarDisplayer carDisplayer = new CarFullDataDisplayer();

        CarService carService = applicationContext.getBean(CarService.class);

        System.out.println("Look for all cars from B segment");
        carService.displayCarsForSegment(CarSegment.B);
    }
}
