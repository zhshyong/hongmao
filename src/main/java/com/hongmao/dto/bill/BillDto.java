package com.hongmao.dto.bill;

import lombok.Data;

import java.util.Date;

/**
 * 下注账单实体类
 * @author
 * @version
 */
@Data
public class BillDto {

    private Integer id;

    private String userName;

    private String bet;

    private Integer amount;

    private Integer flag;

    private Integer status;

    private Double odds;

    private Date createTime;

    private Date updateTime;

    private String mark;
}
