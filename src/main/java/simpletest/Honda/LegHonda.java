package simpletest.Honda;

import simpletest.Interfaces.Leg;

public class LegHonda implements Leg {

    @Override
    public void run() {
        System.out.println("run by Honda");
    }
}
