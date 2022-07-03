package com.tedu.mallserver.service;

import com.tedu.mallserver.pojo.ItemDAO;
import io.swagger.models.auth.In;
import java.util.List;
public interface ItemService {
    public List<ItemDAO> selectByCateoryId(Integer categoryId);
    ItemDAO selectById(Integer id);
}
