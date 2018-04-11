package simpletest.Mitsubishi;

import org.springframework.stereotype.Component;
import simpletest.Interfaces.Hand;

@Component
public class MitsuHand implements Hand {
    @Override

    public void catchSomething() {

        System.out.println("catch by Mitsu");
    }


}
