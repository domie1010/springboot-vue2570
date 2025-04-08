package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BumenguanliEntity;
import java.util.Map;

/**
 * 部门管理员 服务类
 */
public interface BumenguanliService extends IService<BumenguanliEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}