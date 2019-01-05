package org.tutorial;

public class NorthenGardener implements Gardener {

    public Fruit createFruit(String name) {
        return new NorthernFruit(name);
    }

    public Veggie createVeggie(String name) {
        return new NorthernVeggie(name);
    }
}
