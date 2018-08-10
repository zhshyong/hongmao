package com.hongmao.service.impl;

import com.hongmao.common.enums.Message;
import com.hongmao.common.util.MD5Utils;
import com.hongmao.dao.user.UserDao;
import com.hongmao.dto.user.UserDto;
import com.hongmao.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zhsha
 * @version
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public Map<String, String> loginUser(String userName, String passWord) {
        //查询出用户信息
        UserDto userDto = userDao.queryUserInfoByUserName(userName);
        Map<String, String> resultMap = new HashMap<>();
        String newPassWord = MD5Utils.getMD5ecode(passWord);
        logger.debug("newPassWord-----------" + newPassWord);
        logger.debug("userDto:-------" + userDto);
        if (userDto.getPassword().equals(newPassWord)) {
            resultMap.put("code", Message.LOGIN_SUCCESS.getCode());
            resultMap.put("msg", Message.LOGIN_SUCCESS.getMessage());
            return resultMap;
        }
        resultMap.put("code", Message.LOGIN_FAILURE.getCode());
        resultMap.put("msg", Message.LOGIN_FAILURE.getMessage());
        return resultMap;
    }
}
