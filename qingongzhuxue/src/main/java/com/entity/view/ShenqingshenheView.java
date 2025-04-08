package com.entity.view;

import com.entity.ShenqingshenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 申请审核
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shenqingshenhe")
public class ShenqingshenheView extends ShenqingshenheEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 申请类型的值
		*/
		private String kaohepingjiaValue;
		/**
		* 审核状态的值
		*/
		private String shenqingshenheValue;



		//级联表 gangwei
			/**
			* 岗位名称
			*/
			private String gangweiName;
			/**
			* 岗位类型
			*/
			private Integer gangweiTypes;
				/**
				* 岗位类型的值
				*/
				private String gangweiValue;
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 岗位信息
			*/
			private Integer gangwei;

	public ShenqingshenheView() {

	}

	public ShenqingshenheView(ShenqingshenheEntity shenqingshenheEntity) {
		try {
			BeanUtils.copyProperties(this, shenqingshenheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 申请类型的值
			*/
			public String getKaohepingjiaValue() {
				return kaohepingjiaValue;
			}
			/**
			* 设置： 申请类型的值
			*/
			public void setKaohepingjiaValue(String kaohepingjiaValue) {
				this.kaohepingjiaValue = kaohepingjiaValue;
			}
			/**
			* 获取： 审核状态的值
			*/
			public String getShenqingshenheValue() {
				return shenqingshenheValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setShenqingshenheValue(String shenqingshenheValue) {
				this.shenqingshenheValue = shenqingshenheValue;
			}











				//级联表的get和set gangwei
					/**
					* 获取： 岗位名称
					*/
					public String getGangweiName() {
						return gangweiName;
					}
					/**
					* 设置： 岗位名称
					*/
					public void setGangweiName(String gangweiName) {
						this.gangweiName = gangweiName;
					}
					/**
					* 获取： 岗位类型
					*/
					public Integer getGangweiTypes() {
						return gangweiTypes;
					}
					/**
					* 设置： 岗位类型
					*/
					public void setGangweiTypes(Integer gangweiTypes) {
						this.gangweiTypes = gangweiTypes;
					}


						/**
						* 获取： 岗位类型的值
						*/
						public String getGangweiValue() {
							return gangweiValue;
						}
						/**
						* 设置： 岗位类型的值
						*/
						public void setGangweiValue(String gangweiValue) {
							this.gangweiValue = gangweiValue;
						}
					/**
					* 获取： 岗位薪资
					*/
					public Double getGangweiMoney() {
						return gangweiMoney;
					}
					/**
					* 设置： 岗位薪资
					*/
					public void setGangweiMoney(Double gangweiMoney) {
						this.gangweiMoney = gangweiMoney;
					}
					/**
					* 获取： 岗位要求
					*/
					public String getGangweiYaoqiu() {
						return gangweiYaoqiu;
					}
					/**
					* 设置： 岗位要求
					*/
					public void setGangweiYaoqiu(String gangweiYaoqiu) {
						this.gangweiYaoqiu = gangweiYaoqiu;
					}
					/**
					* 获取： 工作时间/时
					*/
					public Integer getGangweiShijian() {
						return gangweiShijian;
					}
					/**
					* 设置： 工作时间/时
					*/
					public void setGangweiShijian(Integer gangweiShijian) {
						this.gangweiShijian = gangweiShijian;
					}
					/**
					* 获取： 岗位介绍
					*/
					public String getGangweiContent() {
						return gangweiContent;
					}
					/**
					* 设置： 岗位介绍
					*/
					public void setGangweiContent(String gangweiContent) {
						this.gangweiContent = gangweiContent;
					}

















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 岗位信息
					*/
					public Integer getGangwei() {
						return gangwei;
					}
					/**
					* 设置： 岗位信息
					*/
					public void setGangwei(Integer gangwei) {
						this.gangwei = gangwei;
					}




}
