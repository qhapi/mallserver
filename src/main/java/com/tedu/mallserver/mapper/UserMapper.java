package com.tedu.mallserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tedu.mallserver.pojo.UserDAO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserDAO> {
}
