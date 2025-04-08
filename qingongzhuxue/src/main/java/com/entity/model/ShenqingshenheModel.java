package com.entity.model;

import com.entity.ShenqingshenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 申请审核
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShenqingshenheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 申请用户
     */
    private Integer yonghuId;


    /**
     * 申请岗位
     */
    private Integer gangweiId;


    /**
     * 申请类型
     */
    private Integer kaohepingjiaTypes;


    /**
     * 申请文件
     */
    private String shenqingshenheFile;


    /**
     * 审核状态
     */
    private Integer shenqingshenheTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：申请用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：申请用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申请岗位
	 */
    public Integer getGangweiId() {
        return gangweiId;
    }


    /**
	 * 设置：申请岗位
	 */
    public void setGangweiId(Integer gangweiId) {
        this.gangweiId = gangweiId;
    }
    /**
	 * 获取：申请类型
	 */
    public Integer getKaohepingjiaTypes() {
        return kaohepingjiaTypes;
    }


    /**
	 * 设置：申请类型
	 */
    public void setKaohepingjiaTypes(Integer kaohepingjiaTypes) {
        this.kaohepingjiaTypes = kaohepingjiaTypes;
    }
    /**
	 * 获取：申请文件
	 */
    public String getShenqingshenheFile() {
        return shenqingshenheFile;
    }


    /**
	 * 设置：申请文件
	 */
    public void setShenqingshenheFile(String shenqingshenheFile) {
        this.shenqingshenheFile = shenqingshenheFile;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getShenqingshenheTypes() {
        return shenqingshenheTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setShenqingshenheTypes(Integer shenqingshenheTypes) {
        this.shenqingshenheTypes = shenqingshenheTypes;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
