package com.zb.config.client.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2018/3/8 10:18
 *
 * @author zb
 */
@RestController
@RefreshScope
public class ClientEurekaController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/hello")
    public String hello() {
        return this.profile;
    }
}
