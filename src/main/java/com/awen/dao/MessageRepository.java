package com.awen.dao;

import com.awen.pojo.Comment;
import com.awen.pojo.Message;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author : Liu Awen
 * @create : 2020-03-18
 * @describe:
 */
public interface MessageRepository  extends JpaRepository<Message,Long>, JpaSpecificationExecutor<Message> {

}
