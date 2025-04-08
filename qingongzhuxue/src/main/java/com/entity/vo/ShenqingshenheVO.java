package com.entity.vo;

import com.entity.ShenqingshenheEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 申请审核
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shenqingshenhe")
public class ShenqingshenheVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


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

}
