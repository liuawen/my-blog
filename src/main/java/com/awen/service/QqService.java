package com.awen.service;

import com.awen.pojo.QQInfo;

/**
 * @author : Liu Awen
 * @create : 2020-03-15
 * @describe:
 */
public interface QqService {

    QQInfo save(QQInfo qqInfo);
    QQInfo findQQuser(String openid);
    void updateAvatar(String avatar, Long id);
}
