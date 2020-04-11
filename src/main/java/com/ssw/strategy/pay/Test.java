package com.ssw.strategy.pay;

/**
 * 演示用户订单支付场景
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1","110000",235.58);
        Result result = order.pay("JD_Pay");
        System.out.println(result);

    }
}
