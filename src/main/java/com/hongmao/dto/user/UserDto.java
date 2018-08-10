package com.hongmao.dto.user;

import lombok.Data;

import java.util.Date;

/**
 * 用户实体类
 * @author zhsha
 * @version
 */
@Data
public class UserDto {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 备注字段
     */
    private String remark;
}
