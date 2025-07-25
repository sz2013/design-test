package com.zjf.designtest.Decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2.0; // 基础咖啡价格
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
