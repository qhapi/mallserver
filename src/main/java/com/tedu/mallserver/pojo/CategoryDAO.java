package com.tedu.mallserver.pojo;
//database access Object
//对应category表

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("category")
public class CategoryDAO {
    Integer id;
    String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
