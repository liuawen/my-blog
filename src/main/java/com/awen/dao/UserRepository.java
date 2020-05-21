package com.awen.dao;

import com.awen.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Liu Awen
 * @create : 2020-02-08
 * @describe:
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
