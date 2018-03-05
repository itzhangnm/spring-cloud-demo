package com.zb.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 2018/3/5 11:12
 *
 * @author zb
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication.class,args);
    }
}
