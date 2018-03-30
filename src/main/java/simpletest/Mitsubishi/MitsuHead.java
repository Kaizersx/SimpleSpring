package simpletest.Mitsubishi;

import simpletest.Interfaces.Head;

public class MitsuHead implements Head {

    @Override
    public void calc() {
        System.out.println("calc by Mitsubishi");
    }
}
