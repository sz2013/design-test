package com.zjf.designtest.Decorator;

// 加糖装饰器
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2; // 糖价格 +0.2
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
