package simpletest.SonyFactory;

import simpletest.Interfaces.Leg;

public class SonyLeg implements Leg {

    @Override
    public void run() {
        System.out.println("Run by Sony");
    }
}
