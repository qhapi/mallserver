package com.tedu.mallserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tedu.mallserver.mapper.UserMapper;
import com.tedu.mallserver.pojo.UserDAO;
import com.tedu.mallserver.pojo.UserDTO;
import com.tedu.mallserver.service.UserService;
import org.apache.catalina.User;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Integer login(UserDTO userDTO) {


        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name",userDTO.getName());
        queryWrapper.eq("password",userDTO.getPassword());

        UserDAO userDAO = userMapper.selectOne(queryWrapper);

        if(userDAO != null){
            return userDAO.getId();
        }

        return -1;
    }
}
