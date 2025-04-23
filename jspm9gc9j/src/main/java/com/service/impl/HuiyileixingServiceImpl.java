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


import com.dao.HuiyileixingDao;
import com.entity.HuiyileixingEntity;
import com.service.HuiyileixingService;
import com.entity.vo.HuiyileixingVO;
import com.entity.view.HuiyileixingView;

@Service("huiyileixingService")
public class HuiyileixingServiceImpl extends ServiceImpl<HuiyileixingDao, HuiyileixingEntity> implements HuiyileixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyileixingEntity> page = this.selectPage(
                new Query<HuiyileixingEntity>(params).getPage(),
                new EntityWrapper<HuiyileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyileixingEntity> wrapper) {
		  Page<HuiyileixingView> page =new Query<HuiyileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyileixingVO> selectListVO(Wrapper<HuiyileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyileixingVO selectVO(Wrapper<HuiyileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyileixingView> selectListView(Wrapper<HuiyileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyileixingView selectView(Wrapper<HuiyileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
