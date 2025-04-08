package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 薪资发放
 *
 * @author 
 * @email
 */
@TableName("xinzifafang")
public class XinzifafangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinzifafangEntity() {

	}

	public XinzifafangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

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
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Xinzifafang{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", xinzifafangMoney=" + xinzifafangMoney +
            ", insertTime=" + insertTime +
            ", xinzifafangContent=" + xinzifafangContent +
            ", createTime=" + createTime +
        "}";
    }
}
