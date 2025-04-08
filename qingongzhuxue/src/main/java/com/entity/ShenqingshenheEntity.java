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
 * 申请审核
 *
 * @author 
 * @email
 */
@TableName("shenqingshenhe")
public class ShenqingshenheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShenqingshenheEntity() {

	}

	public ShenqingshenheEntity(T t) {
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
     * 申请用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申请岗位
     */
    @TableField(value = "gangwei_id")

    private Integer gangweiId;


    /**
     * 申请类型
     */
    @TableField(value = "kaohepingjia_types")

    private Integer kaohepingjiaTypes;


    /**
     * 申请文件
     */
    @TableField(value = "shenqingshenhe_file")

    private String shenqingshenheFile;


    /**
     * 审核状态
     */
    @TableField(value = "shenqingshenhe_types")

    private Integer shenqingshenheTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：申请用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：申请用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：申请岗位
	 */
    public Integer getGangweiId() {
        return gangweiId;
    }


    /**
	 * 获取：申请岗位
	 */

    public void setGangweiId(Integer gangweiId) {
        this.gangweiId = gangweiId;
    }
    /**
	 * 设置：申请类型
	 */
    public Integer getKaohepingjiaTypes() {
        return kaohepingjiaTypes;
    }


    /**
	 * 获取：申请类型
	 */

    public void setKaohepingjiaTypes(Integer kaohepingjiaTypes) {
        this.kaohepingjiaTypes = kaohepingjiaTypes;
    }
    /**
	 * 设置：申请文件
	 */
    public String getShenqingshenheFile() {
        return shenqingshenheFile;
    }


    /**
	 * 获取：申请文件
	 */

    public void setShenqingshenheFile(String shenqingshenheFile) {
        this.shenqingshenheFile = shenqingshenheFile;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getShenqingshenheTypes() {
        return shenqingshenheTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setShenqingshenheTypes(Integer shenqingshenheTypes) {
        this.shenqingshenheTypes = shenqingshenheTypes;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Shenqingshenhe{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", gangweiId=" + gangweiId +
            ", kaohepingjiaTypes=" + kaohepingjiaTypes +
            ", shenqingshenheFile=" + shenqingshenheFile +
            ", shenqingshenheTypes=" + shenqingshenheTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
