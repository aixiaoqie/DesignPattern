package com.ssw.strategy.pay.payport;

/**
 * 微信支付
 */
public class WXPay extends Payment {
    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 150;
    }
}
