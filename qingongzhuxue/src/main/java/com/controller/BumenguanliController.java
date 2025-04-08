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

import com.entity.BumenguanliEntity;

import com.service.BumenguanliService;
import com.entity.view.BumenguanliView;
import com.service.YonghuService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 部门管理员
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/bumenguanli")
public class BumenguanliController {
    private static final Logger logger = LoggerFactory.getLogger(BumenguanliController.class);

    @Autowired
    private BumenguanliService bumenguanliService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private YonghuService yonghuService;


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
        PageUtils page = bumenguanliService.queryPage(params);

        //字典表数据转换
        List<BumenguanliView> list =(List<BumenguanliView>)page.getList();
        for(BumenguanliView c:list){
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
        BumenguanliEntity bumenguanli = bumenguanliService.selectById(id);
        if(bumenguanli !=null){
            //entity转view
            BumenguanliView view = new BumenguanliView();
            BeanUtils.copyProperties( bumenguanli , view );//把实体数据重构到view中

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
    public R save(@RequestBody BumenguanliEntity bumenguanli, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,bumenguanli:{}",this.getClass().getName(),bumenguanli.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        Wrapper<BumenguanliEntity> queryWrapper = new EntityWrapper<BumenguanliEntity>()
            .eq("username", bumenguanli.getUsername())
            .or()
            .eq("bumenguanli_phone", bumenguanli.getBumenguanliPhone())
            .or()
            .eq("bumenguanli_id_number", bumenguanli.getBumenguanliIdNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        BumenguanliEntity bumenguanliEntity = bumenguanliService.selectOne(queryWrapper);
        if(bumenguanliEntity==null){
            bumenguanli.setCreateTime(new Date());
            bumenguanli.setPassword("123456");
            bumenguanliService.insert(bumenguanli);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody BumenguanliEntity bumenguanli, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,bumenguanli:{}",this.getClass().getName(),bumenguanli.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        //根据字段查询是否有相同数据
        Wrapper<BumenguanliEntity> queryWrapper = new EntityWrapper<BumenguanliEntity>()
            .notIn("id",bumenguanli.getId())
            .andNew()
            .eq("username", bumenguanli.getUsername())
            .or()
            .eq("bumenguanli_phone", bumenguanli.getBumenguanliPhone())
            .or()
            .eq("bumenguanli_id_number", bumenguanli.getBumenguanliIdNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        BumenguanliEntity bumenguanliEntity = bumenguanliService.selectOne(queryWrapper);
        if("".equals(bumenguanli.getBumenguanliPhoto()) || "null".equals(bumenguanli.getBumenguanliPhoto())){
                bumenguanli.setBumenguanliPhoto(null);
        }
        if(bumenguanliEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      bumenguanli.set
            //  }
            bumenguanliService.updateById(bumenguanli);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        bumenguanliService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        BumenguanliEntity bumenguanli = bumenguanliService.selectOne(new EntityWrapper<BumenguanliEntity>().eq("username", username));
        if(bumenguanli==null || !bumenguanli.getPassword().equals(password)) {
            return R.error("账号或密码不正确");
        }
        //  // 获取监听器中的字典表
        // ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // Map<String, Map<Integer, String>> dictionaryMap= (Map<String, Map<Integer, String>>) servletContext.getAttribute("dictionaryMap");
        // Map<Integer, String> role_types = dictionaryMap.get("role_types");
        // role_types.get(yonghu.getRoleTypes());
        String token = tokenService.generateToken(bumenguanli.getId(),username, "bumenguanli", "部门管理员");
        R r = R.ok();
        r.put("token", token);
        r.put("role","部门管理员");
        r.put("username",bumenguanli.getBumenguanliName());
        r.put("tableName","bumenguanli");
        r.put("userId",bumenguanli.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody BumenguanliEntity bumenguanli){
    //    	ValidatorUtils.validateEntity(user);
        if(bumenguanliService.selectOne(new EntityWrapper<BumenguanliEntity>().eq("username", bumenguanli.getUsername()).orNew().eq("bumenguanli_phone",bumenguanli.getBumenguanliPhone()).orNew().eq("bumenguanli_id_number",bumenguanli.getBumenguanliIdNumber())) !=null) {
            return R.error("账户已存在或手机号或身份证号已经被使用");
        }
        bumenguanli.setCreateTime(new Date());
        bumenguanliService.insert(bumenguanli);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        BumenguanliEntity bumenguanli = new BumenguanliEntity();
        bumenguanli.setPassword("123456");
        bumenguanli.setId(id);
        bumenguanliService.updateById(bumenguanli);
        return R.ok();
    }

    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrBumenguanli(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        BumenguanliEntity bumenguanli = bumenguanliService.selectById(id);
        return R.ok().put("data", bumenguanli);
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
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
        PageUtils page = bumenguanliService.queryPage(params);

        //字典表数据转换
        List<BumenguanliView> list =(List<BumenguanliView>)page.getList();
        for(BumenguanliView c:list){
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
        BumenguanliEntity bumenguanli = bumenguanliService.selectById(id);
            if(bumenguanli !=null){
                //entity转view
                BumenguanliView view = new BumenguanliView();
                BeanUtils.copyProperties( bumenguanli , view );//把实体数据重构到view中

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
    public R add(@RequestBody BumenguanliEntity bumenguanli, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,bumenguanli:{}",this.getClass().getName(),bumenguanli.toString());
        Wrapper<BumenguanliEntity> queryWrapper = new EntityWrapper<BumenguanliEntity>()
            .eq("username", bumenguanli.getUsername())
            .or()
            .eq("bumenguanli_phone", bumenguanli.getBumenguanliPhone())
            .or()
            .eq("bumenguanli_id_number", bumenguanli.getBumenguanliIdNumber());
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        BumenguanliEntity bumenguanliEntity = bumenguanliService.selectOne(queryWrapper);
        if(bumenguanliEntity==null){
            bumenguanli.setCreateTime(new Date());
        bumenguanli.setPassword("123456");
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      bumenguanli.set
        //  }
        bumenguanliService.insert(bumenguanli);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }





}

