package com.dao;

import com.entity.XueshengqiandaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengqiandaoVO;
import com.entity.view.XueshengqiandaoView;


/**
 * 学生签到
 * 
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface XueshengqiandaoDao extends BaseMapper<XueshengqiandaoEntity> {
	
	List<XueshengqiandaoVO> selectListVO(@Param("ew") Wrapper<XueshengqiandaoEntity> wrapper);
	
	XueshengqiandaoVO selectVO(@Param("ew") Wrapper<XueshengqiandaoEntity> wrapper);
	
	List<XueshengqiandaoView> selectListView(@Param("ew") Wrapper<XueshengqiandaoEntity> wrapper);

	List<XueshengqiandaoView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengqiandaoEntity> wrapper);
	
	XueshengqiandaoView selectView(@Param("ew") Wrapper<XueshengqiandaoEntity> wrapper);
	

}
