package sdaTask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;


public class SdaTaskConfiguration {
    @Bean
    public SdaService sdaService(PeopleProvider peopleProvider){
        return new SdaService(peopleProvider);
    }

    @Bean
    @Primary
    @Order(2)
    public PeopleProvider nameProvider(){
        return new NameProvider();
    }

    @Bean
    public PeopleProvider surnameProvider(){
        return new SurnameProvider();
    }
}
