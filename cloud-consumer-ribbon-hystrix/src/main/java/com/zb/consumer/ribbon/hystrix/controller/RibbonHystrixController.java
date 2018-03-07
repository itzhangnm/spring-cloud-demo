package com.zb.consumer.ribbon.hystrix.controller;

import com.zb.consumer.ribbon.hystrix.entity.User;
import com.zb.consumer.ribbon.hystrix.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2018/3/6 17:06
 *
 * @author zb
 */
@RestController
public class RibbonHystrixController {
    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id){
        return this.ribbonHystrixService.findById(id);
    }
}
