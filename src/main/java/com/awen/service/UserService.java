package com.awen.service;

import com.awen.pojo.User;

/**
 * @author : Liu Awen
 * @create : 2020-02-08
 * @describe:
 */
public interface UserService {

    User checkUser(String username, String password);
}
