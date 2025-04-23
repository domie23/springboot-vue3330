package com.dao;

import com.entity.XueshuzhoubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshuzhoubaoVO;
import com.entity.view.XueshuzhoubaoView;


/**
 * 学术周报
 * 
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface XueshuzhoubaoDao extends BaseMapper<XueshuzhoubaoEntity> {
	
	List<XueshuzhoubaoVO> selectListVO(@Param("ew") Wrapper<XueshuzhoubaoEntity> wrapper);
	
	XueshuzhoubaoVO selectVO(@Param("ew") Wrapper<XueshuzhoubaoEntity> wrapper);
	
	List<XueshuzhoubaoView> selectListView(@Param("ew") Wrapper<XueshuzhoubaoEntity> wrapper);

	List<XueshuzhoubaoView> selectListView(Pagination page,@Param("ew") Wrapper<XueshuzhoubaoEntity> wrapper);
	
	XueshuzhoubaoView selectView(@Param("ew") Wrapper<XueshuzhoubaoEntity> wrapper);
	

}
