package springStarter;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("springStarter.carmanager")
public class CarManagerConfiguration {
//    @Bean
//    @Primary //------------ spring bierze tego w pierwszej kolejnosci
//    @Profile({"ford"})
//    public CarDatabase fordDatabase(){
//        return new FordDatabase();
//    }
//
//    @Bean
//    @Profile({"fso"})
//    public CarDatabase fsoDatabase(){         >>>niepotrzebne przy Componentskanie<<<
//        return new FSODatabase();
//    }
//
//    @Bean
//    public CarDisplayer carDisplayer(){
//        return new CarFullDataDisplayer();
//    }
//
//    @Bean
//    public CarService carService( CarDatabase carDatabase, CarDisplayer carDisplayer){ //------------@Qualifier("fsoDatabase")
//        return new CarService(carDatabase,carDisplayer);
}

