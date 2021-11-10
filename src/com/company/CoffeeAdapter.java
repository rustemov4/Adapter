package com.company;

public class CoffeeAdapter implements makeCoffee {
    Coffee coffee;
    public CoffeeAdapter(String type){
        if(type.equalsIgnoreCase("cappuccino")){
            coffee = new Cappuccino();
        }
        else if(type.equalsIgnoreCase("latte")){
            coffee = new Latte();
        }
    }
    @Override
    public void make(String coffee){
        if(coffee.equalsIgnoreCase("cappuccino")){
            this.coffee.makeCappuccino();
        }
        else if(coffee.equalsIgnoreCase("latte")){
            this.coffee.makeLatte();
        }
    }
}
