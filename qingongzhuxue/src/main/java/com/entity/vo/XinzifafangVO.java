package com.entity.vo;

import com.entity.XinzifafangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 薪资发放
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinzifafang")
public class XinzifafangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 发放用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 发放薪资
     */

    @TableField(value = "xinzifafang_money")
    private Double xinzifafangMoney;


    /**
     * 发放时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 备注
     */

    @TableField(value = "xinzifafang_content")
    private String xinzifafangContent;


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
	 * 设置：发放用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：发放用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：发放薪资
	 */
    public Double getXinzifafangMoney() {
        return xinzifafangMoney;
    }


    /**
	 * 获取：发放薪资
	 */

    public void setXinzifafangMoney(Double xinzifafangMoney) {
        this.xinzifafangMoney = xinzifafangMoney;
    }
    /**
	 * 设置：发放时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发放时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：备注
	 */
    public String getXinzifafangContent() {
        return xinzifafangContent;
    }


    /**
	 * 获取：备注
	 */

    public void setXinzifafangContent(String xinzifafangContent) {
        this.xinzifafangContent = xinzifafangContent;
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
