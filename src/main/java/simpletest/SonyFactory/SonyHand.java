package simpletest.SonyFactory;

import simpletest.Interfaces.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("catch by Sony");
    }
}
