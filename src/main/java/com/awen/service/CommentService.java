package com.awen.service;

import com.awen.pojo.Comment;

import java.util.List;

/**
 * @author : Liu Awen
 * @create : 2020-02-15
 * @describe:
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
