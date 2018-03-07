package com.zb.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2018/3/7 22:18
 *  这边的@RefreshScope注解不能少，否则即使调⽤/refresh，配置也不会刷新
 * @author zb
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${profile}")
    private String profile;
    @GetMapping("/hello")
    public String hello() {
        return this.profile;
    }
}
