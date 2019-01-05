package org.tutorial;

public class NorthernFruit implements Fruit {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NorthernFruit(String name){
        super();
        this.name = name;
    }

}
