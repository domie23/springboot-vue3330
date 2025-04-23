package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XueshuzhoubaoDao;
import com.entity.XueshuzhoubaoEntity;
import com.service.XueshuzhoubaoService;
import com.entity.vo.XueshuzhoubaoVO;
import com.entity.view.XueshuzhoubaoView;

@Service("xueshuzhoubaoService")
public class XueshuzhoubaoServiceImpl extends ServiceImpl<XueshuzhoubaoDao, XueshuzhoubaoEntity> implements XueshuzhoubaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshuzhoubaoEntity> page = this.selectPage(
                new Query<XueshuzhoubaoEntity>(params).getPage(),
                new EntityWrapper<XueshuzhoubaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshuzhoubaoEntity> wrapper) {
		  Page<XueshuzhoubaoView> page =new Query<XueshuzhoubaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshuzhoubaoVO> selectListVO(Wrapper<XueshuzhoubaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshuzhoubaoVO selectVO(Wrapper<XueshuzhoubaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshuzhoubaoView> selectListView(Wrapper<XueshuzhoubaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshuzhoubaoView selectView(Wrapper<XueshuzhoubaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
