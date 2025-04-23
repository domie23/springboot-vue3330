package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxueshuzhoubaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxueshuzhoubaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxueshuzhoubaoView;


/**
 * 学术周报评论表
 *
 * @author 
 * @email 
 * @date 2022-04-11 20:34:36
 */
public interface DiscussxueshuzhoubaoService extends IService<DiscussxueshuzhoubaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxueshuzhoubaoVO> selectListVO(Wrapper<DiscussxueshuzhoubaoEntity> wrapper);
   	
   	DiscussxueshuzhoubaoVO selectVO(@Param("ew") Wrapper<DiscussxueshuzhoubaoEntity> wrapper);
   	
   	List<DiscussxueshuzhoubaoView> selectListView(Wrapper<DiscussxueshuzhoubaoEntity> wrapper);
   	
   	DiscussxueshuzhoubaoView selectView(@Param("ew") Wrapper<DiscussxueshuzhoubaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxueshuzhoubaoEntity> wrapper);
   	

}

