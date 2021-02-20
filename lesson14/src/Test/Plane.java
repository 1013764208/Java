package Test;

public class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void step() {
        System.out.println("step");
    }
}
