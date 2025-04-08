package com.entity.model;

import com.entity.GangweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 岗位信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GangweiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 岗位名称
     */
    private String gangweiName;


    /**
     * 岗位类型
     */
    private Integer gangweiTypes;


    /**
     * 岗位薪资
     */
    private Double gangweiMoney;


    /**
     * 岗位要求
     */
    private String gangweiYaoqiu;


    /**
     * 工作时间/时
     */
    private Integer gangweiShijian;


    /**
     * 岗位介绍
     */
    private String gangweiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：岗位名称
	 */
    public String getGangweiName() {
        return gangweiName;
    }


    /**
	 * 设置：岗位名称
	 */
    public void setGangweiName(String gangweiName) {
        this.gangweiName = gangweiName;
    }
    /**
	 * 获取：岗位类型
	 */
    public Integer getGangweiTypes() {
        return gangweiTypes;
    }


    /**
	 * 设置：岗位类型
	 */
    public void setGangweiTypes(Integer gangweiTypes) {
        this.gangweiTypes = gangweiTypes;
    }
    /**
	 * 获取：岗位薪资
	 */
    public Double getGangweiMoney() {
        return gangweiMoney;
    }


    /**
	 * 设置：岗位薪资
	 */
    public void setGangweiMoney(Double gangweiMoney) {
        this.gangweiMoney = gangweiMoney;
    }
    /**
	 * 获取：岗位要求
	 */
    public String getGangweiYaoqiu() {
        return gangweiYaoqiu;
    }


    /**
	 * 设置：岗位要求
	 */
    public void setGangweiYaoqiu(String gangweiYaoqiu) {
        this.gangweiYaoqiu = gangweiYaoqiu;
    }
    /**
	 * 获取：工作时间/时
	 */
    public Integer getGangweiShijian() {
        return gangweiShijian;
    }


    /**
	 * 设置：工作时间/时
	 */
    public void setGangweiShijian(Integer gangweiShijian) {
        this.gangweiShijian = gangweiShijian;
    }
    /**
	 * 获取：岗位介绍
	 */
    public String getGangweiContent() {
        return gangweiContent;
    }


    /**
	 * 设置：岗位介绍
	 */
    public void setGangweiContent(String gangweiContent) {
        this.gangweiContent = gangweiContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
