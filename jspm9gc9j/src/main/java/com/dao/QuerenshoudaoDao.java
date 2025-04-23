package com.dao;

import com.entity.QuerenshoudaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuerenshoudaoVO;
import com.entity.view.QuerenshoudaoView;


/**
 * 确认收到
 * 
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface QuerenshoudaoDao extends BaseMapper<QuerenshoudaoEntity> {
	
	List<QuerenshoudaoVO> selectListVO(@Param("ew") Wrapper<QuerenshoudaoEntity> wrapper);
	
	QuerenshoudaoVO selectVO(@Param("ew") Wrapper<QuerenshoudaoEntity> wrapper);
	
	List<QuerenshoudaoView> selectListView(@Param("ew") Wrapper<QuerenshoudaoEntity> wrapper);

	List<QuerenshoudaoView> selectListView(Pagination page,@Param("ew") Wrapper<QuerenshoudaoEntity> wrapper);
	
	QuerenshoudaoView selectView(@Param("ew") Wrapper<QuerenshoudaoEntity> wrapper);
	

}
