package com.test.pojo;

import lombok.Data;

/**
 * @author -无心
 * @date 2023/1/4 21:52:29
 */
@Data
public class AliPay {
    private String traceNo; //我们的订单号
    private Double totalAmount; //总金额
    private String subject; //主题
    private String alipayTraceNo;//阿里的流水号
}
