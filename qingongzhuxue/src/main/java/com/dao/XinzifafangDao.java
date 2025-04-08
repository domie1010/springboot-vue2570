package com.dao;

import com.entity.XinzifafangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XinzifafangView;

/**
 * 薪资发放 Dao 接口
 *
 * @author 
 */
public interface XinzifafangDao extends BaseMapper<XinzifafangEntity> {

   List<XinzifafangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
