package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GangweiEntity;
import java.util.Map;

/**
 * 岗位信息 服务类
 */
public interface GangweiService extends IService<GangweiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}