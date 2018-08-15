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

    private Integer gameId;

    private String bet;

    private Integer amount;

    /**
     * 返回金额 计算为amount + amount*odds
     * 向上取整
     */
    private Integer backAmount;

    private Integer flag;

    private Integer status;

    private Double odds;

    private Date createTime;

    private Date updateTime;

    private String mark;
}
