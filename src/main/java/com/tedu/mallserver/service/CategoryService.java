package com.tedu.mallserver.service;

import com.tedu.mallserver.pojo.CategoryDAO;

import java.util.List;

// 商品分类的业务层
public interface CategoryService {
    public List<CategoryDAO> selectALL();
}
