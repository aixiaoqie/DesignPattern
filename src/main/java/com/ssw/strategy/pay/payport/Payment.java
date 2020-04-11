package com.ssw.strategy.pay.payport;

import com.ssw.strategy.pay.Result;

/**
 * 支付流程
 */
public abstract class Payment {
    public abstract String getName();

    protected abstract double queryBalance(String uid);

    /**
     * @param uid    用户Id
     * @param amount 支付金额
     * @return
     */
    public Result pay(String uid, double amount) {
        if (queryBalance(uid) < amount) {
            return new Result(500, "支付失败", "余额不足");
        } else {
            return new Result(200, "支付成功", "支付金额：" + amount);
        }
    }

}
