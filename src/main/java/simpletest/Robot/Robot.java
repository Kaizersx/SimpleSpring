package simpletest.Robot;

import simpletest.Interfaces.Hand;
import simpletest.Interfaces.Head;
import simpletest.Interfaces.Leg;

public class Robot {

Hand hand;
Head head;
Leg leg;


    public Robot(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public void action (){

        hand.catchSomething();
        head.calc();
        leg.run();
    }


}
