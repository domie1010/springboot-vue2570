package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ShenqingshenheEntity;

import com.service.ShenqingshenheService;
import com.entity.view.ShenqingshenheView;
import com.service.GangweiService;
import com.entity.GangweiEntity;
import com.service.YonghuService;
import com.entity.YonghuEntity;
import com.service.BumenguanliService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 申请审核
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shenqingshenhe")
public class ShenqingshenheController {
    private static final Logger logger = LoggerFactory.getLogger(ShenqingshenheController.class);

    @Autowired
    private ShenqingshenheService shenqingshenheService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private GangweiService gangweiService;
    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private BumenguanliService bumenguanliService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        else if("部门管理员".equals(role)){
            params.put("bumenguanliId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = shenqingshenheService.queryPage(params);

        //字典表数据转换
        List<ShenqingshenheView> list =(List<ShenqingshenheView>)page.getList();
        for(ShenqingshenheView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShenqingshenheEntity shenqingshenhe = shenqingshenheService.selectById(id);
        if(shenqingshenhe !=null){
            //entity转view
            ShenqingshenheView view = new ShenqingshenheView();
            BeanUtils.copyProperties( shenqingshenhe , view );//把实体数据重构到view中

            //级联表
            GangweiEntity gangwei = gangweiService.selectById(shenqingshenhe.getGangweiId());
            if(gangwei != null){
                BeanUtils.copyProperties( gangwei , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setGangweiId(gangwei.getId());
            }
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(shenqingshenhe.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShenqingshenheEntity shenqingshenhe, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shenqingshenhe:{}",this.getClass().getName(),shenqingshenhe.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("用户".equals(role)){
            shenqingshenhe.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        }
        Wrapper<ShenqingshenheEntity> queryWrapper = new EntityWrapper<ShenqingshenheEntity>()
            .eq("yonghu_id", shenqingshenhe.getYonghuId())
            .eq("gangwei_id", shenqingshenhe.getGangweiId())
            .eq("kaohepingjia_types", shenqingshenhe.getKaohepingjiaTypes())
            .eq("shenqingshenhe_types", shenqingshenhe.getShenqingshenheTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShenqingshenheEntity shenqingshenheEntity = shenqingshenheService.selectOne(queryWrapper);
        if(shenqingshenheEntity==null){
            shenqingshenhe.setInsertTime(new Date());
            shenqingshenhe.setCreateTime(new Date());
            shenqingshenheService.insert(shenqingshenhe);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShenqingshenheEntity shenqingshenhe, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shenqingshenhe:{}",this.getClass().getName(),shenqingshenhe.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("用户".equals(role)){
            shenqingshenhe.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        }
        //根据字段查询是否有相同数据
        Wrapper<ShenqingshenheEntity> queryWrapper = new EntityWrapper<ShenqingshenheEntity>()
            .notIn("id",shenqingshenhe.getId())
            .andNew()
            .eq("yonghu_id", shenqingshenhe.getYonghuId())
            .eq("gangwei_id", shenqingshenhe.getGangweiId())
            .eq("kaohepingjia_types", shenqingshenhe.getKaohepingjiaTypes())
            .eq("shenqingshenhe_types", shenqingshenhe.getShenqingshenheTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShenqingshenheEntity shenqingshenheEntity = shenqingshenheService.selectOne(queryWrapper);
        if("".equals(shenqingshenhe.getShenqingshenheFile()) || "null".equals(shenqingshenhe.getShenqingshenheFile())){
                shenqingshenhe.setShenqingshenheFile(null);
        }
        if(shenqingshenheEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      shenqingshenhe.set
            //  }
            shenqingshenheService.updateById(shenqingshenhe);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shenqingshenheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
    * 删除
    */
    @RequestMapping("/shenhe")
    public R shenhe(Integer ids,Integer shenhe){
        ShenqingshenheEntity shenqingshenheEntity = shenqingshenheService.selectById(ids);
        if(shenqingshenheEntity == null){
            return R.error();
        }
        if(shenhe == null){
            return R.error("审核状态不能为空");
        }
        shenqingshenheEntity.setShenqingshenheTypes(shenhe);
        boolean b = shenqingshenheService.updateById(shenqingshenheEntity);
        if(b){
            if(shenhe == 2){
                YonghuEntity yonghu = yonghuService.selectById(shenqingshenheEntity.getYonghuId());
                if(yonghu == null){
                    return R.error();
                }
                if(shenqingshenheEntity.getKaohepingjiaTypes() == 1){//入职
                    yonghu.setGangwei(shenqingshenheEntity.getGangweiId());
                }else {//离职
                    yonghu.setGangwei(0);
                }
                if(yonghuService.updateById(yonghu)){
                    return R.ok();
                }
            }else{
                return R.ok();
            }

        }
        return R.error();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        else if("部门管理员".equals(role)){
            params.put("bumenguanliId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = shenqingshenheService.queryPage(params);

        //字典表数据转换
        List<ShenqingshenheView> list =(List<ShenqingshenheView>)page.getList();
        for(ShenqingshenheView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShenqingshenheEntity shenqingshenhe = shenqingshenheService.selectById(id);
            if(shenqingshenhe !=null){
                //entity转view
                ShenqingshenheView view = new ShenqingshenheView();
                BeanUtils.copyProperties( shenqingshenhe , view );//把实体数据重构到view中

                //级联表
                    GangweiEntity gangwei = gangweiService.selectById(shenqingshenhe.getGangweiId());
                if(gangwei != null){
                    BeanUtils.copyProperties( gangwei , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setGangweiId(gangwei.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(shenqingshenhe.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShenqingshenheEntity shenqingshenhe, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shenqingshenhe:{}",this.getClass().getName(),shenqingshenhe.toString());
        Wrapper<ShenqingshenheEntity> queryWrapper = new EntityWrapper<ShenqingshenheEntity>()
            .eq("yonghu_id", shenqingshenhe.getYonghuId())
            .eq("gangwei_id", shenqingshenhe.getGangweiId())
            .eq("kaohepingjia_types", shenqingshenhe.getKaohepingjiaTypes())
            .eq("shenqingshenhe_types", shenqingshenhe.getShenqingshenheTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShenqingshenheEntity shenqingshenheEntity = shenqingshenheService.selectOne(queryWrapper);
        if(shenqingshenheEntity==null){
            shenqingshenhe.setInsertTime(new Date());
            shenqingshenhe.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      shenqingshenhe.set
        //  }
        shenqingshenheService.insert(shenqingshenhe);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }





}

