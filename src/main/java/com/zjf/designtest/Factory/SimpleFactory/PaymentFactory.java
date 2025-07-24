package com.zjf.designtest.Factory.SimpleFactory;

// 支付工厂
// 违反开闭原则：当需要添加新产品时，必须修改工厂类的代码
// 工厂类职责过重：随着产品增多，工厂方法会变得复杂
class PaymentFactory {
    public static Payment createPayment(String paymentType) {
        switch (paymentType.toLowerCase()) {
            case "alipay":
                return new Alipay();
            case "wechatpay":
                return new WechatPay();
            default:
                throw new IllegalArgumentException("不支持的支付方式");
        }
    }
}
