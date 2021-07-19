package com.springboot.travel.dao;

import com.springboot.travel.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ImageDao extends JpaRepository<Image,Integer> , JpaSpecificationExecutor<Image> {
}
