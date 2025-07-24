package com.zjf.designtest.Factory.FactoryMethod;

public class CreateAlipay implements Factory {
    @Override
    public Payment createPayment() {
        return new Alipay();
    }
}
