package simpletest.Sony;

import simpletest.Interfaces.Leg;

public class SonyLeg implements Leg {

    @Override
    public void run() {
        System.out.println("Run by Sony");
    }
}
