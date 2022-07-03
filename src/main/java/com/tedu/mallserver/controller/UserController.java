package com.tedu.mallserver.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tedu.mallserver.pojo.ServerResult;
import com.tedu.mallserver.pojo.UserDAO;
import com.tedu.mallserver.pojo.UserDTO;
import com.tedu.mallserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/login")
    public ServerResult login(UserDTO userDTO){
        Integer dao = userService.login(userDTO);
        if(dao != -1) {

            ServerResult serverResult = new ServerResult(0, "success", dao);

            return serverResult;
        }
        else{
            ServerResult serverResult = new ServerResult(-1, "failed", dao);

            return serverResult;

        }

    }
}
