package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyileixingView;


/**
 * 会议类型
 *
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface HuiyileixingService extends IService<HuiyileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyileixingVO> selectListVO(Wrapper<HuiyileixingEntity> wrapper);
   	
   	HuiyileixingVO selectVO(@Param("ew") Wrapper<HuiyileixingEntity> wrapper);
   	
   	List<HuiyileixingView> selectListView(Wrapper<HuiyileixingEntity> wrapper);
   	
   	HuiyileixingView selectView(@Param("ew") Wrapper<HuiyileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyileixingEntity> wrapper);
   	

}

