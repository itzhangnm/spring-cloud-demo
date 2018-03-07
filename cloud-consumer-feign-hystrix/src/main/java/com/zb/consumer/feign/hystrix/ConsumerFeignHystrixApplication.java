package com.zb.consumer.feign.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 2018/3/6 15:54
 *
 * @author zb
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class ConsumerFeignHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrixApplication.class,args);
    }
}
