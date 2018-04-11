package simpletest.Main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import simpletest.Interfaces.Robot;
import simpletest.Interfaces.RobotConveyor;
import simpletest.Robot.ModelT1000;
import simpletest.Robot.T1000Pool;


public class Start {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("All_context.xml");



        ModelT1000 modelT1000 =(ModelT1000) context.getBean("model1");
        ModelT1000 modelT10002 =(ModelT1000) context.getBean("model2");
        modelT1000.action();
        modelT10002.action();

         }

}

