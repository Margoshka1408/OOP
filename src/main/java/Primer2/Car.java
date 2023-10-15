package Primer2;

public class Car implements Moving, RemoteControl {
    @Override
    public void move() {
        System.out.println("car is moving");
    }
    @Override
    public void use() {
        System.out.println("car is ingited");
    }

    @Override
    public void heatUp() {
        System.out.println("car is heating");
    }
}
