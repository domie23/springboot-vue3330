package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshuzhoubaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshuzhoubaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshuzhoubaoView;


/**
 * 学术周报
 *
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface XueshuzhoubaoService extends IService<XueshuzhoubaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshuzhoubaoVO> selectListVO(Wrapper<XueshuzhoubaoEntity> wrapper);
   	
   	XueshuzhoubaoVO selectVO(@Param("ew") Wrapper<XueshuzhoubaoEntity> wrapper);
   	
   	List<XueshuzhoubaoView> selectListView(Wrapper<XueshuzhoubaoEntity> wrapper);
   	
   	XueshuzhoubaoView selectView(@Param("ew") Wrapper<XueshuzhoubaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshuzhoubaoEntity> wrapper);
   	

}

