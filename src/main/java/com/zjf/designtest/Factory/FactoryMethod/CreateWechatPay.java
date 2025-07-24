package com.zjf.designtest.Factory.FactoryMethod;

public class CreateWechatPay implements Factory {
    @Override
    public Payment createPayment() {
        return new WechatPay();
    }
}
