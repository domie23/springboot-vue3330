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


import com.dao.QuerenshoudaoDao;
import com.entity.QuerenshoudaoEntity;
import com.service.QuerenshoudaoService;
import com.entity.vo.QuerenshoudaoVO;
import com.entity.view.QuerenshoudaoView;

@Service("querenshoudaoService")
public class QuerenshoudaoServiceImpl extends ServiceImpl<QuerenshoudaoDao, QuerenshoudaoEntity> implements QuerenshoudaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuerenshoudaoEntity> page = this.selectPage(
                new Query<QuerenshoudaoEntity>(params).getPage(),
                new EntityWrapper<QuerenshoudaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuerenshoudaoEntity> wrapper) {
		  Page<QuerenshoudaoView> page =new Query<QuerenshoudaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuerenshoudaoVO> selectListVO(Wrapper<QuerenshoudaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuerenshoudaoVO selectVO(Wrapper<QuerenshoudaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuerenshoudaoView> selectListView(Wrapper<QuerenshoudaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuerenshoudaoView selectView(Wrapper<QuerenshoudaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
