package com.entity.view;

import com.entity.GangweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 岗位信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gangwei")
public class GangweiView extends GangweiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 岗位类型的值
		*/
		private String gangweiValue;



	public GangweiView() {

	}

	public GangweiView(GangweiEntity gangweiEntity) {
		try {
			BeanUtils.copyProperties(this, gangweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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












}
