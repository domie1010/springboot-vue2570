package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.XinzifafangDao;
import com.entity.XinzifafangEntity;
import com.service.XinzifafangService;
import com.entity.view.XinzifafangView;

/**
 * 薪资发放 服务实现类
 */
@Service("xinzifafangService")
@Transactional
public class XinzifafangServiceImpl extends ServiceImpl<XinzifafangDao, XinzifafangEntity> implements XinzifafangService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<XinzifafangView> page =new Query<XinzifafangView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
