package com.zjf.designtest.Decorator;

public class Client {
    public static void main(String[] args) {
        // 1. 基础咖啡
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.getCost() + "; Description: " + coffee.getDescription());

        // 2. 加牛奶的咖啡
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + milkCoffee.getCost() + "; Description: " + milkCoffee.getDescription());

        // 3. 加牛奶和糖的咖啡
        Coffee sweetMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: " + sweetMilkCoffee.getCost() + "; Description: " + sweetMilkCoffee.getDescription());
    }
}
