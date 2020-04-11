package com.ssw.strategy.pay;

public class Result {
    private String msg;
    private int code;
    private Object data;

    public Result(int code, String msg, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    @Override
    public String toString() {
        return "支付状态：" + code + "," + msg + ", 交易详情" + data;
    }
}
