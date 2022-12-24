package tajayouti.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tajayouti.example.service.IMetier;
import tajayouti.example.service.SecurityContext;

public class Application {
    public static void main(String[] args) {

        try {
            SecurityContext.authenticate("root","123",new String[]{"USER","ADMIN"});
            //SecurityContext.authenticate("rot","123",new String[]{"USER","ADMIN"});
            //SecurityContext.authenticate("root","123",new String[]{"USER"});

            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
            IMetier metier = applicationContext.getBean(IMetier.class);
            System.out.println("*******************");
            System.out.println(metier.getClass().getName());
            System.out.println("*******************");

            metier.process();
            System.out.println(metier.compute());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Configuration
    @ComponentScan(value = {"tajayouti.example"})
    public class MyConfig{

    }
    }

