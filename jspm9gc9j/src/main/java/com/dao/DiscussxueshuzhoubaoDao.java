package com.dao;

import com.entity.DiscussxueshuzhoubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxueshuzhoubaoVO;
import com.entity.view.DiscussxueshuzhoubaoView;


/**
 * 学术周报评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-11 20:34:36
 */
public interface DiscussxueshuzhoubaoDao extends BaseMapper<DiscussxueshuzhoubaoEntity> {
	
	List<DiscussxueshuzhoubaoVO> selectListVO(@Param("ew") Wrapper<DiscussxueshuzhoubaoEntity> wrapper);
	
	DiscussxueshuzhoubaoVO selectVO(@Param("ew") Wrapper<DiscussxueshuzhoubaoEntity> wrapper);
	
	List<DiscussxueshuzhoubaoView> selectListView(@Param("ew") Wrapper<DiscussxueshuzhoubaoEntity> wrapper);

	List<DiscussxueshuzhoubaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxueshuzhoubaoEntity> wrapper);
	
	DiscussxueshuzhoubaoView selectView(@Param("ew") Wrapper<DiscussxueshuzhoubaoEntity> wrapper);
	

}
