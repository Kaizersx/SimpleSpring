package simpletest.Mitsubishi;

import org.springframework.stereotype.Component;
import simpletest.Interfaces.Leg;


@Component
public class MitsuLeg implements Leg {

    @Override
    public void run() {
        System.out.println("Run by Mitsubishi");
    }
}
