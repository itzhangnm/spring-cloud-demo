package com.zb.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 2018/3/8 10:11
 *
 * @author zb
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEurekaApplication.class,args);
    }
}
