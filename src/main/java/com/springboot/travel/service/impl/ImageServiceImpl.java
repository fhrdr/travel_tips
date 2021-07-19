package com.springboot.travel.service.impl;

import com.springboot.travel.dao.ImageDao;
import com.springboot.travel.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
    // 注入
    @Autowired
    private ImageDao imageDao;

    // 获取图片地址
    @Override
    public String getImagePath(int id) {
        return imageDao.getById(id).getPath();
    }
}
