package com.ssw.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付策略
 */
public class PayStrategy {
    /*
        支付方式
     */
    private static final String Ali_Pay = "Ali_Pay";
    private static final String JD_Pay = "JD_Pay";
    private static final String WX_Pay = "WX_Pay";
    private static final String Union_Pay = "Union_Pay";
    private static final String Default_Pay = Ali_Pay;

    private static Map<String, Payment> paymentMaps = new HashMap<String, Payment>();

    static {
        paymentMaps.put(Ali_Pay, new AliPay());
        paymentMaps.put(JD_Pay, new JDPay());
        paymentMaps.put(WX_Pay, new WXPay());
        paymentMaps.put(Union_Pay, new UnionPay());
        paymentMaps.put(Default_Pay, new AliPay());
    }

    public static Payment getPayment(String payKey) {
        if (!paymentMaps.containsKey(payKey)) {
            return paymentMaps.get(Default_Pay);
        }
        return paymentMaps.get(payKey);
    }

}
