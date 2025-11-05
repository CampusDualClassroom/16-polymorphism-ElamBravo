package com.campusdual.classroom;

public class Tractor implements IMachine{

    protected int horsePower;

    public Tractor(int hp) {

        this.horsePower = hp;
    }

    @Override
    public void start() {
        System.out.println("The tractor of " + horsePower + "horse is this on");
    }

    @Override
    public void stop() {
        System.out.println("The tractor of " + horsePower + "horse is this off");
    }

    @Override
    public void maintenance() {
        System.out.println("The tractor of " + horsePower + "horse is this maintenance");
    }

    @Override
    public void mantenance() {

    }

    public void forward() {
        System.out.println("El tractor avanza");
    }

    public void backward() {
        System.out.println("El tractor retrocede");
    }

}
