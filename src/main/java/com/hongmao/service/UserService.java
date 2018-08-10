package com.hongmao.service;

import java.util.Map;

/**
 * User服务接口
 * @author zhsha
 * @version
 */
public interface UserService {

    /**
     * 登陆匹配方法
     * @param userName
     * @param passWord
     * @return
     */
    public Map<String, String> loginUser(String userName, String passWord);
}
