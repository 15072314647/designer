package org.tutorial;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        FruitGardener apple = new AppleGardener();
        apple.factory();
        FruitGardener grape = new GrapeGardener();
        grape.factory();
        FruitGardener strawberry = new StrawberryGardener();
        strawberry.factory();
    }
}
