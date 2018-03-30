package simpletest.SonyFactory;

import simpletest.Interfaces.Head;

public class SonyHead implements Head {

    @Override
    public void calc() {
        System.out.println("Calc by Sony");
    }
}
