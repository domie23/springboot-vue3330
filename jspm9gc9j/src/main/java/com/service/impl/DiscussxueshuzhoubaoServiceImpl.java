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


import com.dao.DiscussxueshuzhoubaoDao;
import com.entity.DiscussxueshuzhoubaoEntity;
import com.service.DiscussxueshuzhoubaoService;
import com.entity.vo.DiscussxueshuzhoubaoVO;
import com.entity.view.DiscussxueshuzhoubaoView;

@Service("discussxueshuzhoubaoService")
public class DiscussxueshuzhoubaoServiceImpl extends ServiceImpl<DiscussxueshuzhoubaoDao, DiscussxueshuzhoubaoEntity> implements DiscussxueshuzhoubaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxueshuzhoubaoEntity> page = this.selectPage(
                new Query<DiscussxueshuzhoubaoEntity>(params).getPage(),
                new EntityWrapper<DiscussxueshuzhoubaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxueshuzhoubaoEntity> wrapper) {
		  Page<DiscussxueshuzhoubaoView> page =new Query<DiscussxueshuzhoubaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxueshuzhoubaoVO> selectListVO(Wrapper<DiscussxueshuzhoubaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxueshuzhoubaoVO selectVO(Wrapper<DiscussxueshuzhoubaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxueshuzhoubaoView> selectListView(Wrapper<DiscussxueshuzhoubaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxueshuzhoubaoView selectView(Wrapper<DiscussxueshuzhoubaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
