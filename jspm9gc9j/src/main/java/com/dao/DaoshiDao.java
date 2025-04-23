package com.dao;

import com.entity.DaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaoshiVO;
import com.entity.view.DaoshiView;


/**
 * 导师
 * 
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface DaoshiDao extends BaseMapper<DaoshiEntity> {
	
	List<DaoshiVO> selectListVO(@Param("ew") Wrapper<DaoshiEntity> wrapper);
	
	DaoshiVO selectVO(@Param("ew") Wrapper<DaoshiEntity> wrapper);
	
	List<DaoshiView> selectListView(@Param("ew") Wrapper<DaoshiEntity> wrapper);

	List<DaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<DaoshiEntity> wrapper);
	
	DaoshiView selectView(@Param("ew") Wrapper<DaoshiEntity> wrapper);
	

}
