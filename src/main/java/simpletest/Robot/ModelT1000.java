package simpletest.Robot;

import simpletest.Interfaces.Hand;
import simpletest.Interfaces.Head;
import simpletest.Interfaces.Leg;
import simpletest.Interfaces.Robot;

public class ModelT1000 implements Robot {

    //properties of bean

    private Hand hand;
    private Head head;
    private Leg leg;


    public ModelT1000(){


    }

    public ModelT1000(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {

        hand.catchSomething();
        head.calc();
        leg.run();
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing");
    }
}
