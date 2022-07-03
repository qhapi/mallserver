package com.tedu.mallserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tedu.mallserver.mapper.UserMapper;
import com.tedu.mallserver.pojo.UserDAO;
import com.tedu.mallserver.pojo.UserDTO;
import com.tedu.mallserver.pojo.UserPasswordDTO;
import com.tedu.mallserver.pojo.UserVO;
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
    public boolean changePassword(UserPasswordDTO userPasswordDTO) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",userPasswordDTO.getId());
        queryWrapper.eq("password",userPasswordDTO.getOldPassword());

        UserDAO userDAO = new UserDAO();
        userDAO.setPassword(userPasswordDTO.getNewPassword());
        int updateRow = userMapper.update(userDAO,queryWrapper);
        return updateRow >= 1;
    }

    @Override
    public Integer login(UserDTO userDTO) {


        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name",userDTO.getName());
        queryWrapper.eq("password",userDTO.getPassword());

        UserDAO userDAO = userMapper.selectOne(queryWrapper);

        if(userDAO != null)
            return userDAO.getId();
        return -1;
    }

    @Override
    public UserVO getUserInfo(Integer id) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",id);
        UserDAO userDAO = userMapper.selectOne(queryWrapper);

        UserVO userVO = new UserVO();
        userVO.setId(id);
        userVO.setCity(userDAO.getCity());
        userVO.setName(userDAO.getName());
        return userVO;
    }
}
