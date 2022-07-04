package com.tedu.mallserver.service;

import com.tedu.mallserver.pojo.UserDAO;
import com.tedu.mallserver.pojo.UserDTO;
import com.tedu.mallserver.pojo.UserPasswordDTO;
import com.tedu.mallserver.pojo.UserVO;

public interface UserService {

    /**
     *
     * @param userPasswordDTO
     * @return true修改成功 false失败
     */
    public boolean changePassword(UserPasswordDTO userPasswordDTO);

    /**
     *
     * @param userDTO
     * @return
     */
    public Integer login(UserDTO userDTO);

    /**
     *
     * @param id
     * @return
     */
    public UserVO getUserInfo(Integer id);

    /**
     * 注册
     * @param userDTO
     * @return 用户编号
     */
    public Integer register(UserDTO userDTO);
}
