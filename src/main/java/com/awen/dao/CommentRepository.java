package com.awen.dao;

import com.awen.pojo.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author : Liu Awen
 * @create : 2020-02-15
 * @describe:
 */
public interface CommentRepository extends JpaRepository<Comment,Long> {


    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
