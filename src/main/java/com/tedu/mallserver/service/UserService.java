package com.tedu.mallserver.service;

import com.tedu.mallserver.pojo.UserDAO;
import com.tedu.mallserver.pojo.UserDTO;
import com.tedu.mallserver.pojo.UserVO;

public interface UserService {

    public Integer login(UserDTO userDTO);
    public UserVO getUserInfo(Integer id);
}
