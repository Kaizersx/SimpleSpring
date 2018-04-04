package CarsBuilder.CarBrands.Base_Cars;

import CarsBuilder.interfaces.Car;

public class BMW_Base implements Car {

    @Override
    public void drive() {
        System.out.println("Drive a BaseBMW model");
    }
}
