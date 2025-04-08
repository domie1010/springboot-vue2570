package com.entity.vo;

import com.entity.GangweiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 岗位信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gangwei")
public class GangweiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 岗位名称
     */

    @TableField(value = "gangwei_name")
    private String gangweiName;


    /**
     * 岗位类型
     */

    @TableField(value = "gangwei_types")
    private Integer gangweiTypes;


    /**
     * 岗位薪资
     */

    @TableField(value = "gangwei_money")
    private Double gangweiMoney;


    /**
     * 岗位要求
     */

    @TableField(value = "gangwei_yaoqiu")
    private String gangweiYaoqiu;


    /**
     * 工作时间/时
     */

    @TableField(value = "gangwei_shijian")
    private Integer gangweiShijian;


    /**
     * 岗位介绍
     */

    @TableField(value = "gangwei_content")
    private String gangweiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：岗位名称
	 */
    public String getGangweiName() {
        return gangweiName;
    }


    /**
	 * 获取：岗位名称
	 */

    public void setGangweiName(String gangweiName) {
        this.gangweiName = gangweiName;
    }
    /**
	 * 设置：岗位类型
	 */
    public Integer getGangweiTypes() {
        return gangweiTypes;
    }


    /**
	 * 获取：岗位类型
	 */

    public void setGangweiTypes(Integer gangweiTypes) {
        this.gangweiTypes = gangweiTypes;
    }
    /**
	 * 设置：岗位薪资
	 */
    public Double getGangweiMoney() {
        return gangweiMoney;
    }


    /**
	 * 获取：岗位薪资
	 */

    public void setGangweiMoney(Double gangweiMoney) {
        this.gangweiMoney = gangweiMoney;
    }
    /**
	 * 设置：岗位要求
	 */
    public String getGangweiYaoqiu() {
        return gangweiYaoqiu;
    }


    /**
	 * 获取：岗位要求
	 */

    public void setGangweiYaoqiu(String gangweiYaoqiu) {
        this.gangweiYaoqiu = gangweiYaoqiu;
    }
    /**
	 * 设置：工作时间/时
	 */
    public Integer getGangweiShijian() {
        return gangweiShijian;
    }


    /**
	 * 获取：工作时间/时
	 */

    public void setGangweiShijian(Integer gangweiShijian) {
        this.gangweiShijian = gangweiShijian;
    }
    /**
	 * 设置：岗位介绍
	 */
    public String getGangweiContent() {
        return gangweiContent;
    }


    /**
	 * 获取：岗位介绍
	 */

    public void setGangweiContent(String gangweiContent) {
        this.gangweiContent = gangweiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
