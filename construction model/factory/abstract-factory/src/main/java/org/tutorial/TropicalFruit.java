package org.tutorial;

public class TropicalFruit implements Fruit {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TropicalFruit(String name){
        super();
        this.name = name;
    }

}
