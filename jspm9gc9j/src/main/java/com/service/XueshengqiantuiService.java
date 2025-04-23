package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengqiantuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengqiantuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengqiantuiView;


/**
 * 学生签退
 *
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface XueshengqiantuiService extends IService<XueshengqiantuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengqiantuiVO> selectListVO(Wrapper<XueshengqiantuiEntity> wrapper);
   	
   	XueshengqiantuiVO selectVO(@Param("ew") Wrapper<XueshengqiantuiEntity> wrapper);
   	
   	List<XueshengqiantuiView> selectListView(Wrapper<XueshengqiantuiEntity> wrapper);
   	
   	XueshengqiantuiView selectView(@Param("ew") Wrapper<XueshengqiantuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengqiantuiEntity> wrapper);
   	

}

