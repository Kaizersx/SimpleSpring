package simpletest.Main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import simpletest.Robot.ModelT1000;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("All_context.xml");

        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");

        t1000.action();



    }

}


