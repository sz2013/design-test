package com.zjf.designtest.Factory.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Factory factory = new CreateAlipay();
        Payment payment = factory.createPayment();
        payment.pay(100.0);

        factory = new CreateWechatPay();
        payment = factory.createPayment();
        payment.pay(200.0);
    }
}
