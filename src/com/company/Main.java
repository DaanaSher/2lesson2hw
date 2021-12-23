package com.company;

public class Main {

    public static void main(String[] args) {

        createFood("Cake").print();
        System.out.println("---");

        createFood("Burger").print();
        System.out.println("---");
        
        createFood("Pizza").print();
    }

    private static Food createFood(String food){
        switch (food){
            case "Cake":
                return new Cake("Cheesecake", "Sweet", 1);

            case "Burger":
                return new Burger("Cheeseburger", "Big");

            case "Pizza":
                return new Pizza("Pizza", "Pepperoni");

            default:
                return null;
        }
    }
}
