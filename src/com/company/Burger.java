package com.company;

public class Burger extends Food{

    private String size;

    public Burger(String name, String size) {
        super(name);
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\nSize: " + size);
    }
}
