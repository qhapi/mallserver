package com.tedu.mallserver.controller;

import com.tedu.mallserver.pojo.ItemDAO;
import com.tedu.mallserver.pojo.ItemInsertDTO;
import com.tedu.mallserver.pojo.ServerResult;
import com.tedu.mallserver.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    //http://localhost:9002/doc.html
    @RequestMapping("/item/selectByCategoryId")
    public ServerResult selectByCategoryId(Integer categoryId){
        List<ItemDAO> list = itemService.selectByCateoryId(categoryId);
        ServerResult serverResult = new ServerResult(0, "success", list);
        return serverResult;

    }

    @RequestMapping("/item/selectById")
    public ServerResult selectById(Integer Id){
        ItemDAO itemDAO = itemService.selectById(Id);
        ServerResult serverResult = new ServerResult(0, "success", itemDAO);
        return serverResult;
    }

    @RequestMapping("/item/insert")
    public ServerResult insert(ItemInsertDTO itemInsertDTO){
        boolean isSuccess = itemService.insert(itemInsertDTO);
        if(isSuccess){
            return new ServerResult(0,"success",null);
        }
        else return  new ServerResult(0,"false",null);
    }

}
