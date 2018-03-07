package com.zb.consumer.feign.controller;

import com.zb.consumer.feign.entity.User;
import com.zb.consumer.feign.service.UserFeignClient;
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
public class FeignController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id){
        return userFeignClient.findByIdFeign(id);
    }
}
