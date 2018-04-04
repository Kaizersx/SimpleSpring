package simpletest.Sony;

import simpletest.Interfaces.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("catch by Sony");
    }
}
