package org.tutorial;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        NorthenGardener northen = new NorthenGardener();
        northen.createFruit("fruit");
        northen.createVeggie("veggie");
        TropicalGardener tropical = new TropicalGardener();
        tropical.createFruit("fruit");
        tropical.createVeggie("veggie");

    }
}
