package com.zb.eureka.provider.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 2018/3/5 16:04
 *
 * @author zb
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private Integer age;

}
