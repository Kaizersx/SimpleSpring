package simpletest.Honda;

import simpletest.Interfaces.Hand;

public class HandHonda implements Hand {



    @Override
    public void catchSomething() {
        System.out.println("catch by Honda");
    }
}
