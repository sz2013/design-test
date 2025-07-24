package com.zjf.designtest.Factory.SimpleFactory;

// 客户端代码
public class Client {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.createPayment("alipay");
        payment.pay(100.0);

        payment = PaymentFactory.createPayment("wechatpay");
        payment.pay(200.0);
    }
}
