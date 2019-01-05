package org.tutorial;

public class StrawberryGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Strawberry();
    }

}
