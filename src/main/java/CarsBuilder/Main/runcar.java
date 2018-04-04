package CarsBuilder.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runcar {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("SuperCarContext.xml");

        SuperCar superCar=(SuperCar) context.getBean("SC");

        superCar.drive();
    }
}
