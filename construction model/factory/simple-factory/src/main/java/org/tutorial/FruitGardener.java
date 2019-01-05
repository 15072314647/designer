package org.tutorial;

public class FruitGardener {

    public static Fruit factory(String which) {
        switch (which) {
            case "apple":
                return new Apple();
            case "strawberry":
                return new Strawberry();
            case "grape":
                return new Grape();

            default:
                throw new RuntimeException("Bad fruit request");
        }
    }
}
