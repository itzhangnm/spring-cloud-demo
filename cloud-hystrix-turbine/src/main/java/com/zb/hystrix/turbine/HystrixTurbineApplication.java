package com.zb.hystrix.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.HystrixHealthIndicator;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 2018/3/7 15:42
 *
 * @author zb
 */
@SpringBootApplication
@EnableTurbine
public class HystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbineApplication.class,args);
    }
}
