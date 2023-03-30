package com.test.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author -无心
 * @date 2023/1/4 21:53:35
 */
@Data
@Component
@ConfigurationProperties(prefix = "alipay")
public class AlipayConfig {
    private String appId;
    //应用私钥
    private String appPrivateKey;
    //阿里公钥
    private String alipayPublicKey;
    //阿里调用我们的地址【内网穿透】
    private String notifyUrl;

}
