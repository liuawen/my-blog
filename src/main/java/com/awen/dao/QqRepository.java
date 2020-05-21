package com.awen.dao;

import com.awen.pojo.Comment;
import com.awen.pojo.QQInfo;
import com.awen.pojo.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Liu Awen
 * @create : 2020-03-15
 * @describe:
 */
public interface QqRepository extends JpaRepository<QQInfo,Long> {

    @Query("select q from QQInfo q where q.openid = ?1")
    QQInfo findQQuser(String openid);

    @Transactional
    @Modifying
    @Query("update QQInfo q set q.avatar = ?1 where q.id = ?2")
    void updateAvatar(String avatar, Long id);
}
