package com.zb.consumer.ribbon.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zb.consumer.ribbon.hystrix.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * 2018/3/6 17:01
 *
 * @author zb
 */
@Service
public class RibbonHystrixService {

    @Autowired
    private RestTemplate restTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);

    @HystrixCommand(fallbackMethod = "fallBack")
    public User findById(Long id){
        return restTemplate.getForObject("http://cloud-provider-user/" + id,User.class);
    }

    /**
     * hystrix fallback⽅法
     * @param id id
     * @return 默认的⽤户
     */
    public User fallBack(Long id){
        RibbonHystrixService.LOGGER.info("异常发⽣，进⼊fallback⽅法，接收的参数：id = {}", id);
                User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}
