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


//        RobotConveyor t1000Conveyor=(RobotConveyor)context.getBean("t1000Conveyor");
//        RobotConveyor t1000Conveyor2=(RobotConveyor)context.getBean("t1000Conveyor2");
//
//        Robot terminator1= t1000Conveyor.createRobot();
//        Robot terminator2= t1000Conveyor2.createRobot();
//
//
//        terminator1.action();
//        terminator2.action();

        T1000Pool t1000Pool=(T1000Pool)context.getBean("t1000Pool");

        t1000Pool.action();

    }

}

