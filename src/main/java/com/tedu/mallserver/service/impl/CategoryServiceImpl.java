package com.tedu.mallserver.service.impl;

import com.tedu.mallserver.mapper.CategoryMapper;
import com.tedu.mallserver.pojo.CategoryDAO;
import com.tedu.mallserver.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    //从spring容器中取数据访问层对象
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<CategoryDAO> selectALL() {
        //查询条件
        List<CategoryDAO> list = categoryMapper.selectList(null);
        return list;
    }
}
