package CarsBuilder.Main;

import CarsBuilder.interfaces.Car;
import CarsBuilder.interfaces.SimpleCar.*;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SuperCar implements Car,InitializingBean, DisposableBean{

    Motor motor;
    Interior interior;
    HeadLight headLight;
    Tires tires;

    String name;
    int age;



    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public HeadLight getHeadLight() {
        return headLight;
    }

    public void setHeadLight(HeadLight headLight) {
        this.headLight = headLight;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public SuperCar() {
    }

    public SuperCar(Motor motor, Interior interior, HeadLight headLight, Tires tires) {
        this.motor = motor;
        this.interior = interior;
        this.headLight = headLight;
        this.tires = tires;
    }

    public SuperCar( Interior interior,Motor motor,Tires tires) {
        this.motor = motor;
        this.interior = interior;
        this.tires = tires;
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("destroy bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init bean with implement");
    }

    @Override
    public void drive() {
interior.getInterior();
motor.getMotor();
tires.getTires();
System.out.println("\n "+name);
    }
}
