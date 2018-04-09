package simpletest.Robot;

import simpletest.Interfaces.Robot;
import simpletest.Interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

public class T1000Pool implements RobotPool {

    //private Collection<Robot>robotCollection;

private Map<String,Robot>RobotCollection;

    public T1000Pool() {

    }

    public T1000Pool(Map<String, Robot> robotCollection) {
        RobotCollection = robotCollection;
    }

    //    @Override
//    public Collection<Robot> getRobotCollection() {
//        return null;
//    }

    
//    public void setRobotCollection(Collection<Robot> robotCollection) {
//        this.robotCollection = robotCollection;
//    }




    @Override
    public Map<String, Robot> getRobotCollection() {
        return null;
    }

//    public void action(){
//
//
//    for (Robot robot:robotCollection)
//
//    {
//    robot.action();
//
//    }

    public void action(){

        for (Map.Entry<String, Robot> entry : RobotCollection.entrySet())

        {
            System.out.println(entry.getKey());
            entry.getValue().action();
        }
        
        
    }
    
    
    
}



