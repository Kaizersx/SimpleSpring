package simpletest.Robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import simpletest.Interfaces.Hand;
import simpletest.Interfaces.Head;
import simpletest.Interfaces.Leg;
import simpletest.Interfaces.Robot;

import java.util.Properties;

@Component
public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

    private ColorStyle color;
    private  int year;
    private boolean soundEnabled;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public ModelT1000 model1(){return  new ModelT1000(ColorStyle.BLACK,1977,true);}

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model2(){return  new ModelT1000(ColorStyle.GREEN,1989,false);}

    @Override
    public void destroy() throws Exception {

        System.out.println("destroy interface");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("init interface");
    }



    public ModelT1000(){


    }

//    public ModelT1000(Hand hand, Head head, Leg leg) {
//        this.hand = hand;
//        this.head = head;
//        this.leg = leg;
//    }

    public ModelT1000(ColorStyle color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }


    public ModelT1000(Hand hand, Head head, Leg leg, ColorStyle color, int year, boolean soundEnabled) {
    //super(hand,head,leg);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

//    public Hand getHand() {
//        return hand;
//    }
//
//    public void setHand(Hand hand) {
//        this.hand = hand;
//    }
//
//    public Head getHead() {
//        return head;
//    }
//
//    public void setHead(Head head) {
//        this.head = head;
//    }
//
//
//    public Leg getLeg() {
//        return leg;
//    }
//
//    public void setLeg(Leg leg) {
//        this.leg = leg;
//    }

    public ColorStyle getColor() {
        return color;
    }

    public void setColor(ColorStyle color) {
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


    public  void destroyObject(){
        System.out.println("destroy object!");
    }

    public  void initObject(){
        System.out.println("init object");
    }

    @Override
    public void action() {

        getHand().catchSomething();
        getHead().calc();
        getLeg().run();

        System.out.println("color: " + color);
        System.out.println("year: "+year);
        System.out.println("can play sound: "+ soundEnabled+" \n");
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing");
    }
}
