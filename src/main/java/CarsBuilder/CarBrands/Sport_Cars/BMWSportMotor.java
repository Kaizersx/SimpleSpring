package CarsBuilder.CarBrands.Sport_Cars;


import CarsBuilder.interfaces.SimpleCar.Motor;

public class BMWSportMotor implements Motor{

    @Override
    public void getMotor() {
        System.out.println( "Power motor by BMW sport");
    }
}
