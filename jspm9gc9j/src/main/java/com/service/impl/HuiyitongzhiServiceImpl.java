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


import com.dao.HuiyitongzhiDao;
import com.entity.HuiyitongzhiEntity;
import com.service.HuiyitongzhiService;
import com.entity.vo.HuiyitongzhiVO;
import com.entity.view.HuiyitongzhiView;

@Service("huiyitongzhiService")
public class HuiyitongzhiServiceImpl extends ServiceImpl<HuiyitongzhiDao, HuiyitongzhiEntity> implements HuiyitongzhiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyitongzhiEntity> page = this.selectPage(
                new Query<HuiyitongzhiEntity>(params).getPage(),
                new EntityWrapper<HuiyitongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyitongzhiEntity> wrapper) {
		  Page<HuiyitongzhiView> page =new Query<HuiyitongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyitongzhiVO> selectListVO(Wrapper<HuiyitongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyitongzhiVO selectVO(Wrapper<HuiyitongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyitongzhiView> selectListView(Wrapper<HuiyitongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyitongzhiView selectView(Wrapper<HuiyitongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
