package com.springboot.travel.service;

import com.springboot.travel.entity.Post;

public interface PostService {
    // 获取一个帖子
    public String getPost(int id);

    void save(Post post);
}
