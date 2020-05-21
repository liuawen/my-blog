package com.awen.service;

import com.awen.dao.QqRepository;
import com.awen.pojo.QQInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Liu Awen
 * @create : 2020-03-15 - 13:58
 * @describe:
 */
@Service
public class QqServiceImpl implements QqService {

    @Autowired
    private QqRepository qqRepository;

    @Transactional
    @Override
    public QQInfo save(QQInfo qqInfo) {
        QQInfo info = qqRepository.save(qqInfo);
        return qqInfo;
    }

    @Override
    public QQInfo findQQuser(String openid) {
        QQInfo byOpenid = qqRepository.findQQuser(openid);
        return byOpenid;
    }

    @Override
    public void updateAvatar(String avatar, Long id) {
        qqRepository.updateAvatar(avatar,id);
    }
}
