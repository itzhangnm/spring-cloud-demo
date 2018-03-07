package com.zb.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 2018/3/7 11:13
 *
 * @author zb
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardApplication {
    /**
     * 测试步骤:
     * 1. 访问http://localhost:8030/hystrix.stream 可以查看Dashboar
     d
     * 2. 在上⾯的输⼊框填⼊: http://想监控的服务:端⼝/hystrix.stream进
     ⾏测试
     * 注意：⾸先要先调⽤⼀下想监控的服务的API，否则将会显示⼀个空的图表.
     * @author eacdy
     */
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoardApplication.class,args);
    }
}
