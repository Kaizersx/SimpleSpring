package simpletest.Mitsubishi;

import org.springframework.stereotype.Component;
import simpletest.Interfaces.Head;

@Component
public class MitsuHead implements Head {

    @Override
    public void calc() {
        System.out.println("calc by Mitsubishi");
    }
}
