package com.tedu.mallserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tedu.mallserver.mapper.ItemMapper;
import com.tedu.mallserver.pojo.ItemDAO;
import com.tedu.mallserver.pojo.ItemInsertDTO;
import com.tedu.mallserver.service.ItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemMapper itemMapper;

    @Override
    public List selectByCateoryId(Integer categoryId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("category_id", categoryId);
        List list = itemMapper.selectList(queryWrapper);
        return list;
    }

    @Override
    public ItemDAO selectById(Integer id) {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",id);

        ItemDAO itemDAO = itemMapper.selectOne(queryWrapper);
        return itemDAO;
    }

    @Override
    public boolean insert(ItemInsertDTO itemInsertDTO) {
        ItemDAO itemDAO = new ItemDAO();
        BeanUtils.copyProperties(itemInsertDTO,itemDAO);
        int insertRow = itemMapper.insert(itemDAO);

        if(insertRow > 0)
            return true;
        else return false;
    }

}
