package sdaTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SdaTaskApplication {
    public static void main(String[] args) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SDAcontext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SdaTaskConfiguration.class);

        //SdaService sdaService = new SdaService();
        //SdaService sdaService = applicationContext.getBean("sdaHello", SdaService.class);
        SdaService sdaService = applicationContext.getBean(SdaService.class);
//        String[] beanList = applicationContext.getBeanDefinitionNames();
//        SdaService sdaService2 = applicationContext.getBean(String.valueOf(applicationContext.getBeanDefinitionNames()),SdaService.class);
        sdaService.run();
    }
}
