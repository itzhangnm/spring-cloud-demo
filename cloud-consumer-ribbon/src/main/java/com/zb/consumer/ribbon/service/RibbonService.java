package com.zb.consumer.ribbon.service;

import com.zb.consumer.ribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 2018/3/5 22:21
 *
 * @author zb
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id){
        return this.restTemplate.getForObject("http://cloud-provider-user/" + id,User.class);
    }
}
