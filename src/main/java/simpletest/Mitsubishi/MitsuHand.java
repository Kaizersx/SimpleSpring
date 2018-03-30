package simpletest.Mitsubishi;

import simpletest.Interfaces.Hand;

public class MitsuHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("catch by Mitsu");
    }
}
