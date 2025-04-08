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
 * 部门管理员
 *
 * @author 
 * @email
 */
@TableName("bumenguanli")
public class BumenguanliEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BumenguanliEntity() {

	}

	public BumenguanliEntity(T t) {
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
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 部门管理员姓名
     */
    @TableField(value = "bumenguanli_name")

    private String bumenguanliName;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 身份证号
     */
    @TableField(value = "bumenguanli_id_number")

    private String bumenguanliIdNumber;


    /**
     * 手机号
     */
    @TableField(value = "bumenguanli_phone")

    private String bumenguanliPhone;


    /**
     * 邮箱
     */
    @TableField(value = "bumenguanli_email")

    private String bumenguanliEmail;


    /**
     * 照片
     */
    @TableField(value = "bumenguanli_photo")

    private String bumenguanliPhoto;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：部门管理员姓名
	 */
    public String getBumenguanliName() {
        return bumenguanliName;
    }


    /**
	 * 获取：部门管理员姓名
	 */

    public void setBumenguanliName(String bumenguanliName) {
        this.bumenguanliName = bumenguanliName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：身份证号
	 */
    public String getBumenguanliIdNumber() {
        return bumenguanliIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setBumenguanliIdNumber(String bumenguanliIdNumber) {
        this.bumenguanliIdNumber = bumenguanliIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getBumenguanliPhone() {
        return bumenguanliPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setBumenguanliPhone(String bumenguanliPhone) {
        this.bumenguanliPhone = bumenguanliPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getBumenguanliEmail() {
        return bumenguanliEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setBumenguanliEmail(String bumenguanliEmail) {
        this.bumenguanliEmail = bumenguanliEmail;
    }
    /**
	 * 设置：照片
	 */
    public String getBumenguanliPhoto() {
        return bumenguanliPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setBumenguanliPhoto(String bumenguanliPhoto) {
        this.bumenguanliPhoto = bumenguanliPhoto;
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
        return "Bumenguanli{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", bumenguanliName=" + bumenguanliName +
            ", sexTypes=" + sexTypes +
            ", bumenguanliIdNumber=" + bumenguanliIdNumber +
            ", bumenguanliPhone=" + bumenguanliPhone +
            ", bumenguanliEmail=" + bumenguanliEmail +
            ", bumenguanliPhoto=" + bumenguanliPhoto +
            ", createTime=" + createTime +
        "}";
    }
}
