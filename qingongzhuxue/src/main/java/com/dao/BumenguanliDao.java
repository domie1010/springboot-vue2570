package com.dao;

import com.entity.BumenguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BumenguanliView;

/**
 * 部门管理员 Dao 接口
 *
 * @author 
 */
public interface BumenguanliDao extends BaseMapper<BumenguanliEntity> {

   List<BumenguanliView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
