package com.ssw.strategy.pay;

import com.ssw.strategy.pay.payport.PayStrategy;
import com.ssw.strategy.pay.payport.Payment;

/**
 * 订单
 */
public class Order {
    private String uid;

    private String orderId;

    private double amount;//金额

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    /**
     * @param payKey 支付方式
     * @return
     */
    public Result pay(String payKey) {
        Payment payment = PayStrategy.getPayment(payKey);
        System.out.println("欢迎使用"+payment.getName());
        System.out.println("本次交易金额为："+ amount+",开始扣款。。。");
        return payment.pay(uid, amount);

    }
}
