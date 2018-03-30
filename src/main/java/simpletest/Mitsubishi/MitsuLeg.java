package simpletest.Mitsubishi;

import simpletest.Interfaces.Leg;

public class MitsuLeg implements Leg {

    @Override
    public void run() {
        System.out.println("Run by Mitsubishi");
    }
}
