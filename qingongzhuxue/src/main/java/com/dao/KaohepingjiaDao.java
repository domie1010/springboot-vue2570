package com.dao;

import com.entity.KaohepingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KaohepingjiaView;

/**
 * 考核评价 Dao 接口
 *
 * @author 
 */
public interface KaohepingjiaDao extends BaseMapper<KaohepingjiaEntity> {

   List<KaohepingjiaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
