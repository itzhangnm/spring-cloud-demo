package com.zb.eureka.provider.dao;

import com.zb.eureka.provider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 2018/3/5 16:03
 *
 * @author zb
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
