package com.company;

public class Pizza extends Food{

    private String pizzaName;

    public Pizza(String name, String pizzaName) {
        super(name);
        this.pizzaName = pizzaName;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\nPizza name: " + pizzaName);
    }
}
