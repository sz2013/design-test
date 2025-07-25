package com.zjf.designtest.Decorator;

// 加牛奶装饰器
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5; // 牛奶价格 +0.5
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
