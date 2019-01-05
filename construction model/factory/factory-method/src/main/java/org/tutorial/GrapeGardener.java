package org.tutorial;

public class GrapeGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Grape();
    }

}
