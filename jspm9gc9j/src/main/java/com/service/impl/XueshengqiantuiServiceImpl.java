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


import com.dao.XueshengqiantuiDao;
import com.entity.XueshengqiantuiEntity;
import com.service.XueshengqiantuiService;
import com.entity.vo.XueshengqiantuiVO;
import com.entity.view.XueshengqiantuiView;

@Service("xueshengqiantuiService")
public class XueshengqiantuiServiceImpl extends ServiceImpl<XueshengqiantuiDao, XueshengqiantuiEntity> implements XueshengqiantuiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengqiantuiEntity> page = this.selectPage(
                new Query<XueshengqiantuiEntity>(params).getPage(),
                new EntityWrapper<XueshengqiantuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengqiantuiEntity> wrapper) {
		  Page<XueshengqiantuiView> page =new Query<XueshengqiantuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengqiantuiVO> selectListVO(Wrapper<XueshengqiantuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengqiantuiVO selectVO(Wrapper<XueshengqiantuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengqiantuiView> selectListView(Wrapper<XueshengqiantuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengqiantuiView selectView(Wrapper<XueshengqiantuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
