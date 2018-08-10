package com.hongmao.dao.user;

import com.hongmao.dto.user.UserDto;

/**
 * 操作用户
 * @author zhsha
 * @version
 */
public interface UserDao {

    /**
     * 根据用户名查询用户信息
     * @param userName 用户名
     * @return
     */
    UserDto queryUserInfoByUserName(String userName);
}
