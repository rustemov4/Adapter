package com.company;

public class CoffeeMachine implements makeCoffee{
    CoffeeAdapter coffeeAdapter;
    @Override
    public void make(String coffee) {
        if(coffee.equalsIgnoreCase("cappuccino") || coffee.equalsIgnoreCase("latte")){
            coffeeAdapter = new CoffeeAdapter(coffee);
            coffeeAdapter.make(coffee);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
