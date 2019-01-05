package org.tutorial;

public class Grape implements Fruit {

    private Boolean seedless;

    @Override
    public void grow() {
        System.out.println("Grape is growing...");
    }

    @Override
    public void harvest() {
        System.out.println("Grape has been harvested.");
    }

    @Override
    public void plant() {
        System.out.println("Grape has been planted.");
    }

    public Boolean getSeedless() {
        return seedless;
    }

    public void setSeedless(Boolean seedless) {
        this.seedless = seedless;
    }

}
