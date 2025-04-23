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


import com.dao.DaoshiDao;
import com.entity.DaoshiEntity;
import com.service.DaoshiService;
import com.entity.vo.DaoshiVO;
import com.entity.view.DaoshiView;

@Service("daoshiService")
public class DaoshiServiceImpl extends ServiceImpl<DaoshiDao, DaoshiEntity> implements DaoshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaoshiEntity> page = this.selectPage(
                new Query<DaoshiEntity>(params).getPage(),
                new EntityWrapper<DaoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaoshiEntity> wrapper) {
		  Page<DaoshiView> page =new Query<DaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaoshiVO> selectListVO(Wrapper<DaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaoshiVO selectVO(Wrapper<DaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaoshiView> selectListView(Wrapper<DaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaoshiView selectView(Wrapper<DaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
