package com.dao;

import com.entity.XueshengqiantuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengqiantuiVO;
import com.entity.view.XueshengqiantuiView;


/**
 * 学生签退
 * 
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface XueshengqiantuiDao extends BaseMapper<XueshengqiantuiEntity> {
	
	List<XueshengqiantuiVO> selectListVO(@Param("ew") Wrapper<XueshengqiantuiEntity> wrapper);
	
	XueshengqiantuiVO selectVO(@Param("ew") Wrapper<XueshengqiantuiEntity> wrapper);
	
	List<XueshengqiantuiView> selectListView(@Param("ew") Wrapper<XueshengqiantuiEntity> wrapper);

	List<XueshengqiantuiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengqiantuiEntity> wrapper);
	
	XueshengqiantuiView selectView(@Param("ew") Wrapper<XueshengqiantuiEntity> wrapper);
	

}
