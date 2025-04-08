package com.entity.model;

import com.entity.BumenguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 部门管理员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BumenguanliModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 部门管理员姓名
     */
    private String bumenguanliName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 身份证号
     */
    private String bumenguanliIdNumber;


    /**
     * 手机号
     */
    private String bumenguanliPhone;


    /**
     * 邮箱
     */
    private String bumenguanliEmail;


    /**
     * 照片
     */
    private String bumenguanliPhoto;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：部门管理员姓名
	 */
    public String getBumenguanliName() {
        return bumenguanliName;
    }


    /**
	 * 设置：部门管理员姓名
	 */
    public void setBumenguanliName(String bumenguanliName) {
        this.bumenguanliName = bumenguanliName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：身份证号
	 */
    public String getBumenguanliIdNumber() {
        return bumenguanliIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setBumenguanliIdNumber(String bumenguanliIdNumber) {
        this.bumenguanliIdNumber = bumenguanliIdNumber;
    }
    /**
	 * 获取：手机号
	 */
    public String getBumenguanliPhone() {
        return bumenguanliPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setBumenguanliPhone(String bumenguanliPhone) {
        this.bumenguanliPhone = bumenguanliPhone;
    }
    /**
	 * 获取：邮箱
	 */
    public String getBumenguanliEmail() {
        return bumenguanliEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setBumenguanliEmail(String bumenguanliEmail) {
        this.bumenguanliEmail = bumenguanliEmail;
    }
    /**
	 * 获取：照片
	 */
    public String getBumenguanliPhoto() {
        return bumenguanliPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setBumenguanliPhoto(String bumenguanliPhoto) {
        this.bumenguanliPhoto = bumenguanliPhoto;
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
