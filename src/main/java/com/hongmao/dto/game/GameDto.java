package com.hongmao.dto.game;

import lombok.Data;

import java.util.Date;


/**
 *
 * @author
 * @version
 */
@Data
public class GameDto{

    /**
     * 自增主键ID
     */
    private Integer id;

    /**
     * A方
     */
    private String gameA;

    /**
     * B方
     */
    private String gameB;

    /**
     * A赔率
     */
    private Double oddsA;

    /**
     * B赔率
     */
    private Double oddsB;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否有效 0无效 1有效
     */
    private byte flag;

    /**
     * 状态： 0 创建， 1 竞猜中， 3结束
     */
    private byte status;

}
