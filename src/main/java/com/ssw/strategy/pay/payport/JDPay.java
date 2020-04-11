package com.ssw.strategy.pay.payport;

/**
 * 京东白条支付
 */
public class JDPay extends Payment {
    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 300;
    }
}