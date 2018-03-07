package com.zb.consumer.feign.hystrix.controller;

import com.zb.consumer.feign.hystrix.entity.User;
import com.zb.consumer.feign.hystrix.service.UserFeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2018/3/6 16:01
 *
 * @author zb
 */
@RestController
public class FeignHystrixController {
    @Autowired
    private UserFeignHystrixClient userFeignHystrixClient;

    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id){
        return userFeignHystrixClient.findByIdFeign(id);
    }
}
