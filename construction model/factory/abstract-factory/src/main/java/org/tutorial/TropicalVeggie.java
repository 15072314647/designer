package org.tutorial;

public class TropicalVeggie implements Veggie {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TropicalVeggie(String name){
        super();
        this.name = name;
    }

}
