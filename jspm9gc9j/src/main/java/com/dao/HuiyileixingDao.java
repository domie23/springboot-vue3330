package com.dao;

import com.entity.HuiyileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyileixingVO;
import com.entity.view.HuiyileixingView;


/**
 * 会议类型
 * 
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface HuiyileixingDao extends BaseMapper<HuiyileixingEntity> {
	
	List<HuiyileixingVO> selectListVO(@Param("ew") Wrapper<HuiyileixingEntity> wrapper);
	
	HuiyileixingVO selectVO(@Param("ew") Wrapper<HuiyileixingEntity> wrapper);
	
	List<HuiyileixingView> selectListView(@Param("ew") Wrapper<HuiyileixingEntity> wrapper);

	List<HuiyileixingView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyileixingEntity> wrapper);
	
	HuiyileixingView selectView(@Param("ew") Wrapper<HuiyileixingEntity> wrapper);
	

}
