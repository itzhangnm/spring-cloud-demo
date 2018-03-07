package com.zb.consumer.feign.hystrix.entity;

import lombok.Data;


/**
 * 2018/3/6 15:55
 *
 * @author zb
 */
@Data
public class User {
    private Long id;
    private String username;
    private Integer age;
}
