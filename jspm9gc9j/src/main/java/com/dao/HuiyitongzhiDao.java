package com.dao;

import com.entity.HuiyitongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyitongzhiVO;
import com.entity.view.HuiyitongzhiView;


/**
 * 会议通知
 * 
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface HuiyitongzhiDao extends BaseMapper<HuiyitongzhiEntity> {
	
	List<HuiyitongzhiVO> selectListVO(@Param("ew") Wrapper<HuiyitongzhiEntity> wrapper);
	
	HuiyitongzhiVO selectVO(@Param("ew") Wrapper<HuiyitongzhiEntity> wrapper);
	
	List<HuiyitongzhiView> selectListView(@Param("ew") Wrapper<HuiyitongzhiEntity> wrapper);

	List<HuiyitongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyitongzhiEntity> wrapper);
	
	HuiyitongzhiView selectView(@Param("ew") Wrapper<HuiyitongzhiEntity> wrapper);
	

}
