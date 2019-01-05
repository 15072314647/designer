package org.tutorial;

public class NorthernVeggie implements Veggie {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NorthernVeggie(String name){
        super();
        this.name = name;
    }

}
