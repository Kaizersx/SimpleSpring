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


    private String color;
    private  int year;
    private boolean soundEnabled;

    public ModelT1000(){


    }

    public ModelT1000(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }


    public ModelT1000(Hand hand, Head head, Leg leg, String color, int year, boolean soundEnabled) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void action() {

        hand.catchSomething();
        head.calc();
        leg.run();

        System.out.println("color: " + color);
        System.out.println("year: "+year);
        System.out.println("can play sound: "+ soundEnabled);
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing");
    }
}
