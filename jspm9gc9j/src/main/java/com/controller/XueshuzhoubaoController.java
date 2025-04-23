package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XueshuzhoubaoEntity;
import com.entity.view.XueshuzhoubaoView;

import com.service.XueshuzhoubaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 学术周报
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
@RestController
@RequestMapping("/xueshuzhoubao")
public class XueshuzhoubaoController {
    @Autowired
    private XueshuzhoubaoService xueshuzhoubaoService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshuzhoubaoEntity xueshuzhoubao, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshuzhoubao.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshuzhoubaoEntity> ew = new EntityWrapper<XueshuzhoubaoEntity>();
                if(faburiqistart!=null) ew.ge("faburiqi", faburiqistart);
                if(faburiqiend!=null) ew.le("faburiqi", faburiqiend);
    	PageUtils page = xueshuzhoubaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshuzhoubao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshuzhoubaoEntity xueshuzhoubao, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqiend,
		HttpServletRequest request){
        EntityWrapper<XueshuzhoubaoEntity> ew = new EntityWrapper<XueshuzhoubaoEntity>();
                if(faburiqistart!=null) ew.ge("faburiqi", faburiqistart);
                if(faburiqiend!=null) ew.le("faburiqi", faburiqiend);
    	PageUtils page = xueshuzhoubaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshuzhoubao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshuzhoubaoEntity xueshuzhoubao){
       	EntityWrapper<XueshuzhoubaoEntity> ew = new EntityWrapper<XueshuzhoubaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshuzhoubao, "xueshuzhoubao")); 
        return R.ok().put("data", xueshuzhoubaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshuzhoubaoEntity xueshuzhoubao){
        EntityWrapper< XueshuzhoubaoEntity> ew = new EntityWrapper< XueshuzhoubaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshuzhoubao, "xueshuzhoubao")); 
		XueshuzhoubaoView xueshuzhoubaoView =  xueshuzhoubaoService.selectView(ew);
		return R.ok("查询学术周报成功").put("data", xueshuzhoubaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshuzhoubaoEntity xueshuzhoubao = xueshuzhoubaoService.selectById(id);
        return R.ok().put("data", xueshuzhoubao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshuzhoubaoEntity xueshuzhoubao = xueshuzhoubaoService.selectById(id);
        return R.ok().put("data", xueshuzhoubao);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        XueshuzhoubaoEntity xueshuzhoubao = xueshuzhoubaoService.selectById(id);
        if(type.equals("1")) {
        	xueshuzhoubao.setThumbsupnum(xueshuzhoubao.getThumbsupnum()+1);
        } else {
        	xueshuzhoubao.setCrazilynum(xueshuzhoubao.getCrazilynum()+1);
        }
        xueshuzhoubaoService.updateById(xueshuzhoubao);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshuzhoubaoEntity xueshuzhoubao, HttpServletRequest request){
    	xueshuzhoubao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshuzhoubao);

        xueshuzhoubaoService.insert(xueshuzhoubao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshuzhoubaoEntity xueshuzhoubao, HttpServletRequest request){
    	xueshuzhoubao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshuzhoubao);

        xueshuzhoubaoService.insert(xueshuzhoubao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XueshuzhoubaoEntity xueshuzhoubao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshuzhoubao);
        xueshuzhoubaoService.updateById(xueshuzhoubao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshuzhoubaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XueshuzhoubaoEntity> wrapper = new EntityWrapper<XueshuzhoubaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = xueshuzhoubaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
