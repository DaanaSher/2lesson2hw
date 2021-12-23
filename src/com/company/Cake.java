package com.company;

public class Cake extends Food{

    private String taste;
    private Integer howMany;

    public Cake(String name, String taste, Integer howMany) {
        super(name);
        this.taste = taste;
        this.howMany = howMany;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\nTaste: " + taste +
                "\nHow many: " + howMany);
    }
}
