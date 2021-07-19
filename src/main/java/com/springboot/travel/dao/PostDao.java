package com.springboot.travel.dao;

import com.springboot.travel.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PostDao extends JpaRepository<Post,Integer> , JpaSpecificationExecutor<Post> {
}
