package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaohepingjiaEntity;
import java.util.Map;

/**
 * 考核评价 服务类
 */
public interface KaohepingjiaService extends IService<KaohepingjiaEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}